package com.billflores.android_push_notification_sample;

import android.app.NotificationManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by bill on 13/11/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        Log.i(TAG, "From: " + remoteMessage.getFrom());

        if (remoteMessage.getNotification() != null) {
            showNotifications();
            Log.i(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
            Log.i(TAG, "Message Notification Title: " + remoteMessage.getNotification().getTitle());
        }

        if (remoteMessage.getData().size() > 0) {
            Log.i(TAG, "Message data payload: " + remoteMessage.getData());
        }

    }

//    en desarrollo
    private void showNotifications(){
        Uri sounfdUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder norificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.intertek)
                .setContentText("body")
                .setContentTitle("title")
                .setAutoCancel(true)
                .setSound(sounfdUri);

        NotificationManager notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0,norificationBuilder.build());
    }

}
