package com.example.myapplication

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun onClickAddNote() {
        Espresso.onView(ViewMatchers.withId(R.id.edtTitle)).perform(ViewActions.typeText("Hello"))
        Espresso.onView(ViewMatchers.withId(R.id.edtDescription)).perform(ViewActions.typeText("Hello Rajan"), ViewActions.closeSoftKeyboard())

        Espresso.onView(ViewMatchers.withId(R.id.btnIncreament)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.txtTT)).check(ViewAssertions.matches(ViewMatchers.withText("Hello")))
        Espresso.onView(ViewMatchers.withId(R.id.txtDesc)).check(ViewAssertions.matches(ViewMatchers.withText("Hello Rajan")))
    }
}