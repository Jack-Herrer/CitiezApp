package com.example.jackherrer.citiezapp;

/**
 * Created by Michiel van der List on 9-5-17
 * michielvanderlist@gmail.com
 *
 * Class shows activity theme as splash screen
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
        finish();
    }
}