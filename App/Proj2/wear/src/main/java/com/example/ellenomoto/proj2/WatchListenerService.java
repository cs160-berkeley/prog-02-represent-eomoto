package com.example.ellenomoto.proj2;

/**
 * Created by ellenomoto on 3/2/16.
 */
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

import java.nio.charset.StandardCharsets;

public class WatchListenerService extends WearableListenerService {
    // In PhoneToWatchService, we passed in a path, either "/FRED" or "/LEXY"
    // These paths serve to differentiate different phone-to-watch messages
    private static final String sen1 = "/sen1";
    private static final String sen2 = "/sen2";
    private static final String house = "/house";
    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        Log.d("T", "in WatchListenerService, got: " + messageEvent.getPath());
        //use the 'path' field in sendmessage to differentiate use cases
        //(here, fred vs lexy)
        if( messageEvent.getPath().equalsIgnoreCase( sen1 )) {
            String info = new String(messageEvent.getData(), StandardCharsets.UTF_8);
            Intent intent = new Intent(this, MainActivity.class );
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //you need to add this flag since you're starting a new activity from a service
            startActivity(intent);
        }
//        else if( messageEvent.getPath().equalsIgnoreCase( sen2 )) {
//            String info = new String(messageEvent.getData(), StandardCharsets.UTF_8);
//            Intent intent = new Intent(this, Main2Activity.class );
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            //you need to add this flag since you're starting a new activity from a service
//            startActivity(intent);
//        }
//        else if( messageEvent.getPath().equalsIgnoreCase( house )) {
//            String info = new String(messageEvent.getData(), StandardCharsets.UTF_8);
//            Intent intent = new Intent(this, Main3Activity.class );
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            //you need to add this flag since you're starting a new activity from a service
//            startActivity(intent);
//        }
        else {
            super.onMessageReceived( messageEvent );
        }

    }
}