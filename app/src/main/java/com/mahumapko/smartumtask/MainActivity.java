package com.mahumapko.smartumtask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


public class MainActivity extends AppCompatActivity {
    public static List<String> images = new ArrayList<>();
    static ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!Util.isNetworkConnected(this)) {
            Toast.makeText(this, getString(R.string.noInternet), Toast.LENGTH_LONG).show();
        }

        setClickers();

        setupTabLayout();
        Card card = JSONConverter.convertCardJson(this);
        getCardData(card);
        images = JSONConverter.getImagesFromPresents(this, images);
        images = JSONConverter.getImagesFromMyPresents(this, images);

        new DownloadImages(this, images, true).execute();
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
        new DownloadImages(this, imagePath, false, view).execute();
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
k
    private void sentShopsListToFragment(List<Shop> list) {
        ((AboutUsFragment) adapter.getItem(0)).setListAndConvert(list);
    }

    public static class DownloadImages extends AsyncTask<Void, Void, Void> {
        List<String> images = new ArrayList<>();
        Context context;
        boolean isMupltiple;
        String image;
        ImageView view;

        public DownloadImages(Context context, List<String> images, boolean isMupltiple) {
            this.images = images;
            this.context = context;
            this.isMupltiple = isMupltiple;
        }

        public DownloadImages(Context context, String image, boolean isMupltiple, ImageView view) {
            this.context = context;
            this.image = image;
            this.isMupltiple = isMupltiple;
            this.view = view;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            if (isMupltiple) {
                for (int i = 0; i < images.size(); i++) {
                    String imagePath = images.get(i);
                    downloadImage(imagePath, 8);
                }
            } else {
                downloadImage(image, 2);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            if (isMupltiple) {
                ((PresentsFragment) adapter.getItem(1)).getPresentsAdapter().notifyDataSetChanged();
                ((MyPresentsFragment) adapter.getItem(2)).getMyPresentsAdapter().notifyDataSetChanged();
            } else {
                File file = new File(context.getFilesDir(), Util.getFileName(image));
                Uri uri = Uri.fromFile(file);
                view.setImageURI(uri);
            }
        }

        private void downloadImage(String imagePath, int sampleSize) {
            HttpsURLConnection urlConnection = null;
            try {
                if (imagePath != null) {
                    String[] splittedPath = imagePath.split("/");
                    String fileName = splittedPath[splittedPath.length - 1];

                    URL url = new URL(imagePath);
                    urlConnection = (HttpsURLConnection) url.openConnection();
                    urlConnection.setRequestMethod("GET");
                    urlConnection.connect();

                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = sampleSize;
                    InputStream input = urlConnection.getInputStream();
                    Bitmap bitmap = BitmapFactory.decodeStream(input, null, options);

                    if (bitmap != null) {
                        OutputStream outStream = null;
                        try {
                            File file = new File(context.getFilesDir(), fileName);

                            outStream = new FileOutputStream(file);
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outStream);
                            outStream.flush();
                            outStream.close();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }
    }
}

