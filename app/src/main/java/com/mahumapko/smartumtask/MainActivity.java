package com.mahumapko.smartumtask;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mahumapko.smartumtask.Adapters.ViewPagerAdapter;
import com.mahumapko.smartumtask.Fragments.AboutUsFragment;
import com.mahumapko.smartumtask.Fragments.MyPresentsFragment;
import com.mahumapko.smartumtask.Fragments.PresentsFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupTabLayout();
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
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AboutUsFragment(), getString(R.string.aboutUsTitle));
        adapter.addFragment(new PresentsFragment(), getString(R.string.presentsTitle));
        adapter.addFragment(new MyPresentsFragment(), getString(R.string.myPresentsTitle));
        viewPager.setAdapter(adapter);
    }
}
