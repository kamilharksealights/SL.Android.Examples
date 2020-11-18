package com.example.slandroidexamples;

import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.NonNull;

import java.util.Random;

import io.sealights.onpremise.agents.android.SeaLights;

public class MyService extends Service {

    private IBinder mBinder = new MyBinder();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public String hello() {
        return "world";
    }

    public class MyBinder extends Binder {
        public MyService getService() {
            return MyService.this;
        }
    }

    @Override
    public boolean onUnbind(Intent intent) {
        System.out.println("unbindService ble");
        return super.onUnbind(intent);
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void onDestroy() {
        System.out.println("un destroy ble");
        super.onDestroy();
    }

    //    @Override
//    public void onTaskRemoved(Intent rootIntent) {
//        System.out.println("");
//        SeaLights.flushFootprints();
//        stopSelf();
//    }
}
