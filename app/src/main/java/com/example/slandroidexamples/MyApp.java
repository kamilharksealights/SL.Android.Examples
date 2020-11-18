package com.example.slandroidexamples;

import android.app.Application;
import android.content.Intent;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        startService(new Intent(getApplicationContext(), FlushService.class));
        super.onCreate();
    }


}
