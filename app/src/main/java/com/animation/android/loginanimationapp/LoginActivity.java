package com.animation.android.loginanimationapp;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    ConstraintLayout myLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myLayout = (ConstraintLayout) findViewById(R.id.myLayout);
        animationDrawable = (AnimationDrawable) myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

        // similar to animate an image
//        ImageView imageView = (ImageView) findViewById(R.id.image);
//        imageView.setBackground(R.drawable.animation);
//        animationDrawable = (AnimationDrawable) imageView.getBackground();
        // double-check but can't start animation because image is not fully attached to window
        // immediately start by overriding onWindowFocusChanged, or start with button click
    }
}
