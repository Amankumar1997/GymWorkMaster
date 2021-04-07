package com.example.gymworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
ImageView img;   //splash image
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        img=findViewById(R.id.splash);

        new Thread()
        {
            @Override
            public void run() {
                super.run();

                try {
                    sleep(1500);
                    startActivity(new Intent(SplashScreen.this,MainActivity.class));
                    SplashScreen.super.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}