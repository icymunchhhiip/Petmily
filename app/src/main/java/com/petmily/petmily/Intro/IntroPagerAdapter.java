package com.petmily.petmily.Intro;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.petmily.petmily.Intro.contents.GPSFragment;
import com.petmily.petmily.Intro.contents.HealthFragment;
import com.petmily.petmily.Intro.contents.LEDFragment;

public class IntroPagerAdapter extends FragmentPagerAdapter {
    private static final int NUM_ITEMS_INTRO_PAGER = 3;
    private static final int FRAGMENT_HEALTH = 0;
    private static final int FRAGMENT_GPS = 1;
    private static final int FRAGMENT_LED = 2;

    public IntroPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case FRAGMENT_HEALTH:
                return HealthFragment.getInstance();
            case FRAGMENT_GPS:
                return GPSFragment.getInstance();
            case FRAGMENT_LED:
                return LEDFragment.getInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS_INTRO_PAGER;
    }


}
