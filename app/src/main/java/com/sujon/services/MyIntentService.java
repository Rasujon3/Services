package com.sujon.services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Nullable;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "onHandleIntent: Service Started");
        int i =0;
        while (i<9999){
            Log.i(TAG, "onHandleIntent: service running!");
            i++;
        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Service Destroyed");
    }
}