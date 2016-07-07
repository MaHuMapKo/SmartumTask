package com.mahumapko.smartumtask;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mahumapko.smartumtask.Adapters.ViewPagerAdapter;
import com.mahumapko.smartumtask.Fragments.AboutUsFragment;
import com.mahumapko.smartumtask.Fragments.DevelopDialog;
import com.mahumapko.smartumtask.Fragments.MyPresentsFragment;
import com.mahumapko.smartumtask.Fragments.PresentsFragment;
import com.mahumapko.smartumtask.POJO.ClientCard.Card;
import com.mahumapko.smartumtask.POJO.ClientCard.CardDto;
import com.mahumapko.smartumtask.POJO.ClientCard.Shop;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


public class MainActivity extends AppCompatActivity {
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!isNetworkConnected()) {
            Toast.makeText(this, getString(R.string.noInternet), Toast.LENGTH_LONG).show();
        }

        setClickers();



        setupTabLayout();
        convertCardJson();
    }

    private void setClickers() {
        Button button = (Button) findViewById(R.id.showCode);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DevelopDialog dialog = new DevelopDialog();
                dialog.show(getSupportFragmentManager(), "DialogFragment");
            }
        });

        ProgressBar bar = (ProgressBar) findViewById(R.id.discount_progress);
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DevelopDialog dialog = new DevelopDialog();
                dialog.show(getSupportFragmentManager(), "DialogFragment");
            }
        });
    }

    private void setupTabLayout() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AboutUsFragment(), getString(R.string.aboutUsTitle));
        adapter.addFragment(new PresentsFragment(), getString(R.string.presentsTitle));
        adapter.addFragment(new MyPresentsFragment(), getString(R.string.myPresentsTitle));
        viewPager.setAdapter(adapter);
    }

    public void convertCardJson() {
        AssetManager am = getResources().getAssets();
        String json;
        try {
            InputStream is = am.open("clientCard.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, Charset.forName("UTF-8"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().create();
        Card card = gson.fromJson(json, Card.class);
        getCardData(card);

    }

    private void getCardData(Card card) {
        CardDto cardDto = card.getCardDto();

        String name = cardDto.getName();
        String imagePath = cardDto.getPhotoPath();

        Double discount = cardDto.getDiscount();
        Integer scores = card.getScoreBalance();
        Double nextDiscount = card.getNextDiscount();
        Double untilNextDiscount = card.getUntilNextDiscount();

        putDataInToolbar(name, discount, scores, nextDiscount, untilNextDiscount);

        List<Shop> shops = cardDto.getShops();
        sentShopsListToFragment(shops);

        ImageView view = (ImageView) findViewById(R.id.cardImage);
        checkForImage(imagePath, view);
    }

    private void putDataInToolbar(String name, Double discount, Integer scores, Double nextDiscount,
                                  Double untilNextDiscount) {
        TextView discountView = (TextView) findViewById(R.id.discount);
        discountView.setText(String.format(" %s ", discount));

        TextView scoresView = (TextView) findViewById(R.id.score);
        scoresView.setText(String.format(" %s", scores));

        TextView nextDiscountView = (TextView) findViewById(R.id.next_discount);
        String formattedDiscount = String.format("%s %s", getString(R.string.left_before),
                nextDiscount);
        formattedDiscount+="%";
        formattedDiscount=String.format("%s - %s %s", formattedDiscount, untilNextDiscount,
                getString(R.string.rub));
        nextDiscountView.setText(formattedDiscount);

        getSupportActionBar().setTitle(name);
    }

    private void sentShopsListToFragment(List<Shop> list) {
        ((AboutUsFragment) adapter.getItem(0)).setListAndConvert(list);
    }

    public void checkForImage(String imagePath, ImageView view) {
        if (imagePath!=null) {
            String[] splittedPath = imagePath.split("/");
            String fileName = splittedPath[splittedPath.length - 1];

            File file = new File(getFilesDir(), fileName);
            if (!file.exists()) {
                if (isNetworkConnected()) {
                    int samplesize;
                    if (view.getId() == R.id.cardImage)
                        samplesize = 2;
                    else
                        samplesize = 8;
                    DownloadImageTask downloadImageTask = new DownloadImageTask(this, imagePath, fileName,
                            view, samplesize);
                    downloadImageTask.execute();
                } else
                    view.setImageDrawable(getDrawable(R.mipmap.ic_launcher));
            } else {
                Uri uri = Uri.fromFile(file);
                view.setImageURI(uri);
            }
        } else {
            view.setImageDrawable(getDrawable(R.mipmap.ic_launcher));
        }
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

    public static class DownloadImageTask extends AsyncTask<Void, Void, Void> {
        Context context;
        String imagePath, fileName;
        Bitmap bitmap;
        ImageView view;
        int sampleSize;

        public DownloadImageTask(Context context, String imagePath, String fileName, ImageView view,
                                 int sampleSize) {
            this.context = context;
            this.imagePath = imagePath;
            this.fileName = fileName;
            this.view = view;
            this.sampleSize = sampleSize;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            HttpsURLConnection urlConnection = null;
            try {
                URL url = new URL(imagePath);
                urlConnection = (HttpsURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = sampleSize;
                InputStream input = urlConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(input, null, options);
                return null;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            if (bitmap!=null) {
                OutputStream outStream = null;
                try {
                    File file = new File(context.getFilesDir(), fileName);

                    outStream = new FileOutputStream(file);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outStream);
                    outStream.flush();
                    outStream.close();

                    Uri uri = Uri.fromFile(file);
                    view.setImageURI(uri);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

