package com.taran.parseproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int TabPosition) {
        switch (TabPosition){
            case 0:
                Channel channel = new Channel();
                return channel;

            case 1:
                return new Group();

            case 2:
                return new Pv();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 0;
    }
}
