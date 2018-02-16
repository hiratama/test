package com.example.hiratama.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.repro.android.Repro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Repro.track("test");
    }
}
