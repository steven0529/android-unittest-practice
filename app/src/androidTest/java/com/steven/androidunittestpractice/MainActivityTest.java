package com.steven.androidunittestpractice;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

/**
 * Created by steven on 8/13/16.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    @SmallTest
    public void checkHelloWorldTextViewNotNull() {
        TextView textView = (TextView) activity.findViewById(R.id.textViewTest);
        assertNotNull(textView);
    }
}
