package com.example.jackherrer.citiezapp;

/**
 * Created by Michiel van der List on 9-5-17
 * michielvanderlist@gmail.com
 *
 * faq's activity makes sure html directly copied from website is showed in textview
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

// TODO: Adjust information and style

public class FaqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        TextView faqview = (TextView) findViewById(R.id.faqview);
        faqview.setText(Html.fromHtml(getString(R.string.faqstring)));
        faqview.setMovementMethod(new ScrollingMovementMethod());

    }


}
