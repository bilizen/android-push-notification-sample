package com.billflores.android_push_notification_sample.services;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;

import com.billflores.android_push_notification_sample.MainActivity;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by bill on 22/09/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        Log.i("FireBase","Message: "+ remoteMessage.getData().toString());
        super.onMessageReceived(remoteMessage);
    }
}
