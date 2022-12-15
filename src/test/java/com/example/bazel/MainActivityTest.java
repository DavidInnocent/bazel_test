package com.example.bazel.tests;


import com.google.common.truth.Truth;
import org.junit.Test;
import org.robolectric.RobolectricTestRunner;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.Shadows.shadowOf;
import android.content.Intent;
import org.robolectric.RuntimeEnvironment;
import android.app.Activity;
import android.view.View;
import org.junit.Assert.assertEquals;
import com.example.bazel.MainActivity;

@RunWith(RobolectricTestRunner.class)
class MainActivityTest {

    private MainActivity mainActivity;
    @Before
    public void setUp() throws Exception
    {
        mainActivity = Robolectric.buildActivity( MainActivity.class )
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldHaveDefaultMargin() throws Exception {
        onView(withId(R.id.clickMeButton))
                .perform(click())
                .check(matches(isDisplayed()));
onView(withId(R.id.helloBazelTextView))
                .check(matches(isDisplayed()));
onView(withId(R.id.clickMeButton))
                .check(matches(isDisplayed()));

    }
}