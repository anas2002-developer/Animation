package com.anas.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAndroid;
    Button btnTranslate,btnScale,btnRotate,btnAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAndroid=findViewById(R.id.imgAndroid);
        btnTranslate=findViewById(R.id.btnTranslate);
        btnAlpha=findViewById(R.id.btnAlpha);
        btnRotate=findViewById(R.id.btnRotate);
        btnScale=findViewById(R.id.btnScale);

        Animation translate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        Animation scale= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        Animation alpha= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAndroid.startAnimation(translate);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAndroid.startAnimation(alpha);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAndroid.startAnimation(scale);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAndroid.startAnimation(rotate);
            }
        });
    }
}