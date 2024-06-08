package com.ghedamsisabri.ui_testing_for_beginner

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.tap
import org.hamcrest.Matcher
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {
    @get: Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testCase1(){
        Assert.assertTrue(mainPage.isViewDisplayed())
        nextButton.tap()
        Assert.assertTrue(secondPageTitle.isViewDisplayed())
        Assert.assertTrue(backButton.isViewDisplayed())
    }

    @Test
    fun testCase2(){
        Assert.assertTrue(mainPage.isViewDisplayed())
        nextButton.tap()
        backButton.tap()
        Assert.assertTrue(mainPageTitle.isViewDisplayed())
        Assert.assertTrue(nextButton.isViewDisplayed())
    }


    companion object{
        val mainPage: Matcher<View> by lazy { withId(R.id.main)}
        val mainPageTitle: Matcher<View> by lazy { withId(R.id.activity_main_title)}
        val nextButton: Matcher<View> by lazy { withId(R.id.button_next_activity) }
        val secondPageTitle: Matcher<View> by lazy { withId(R.id.activity_secondary_title) }
        val backButton: Matcher<View> by lazy { withId(R.id.button_back) }
    }
}