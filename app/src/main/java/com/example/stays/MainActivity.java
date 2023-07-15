package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Create a timer variable

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent objSplashIntent = new Intent(MainActivity.this, OnboardingActivity.class);
                startActivity(objSplashIntent);
                finish();
            }
        },4000);
    }
}