package com.taran.parseproject;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class SocialMedia extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabAdapter tabAdapter;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        setTitle("social media App");
        toolbar = findViewById(R.id.myToolbar);
        viewPager = findViewById(R.id.viewPager);
        tabAdapter = new TabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager , true);
    }
}