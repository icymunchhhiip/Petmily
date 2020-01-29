package com.petmily.petmily.Intro.contents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.petmily.petmily.R;

public class LEDFragment extends Fragment {
    private static class Singleton {
        private static final LEDFragment INSTANCE = new LEDFragment();
    }

    public static LEDFragment getInstance() {
        return Singleton.INSTANCE;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.intro_led, container, false);
        return view;
    }
}
