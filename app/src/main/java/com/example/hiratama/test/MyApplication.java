package com.example.hiratama.test;

import android.app.Application;

import io.repro.android.Repro;

/**
 * Created by hiratama on 2018/02/16.
 */

public class MyApplication  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // Setup Repro
        Repro.setup(this, "9474de25-fe98-4ed4-9abb-860d4fe6956c");

        Repro.setUserID("tester_2018-02-16");
        // Start Recording
        Repro.startRecording();

    }
}