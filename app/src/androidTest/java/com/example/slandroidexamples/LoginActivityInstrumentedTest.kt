package com.example.slandroidexamples

import android.content.Intent
import android.view.View
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.slandroidexamples.ui.login.LoginActivity
import com.google.common.truth.Truth
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityInstrumentedTest {

//    @Before
//    fun setup() {
//        val instrumentation = InstrumentationRegistry.getInstrumentation()
//        val intent = Intent(instrumentation.targetContext, FlushActivity::class.java)
//        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//        instrumentation.startActivitySync(intent)
//    }

    @Test
    fun loginButtonShouldBeDisabledIfNoUserNameAndPasswordProvided() {
        ActivityScenario.launch(LoginActivity::class.java)
        Espresso.onView(withId(R.id.login)).check { view: View, _ ->
            Truth.assertThat(view.isEnabled).isFalse()
        }
    }

}