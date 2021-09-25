package com.example.animation_transition;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    ImageView img_taylor, img_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        img_music = findViewById(R.id.img_music);
        img_taylor = findViewById(R.id.img_Taylor);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anirotate);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aniblink);

        img_taylor.startAnimation(animation);
        img_music.startAnimation(animation1);
    }
}