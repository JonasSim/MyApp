package com.example.myapp;

import com.example.myapp.main.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.Espresso;
import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class FirstTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void greeterSaysHello() {
        onView(withId(R.id.editText)).perform(typeText("Steve"));
        onView(withId(R.id.button)).perform(click());
        Espresso.closeSoftKeyboard();
        onView(withText("Hello Steve")).check(matches(isDisplayed()));
    }

    @Test
    public void checkDisplay() {
        onView(withId(R.id.DISPLAY))
                .perform(click())
                .check(matches(isDisplayed()));
    }


}
