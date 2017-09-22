package com.billflores.android_push_notification_sample.services;

import android.app.PendingIntent;
import android.content.Intent;

import com.billflores.android_push_notification_sample.MainActivity;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by bill on 22/09/17.
 */

public class MyFireBaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        PendingIntent pendingIntent= PendingIntent.getActivity(this,0,)
    }
}
