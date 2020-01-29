package com.petmily.petmily.signin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.petmily.petmily.R;

public class AuthFragment extends Fragment {
    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.sign_in_auth, container, false);
        Button button = mView.findViewById(R.id.btn_auth_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections action = SignInAuthFragmentDirections
                        .actionSignInAuthFragmentToSignInPetFragment();
                Navigation.findNavController(mView).navigate(action);
            }
        });
        return mView;
    }
}
