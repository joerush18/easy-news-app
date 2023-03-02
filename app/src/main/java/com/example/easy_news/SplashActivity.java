package com.example.easy_news;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import org.w3c.dom.Text;

public class SplashActivity extends AppCompatActivity {

    ImageView img_splash;
    TextView txt_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        img_splash = findViewById(R.id.img_splash);
        txt_splash = findViewById(R.id.txt_splash);

        YoYo.with(Techniques.Pulse).duration(1000).repeat(1).playOn(img_splash);
        YoYo.with(Techniques.FadeInRight).duration(3000).repeat(1).playOn(txt_splash);
        Intent iHome = new Intent(SplashActivity.this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iHome);
                finish();
            }
        }, 5000);

    }
}