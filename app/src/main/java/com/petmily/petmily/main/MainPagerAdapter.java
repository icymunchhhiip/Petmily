package com.petmily.petmily.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.petmily.petmily.main.community.CommunityFragment;
import com.petmily.petmily.main.home.HomeFragment;
import com.petmily.petmily.main.notification.NotificationFragment;
import com.petmily.petmily.main.setting.SettingFragment;

public class MainPagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_ITEMS_MAIN_PAGER = 4;
    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_NOTI = 1;
    private static final int FRAGMENT_COMMUNITY = 2;
    private static final int FRAGMENT_SETTING = 3;

    public MainPagerAdapter(FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case FRAGMENT_HOME:
                return HomeFragment.getInstance();
            case FRAGMENT_NOTI:
                return NotificationFragment.getInstance();
            case FRAGMENT_COMMUNITY:
                return CommunityFragment.getInstance();
            case FRAGMENT_SETTING:
                return SettingFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS_MAIN_PAGER;
    }



}
