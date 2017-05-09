package com.example.jackherrer.citiezapp;

/**
 * Created by Michiel van der List on 9-5-17
 * michielvanderlist@gmail.com
 *
 * Main menu
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    public void onInfoClick(View view) {
        Intent intent = new Intent(this, FAQActivity.class);
        startActivity(intent);

//        TODO Chose if activity has to be closed
//        finish();
    }
}
