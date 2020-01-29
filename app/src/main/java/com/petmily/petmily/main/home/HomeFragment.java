package com.petmily.petmily.main.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.petmily.petmily.R;

public class HomeFragment extends Fragment {
    private static class Singleton {
        private static final HomeFragment INSTANCE
                = new HomeFragment();
    }

    public static HomeFragment getInstance() {
        return Singleton.INSTANCE;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_home, container, false);
        return view;
    }
}
