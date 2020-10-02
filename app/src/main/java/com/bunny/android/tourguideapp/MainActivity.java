package com.bunny.android.tourguideapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewpager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewpager = findViewById(R.id.view_pager);
        adapter = new ViewPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new PopularBarsFragment(), getString(R.string.tab_1_title));
        adapter.addFragment(new PlacesToEatFragment(), getString(R.string.tab_2_title));
        adapter.addFragment(new ParksFragment(), getString(R.string.tab_3_title));
        adapter.addFragment(new AttractionsFragment(), getString(R.string.tab_4_title));

        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
