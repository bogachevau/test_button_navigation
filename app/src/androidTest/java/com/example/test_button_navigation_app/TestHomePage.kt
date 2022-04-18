package com.example.test_button_navigation_app

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class TestHomePage {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun clickHomeButton() {
        HomePage().checkHomeButton()
    }

    @Test
    fun clickDashboardButton() {
        HomePage().checkDashboardButton()
    }

    @Test
    fun clickNotificationButton() {
        HomePage().checkNotificationButton()
    }
}