package cc.somkiat.basicunittesting;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void revertClickTest() {
        onView(allOf(withId(R.id.revertButton), withText("Revert"))).perform(click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }

    @Test
    public void saveWithStandardPattern(){

        onView(withId(R.id.userNameInput)).perform(replaceText("Mild Supanat"), closeSoftKeyboard());
        onView(withId(R.id.emailInput)).perform(replaceText("Mildsupanat@example.com"), closeSoftKeyboard());
        onView(allOf(withId(R.id.saveButton), withText("Save"))).perform(click());
//        onView(withText("Validation Result: Name Validation Success And Email Validation Success")).check(matches(isDisplayed()));
    }

    @Test
    public void saveWithEmptyName(){

        onView(withId(R.id.emailInput)).perform(replaceText("Mildsupanat@example.com"), closeSoftKeyboard());
        onView(allOf(withId(R.id.saveButton), withText("Save"))).perform(click());
//        onView(withText("Validation Result: Name Validation Success And Email Validation Success")).check(matches(isDisplayed()));
    }


    @Test
    public void saveWithEmptyEmail(){
        onView(withId(R.id.userNameInput)).perform(replaceText("Mild Supanat"), closeSoftKeyboard());
        onView(allOf(withId(R.id.saveButton), withText("Save"))).perform(click());
//        onView(withText("Validation Result: Name Validation Success And Email Validation Success")).check(matches(isDisplayed()));
    }



}

