package com.billflores.android_push_notification_sample.services;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by bill on 22/09/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String REG_TOKEN="REG_TOKEN";

    @Override
    public void onTokenRefresh() {
        String recent_token=FirebaseInstanceId.getInstance().getToken();
        Log.i(REG_TOKEN,recent_token);
        super.onTokenRefresh();
    }
}
