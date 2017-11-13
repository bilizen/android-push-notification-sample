package com.billflores.android_push_notification_sample;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by bill on 13/11/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        String refreshedToken= FirebaseInstanceId.getInstance().getToken();
        Log.i(TAG, "Refreshed token: " + refreshedToken);
        sendRegistrationToServer(refreshedToken);

    }

    private void sendRegistrationToServer(String token) {
    }
}
