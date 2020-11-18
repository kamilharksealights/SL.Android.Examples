package com.example.slandroidexamples;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;

import io.sealights.onpremise.agents.android.SeaLights;

import static androidx.lifecycle.Lifecycle.Event.ON_DESTROY;

public class FlushActivity extends Activity {


    public FlushActivity() {
        System.out.println(SeaLights.class.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}