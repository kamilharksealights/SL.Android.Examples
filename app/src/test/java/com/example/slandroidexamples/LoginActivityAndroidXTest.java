package com.example.slandroidexamples;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.slandroidexamples.ui.login.LoginActivity;
import com.google.common.truth.Truth;

import android.os.Build;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

import static androidx.test.core.app.ActivityScenario.launch;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@Config(sdk = {Build.VERSION_CODES.P})
public class LoginActivityAndroidXTest {

    @Test
    public void loginButtonShouldBeDisabledIfNoUserNameAndPasswordProvided() {
        launch(LoginActivity.class);

        onView(withId(R.id.login))
                .check((view, ignored) -> Truth.assertThat(view.isEnabled()).isFalse());
    }

}