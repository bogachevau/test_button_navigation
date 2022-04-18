package com.example.test_button_navigation_app

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers

class HomePage {

    fun checkHomeButton() : HomePage {
        Espresso.onView(ViewMatchers.withId(R.id.navigation_home))
            .perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        return this
    }

    fun checkDashboardButton() : HomePage {
        Espresso.onView(ViewMatchers.withId(R.id.navigation_dashboard))
            .perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        return this
    }

    fun checkNotificationButton() : HomePage {
        Espresso.onView(ViewMatchers.withId(R.id.navigation_notifications))
            .perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        return this
    }
}