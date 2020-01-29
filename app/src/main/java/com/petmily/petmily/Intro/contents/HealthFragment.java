package com.petmily.petmily.Intro.contents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.petmily.petmily.R;

public class HealthFragment extends Fragment {
    private static class Singleton {
        private static final HealthFragment INSTANCE
                = new HealthFragment();
    }

    public static HealthFragment getInstance() {
        return Singleton.INSTANCE;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.intro_health, container, false);
        return view;
    }
}

//import android.Manifest;
//import android.os.Bundle;
//import android.view.View;
//
//import androidx.annotation.Nullable;
//
//import agency.tango.materialintroscreen.MaterialIntroActivity;
//import agency.tango.materialintroscreen.MessageButtonBehaviour;
//import agency.tango.materialintroscreen.SlideFragmentBuilder;
//
//public class HealthFragment extends MaterialIntroActivity {
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        addSlide(new SlideFragmentBuilder()
//                        .backgroundColor(R.color.colorPrimary)
//                        .buttonsColor(R.color.colorAccent)
//                        .possiblePermissions(new String[]{
//                                Manifest.permission.CALL_PHONE, Manifest.permission.READ_SMS})
//                        .neededPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION})
//                        .image(agency.tango.materialintroscreen.R.drawable.ic_next)
//                        .title("title 3")
//                        .description("Description 3")
//                        .build(),
//                new MessageButtonBehaviour(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        showMessage("We provide solutions to make you love your work");
//                    }
//                }, "Work with love"));
//
//    }
//}
