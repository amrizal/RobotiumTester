package com.example.android.robotiumtester;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by amrizal.zainuddin on 4/8/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void test1() throws Exception {
        solo.assertCurrentActivity("Check on first Activity", MainActivity.class);
        solo.sendKey(Solo.MENU);
    }

    public void test2() throws Exception{
        String s1 = "AAA";
        String s2 = "AAA";

        assertEquals(s1, s2);
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}
