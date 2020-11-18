package com.example.testing;

import android.content.Intent;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ServiceTestRule;

import com.example.slandroidexamples.MyService;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class ServiceInstrumentedTest {

    @Rule
    public final ServiceTestRule serviceRule = new ServiceTestRule();

    @Test
    public void testWithBoundService() throws Exception {
        Intent serviceIntent = new Intent(ApplicationProvider.getApplicationContext(), MyService.class);
        serviceRule.startService(serviceIntent);
    }

}

