package com.example.slandroidexamples;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FlushService extends Service {

    public FlushService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        System.out.println("on service created");

        super.onCreate();
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        System.out.println("on task removed ===========");
        super.onTaskRemoved(rootIntent);
    }
}
