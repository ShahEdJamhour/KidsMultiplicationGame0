package com.example.multiplicationgame.ui;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.multiplicationgame.R;

import pl.droidsonroids.gif.GifImageView;


public class MainActivity extends AppCompatActivity {
    private GifImageView gifImageView;

    private Animation animation1;
    private Animation animation2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation2= AnimationUtils.loadAnimation(this,R.anim.slide_down);
        animation1= AnimationUtils.loadAnimation(this,R.anim.slide_up);
        gifImageView = findViewById(R.id.img_splash);
        textView=findViewById(R.id.textView);
        textView.startAnimation(animation1);
        gifImageView.startAnimation(animation2);

        Handler handler = new Handler();


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, MultiplyActivity.class);
                startActivity(intent);
                finish();


            }

        }, 4000);





    }
}