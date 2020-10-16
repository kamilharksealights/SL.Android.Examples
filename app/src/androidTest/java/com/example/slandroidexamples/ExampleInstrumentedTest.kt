package com.example.slandroidexamples

import android.view.View
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.slandroidexamples.ui.login.LoginActivity
import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun loginButtonShouldBeDisabledIfNoUserNameAndPasswordProvided() {
        ActivityScenario.launch(LoginActivity::class.java)
        Espresso.onView(withId(R.id.login)).check { view: View, _ ->
            Truth.assertThat(view.isEnabled).isFalse()
        }
    }

}