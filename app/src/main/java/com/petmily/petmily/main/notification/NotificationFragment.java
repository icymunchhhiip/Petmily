package com.petmily.petmily.main.notification;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.petmily.petmily.R;

public class NotificationFragment extends Fragment {
    private static class Singleton {
        private static final NotificationFragment INSTANCE
                = new NotificationFragment();
    }

    public static NotificationFragment getInstance() {
        return Singleton.INSTANCE;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_noti, container, false);
        return view;
    }
}
