package com.example.mylib;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Lib1Service extends Service {
    public Lib1Service() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
