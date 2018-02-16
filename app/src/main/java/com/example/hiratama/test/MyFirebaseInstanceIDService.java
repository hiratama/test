package com.example.hiratama.test;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import io.repro.android.Repro;

/**
 * Created by hiratama on 2018/02/16.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Repro.setPushRegistrationID(refreshedToken);
    }

}
