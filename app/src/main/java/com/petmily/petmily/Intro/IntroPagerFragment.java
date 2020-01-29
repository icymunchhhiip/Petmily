package com.petmily.petmily.Intro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import com.petmily.petmily.R;

public class IntroPagerFragment extends Fragment {
    private IntroPagerAdapter mIntroPagerAdapter;
    private FloatingActionButton mFloatingActionButton;
    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.intro_pager, container, false);
        ViewPager mViewPager = mView.findViewById(R.id.intro_view_pager);
        TabLayout tabLayout = mView.findViewById(R.id.dot_indicator);
        mFloatingActionButton = mView.findViewById(R.id.intro_next_btn);
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action = IntroPagerFragmentDirections
                        .actionIntroPagerFragmentToPermitDescFragment();
                Navigation.findNavController(mView).navigate(action);
            }
        });

        mIntroPagerAdapter = new IntroPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mIntroPagerAdapter);
        mViewPager.setOffscreenPageLimit(mIntroPagerAdapter.getCount());
        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (position == mIntroPagerAdapter.getCount() - 1) {
                    mFloatingActionButton.show();
                } else {
                    mFloatingActionButton.hide();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        };
        mViewPager.addOnPageChangeListener(onPageChangeListener);

        tabLayout.setupWithViewPager(mViewPager, true);

        return mView;
    }


}
