package com.example.mylib;

import android.content.Intent;
import android.os.IBinder;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ServiceTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeoutException;

import static com.google.common.truth.Truth.assertThat;

@RunWith(AndroidJUnit4.class)
public class ServiceInstrumentedTest {

    @Rule
    public final ServiceTestRule serviceRule = new ServiceTestRule();

    @Test
    public void testWithBoundService() throws TimeoutException {
        Intent serviceIntent = new Intent(ApplicationProvider.getApplicationContext(), MyService.class);
        serviceRule.startService(serviceIntent);

        IBinder binder = serviceRule.bindService(serviceIntent);

        MyService service = ((MyService.MyBinder) binder).getService();

        assertThat(service.hello()).isEqualTo("world");
        serviceRule.unbindService();
    }


}
