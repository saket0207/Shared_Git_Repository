package com.android.hello;

import android.app.Activity;
import android.os.Bundle;

public class HelloWorldAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}