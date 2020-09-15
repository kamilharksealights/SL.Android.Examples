package com.example.slandroidexamples

import android.os.Build
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.slandroidexamples.ui.login.LoginActivity
import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(RobolectricTestRunner::class)
@Config(sdk = [Build.VERSION_CODES.P])
class LoginActivityRobolectricNativeTest {

    @Test
    fun loginButtonShouldBeDisabledIfNoUserNameAndPasswordProvided() {
        val activity: LoginActivity = Robolectric.buildActivity(LoginActivity::class.java).create().resume().get()

        val loginButton = activity.findViewById<Button>(R.id.login)

        Truth.assertThat(loginButton.isEnabled).isFalse()
    }

    @Test
    fun loginButtonShouldBeEnabledIfUserNameAndPasswordProvided() {
        val activity: LoginActivity = Robolectric.buildActivity(LoginActivity::class.java).create().resume().get()
        val userNameFiled = activity.findViewById<EditText>(R.id.username)
        val passwordField = activity.findViewById<EditText>(R.id.password)

        userNameFiled.setText("user@g.com", TextView.BufferType.EDITABLE)
        passwordField.setText("pass123", TextView.BufferType.EDITABLE)

        Truth.assertThat(activity.findViewById<Button>(R.id.login).isEnabled).isTrue()
    }


}