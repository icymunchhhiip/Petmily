package com.petmily.petmily.kakaologin;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.kakao.auth.ErrorCode;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.Session;
import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.MeResponseCallback;
import com.kakao.usermgmt.callback.MeV2ResponseCallback;
import com.kakao.usermgmt.response.MeV2Response;
import com.kakao.usermgmt.response.model.UserProfile;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.log.Logger;
import com.petmily.petmily.R;

public class LoginFragment extends Fragment {
    private View mView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.login, container, false);
//        SessionCallback mSessionCallback = new SessionCallback();
//        Session.getCurrentSession().addCallback(mSessionCallback);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                NavDirections action = LoginFragmentDirections
                        .actionLoginFragmentToSignInAuthFragment();

                Navigation.findNavController(mView).navigate(action);
            }
        },500);
        return mView;
    }

    private class SessionCallback implements ISessionCallback {
        @Override
        public void onSessionOpened() {
            requestMe();
        }

        @Override
        public void onSessionOpenFailed(KakaoException exception) {

        }
    }

    private void requestMe() {
        UserManagement.getInstance().me(new MeV2ResponseCallback() {
            @Override
            public void onSessionClosed(ErrorResult errorResult) {

            }

            @Override
            public void onSuccess(MeV2Response result) {
//                if he is our user
//                NavDirections action = LoginFragmentDirections
//                        .actionLoginFragmentToPager();
//                else
                NavDirections action = LoginFragmentDirections
                        .actionLoginFragmentToSignInAuthFragment();
                Navigation.findNavController(mView).navigate(action);
            }
        });
    }
}
