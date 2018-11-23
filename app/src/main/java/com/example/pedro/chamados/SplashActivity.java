package com.example.pedro.chamados;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler splashHandle = new Handler();
        splashHandle.postDelayed(new Runnable() {
            @Override
            public void run() {
                toLogin();
            }
        }, 3000);
    }

    public void toLogin(){
        Intent intentToLoginScreen = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intentToLoginScreen);
        finish();
    }
}
