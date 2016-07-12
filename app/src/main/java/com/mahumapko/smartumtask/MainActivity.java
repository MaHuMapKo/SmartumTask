package com.mahumapko.smartumtask;

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

import com.mahumapko.smartumtask.adapters.ViewPagerAdapter;
import com.mahumapko.smartumtask.fragments.ShopsDescription;
import com.mahumapko.smartumtask.fragments.DevelopDialog;
import com.mahumapko.smartumtask.fragments.MyPresents;
import com.mahumapko.smartumtask.fragments.Presents;
import com.mahumapko.smartumtask.POJO.ClientCard.Card;
import com.mahumapko.smartumtask.POJO.ClientCard.CardDto;
import com.mahumapko.smartumtask.POJO.ClientCard.Shop;
import com.squareup.picasso.Picasso;

import java.util.List;



public class MainActivity extends AppCompatActivity {
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
        Card card = new JSONConverter().getCard(this);
        getCardData(card);
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
        adapter.addFragment(new ShopsDescription(), getString(R.string.aboutUsTitle));
        adapter.addFragment(new Presents(), getString(R.string.presentsTitle));
        adapter.addFragment(new MyPresents(), getString(R.string.myPresentsTitle));
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

        Picasso.with(this)
                .load(imagePath)
                .placeholder(R.mipmap.ic_launcher)
                .resize(100, 100)
                .centerCrop()
                .into(view);
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
        ((ShopsDescription) adapter.getItem(0)).setShopsList(list);
    }

}

