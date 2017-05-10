package com.example.jackherrer.citiezapp;
/**
 * Created by Michiel van der List on 9-5-17
 * michielvanderlist@gmail.com
 *
 * Contact activity
 */

//TODO: build link to website, link to android call and to email

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.R.id.message;

public class ContactActivity extends AppCompatActivity {

    private static int MY_PERMISSIONS_REQUEST_CALL_PHONE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    //user is redirected directly to website on click
    public void onWebsiteClick(View view) {
        Uri uri = Uri.parse("http://www.citiezhotelamsterdam.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    // todo place correct email
    //user is redirected to email client on click
    public void onEmailClick(View view) {
        Uri uri = Uri.parse("mailto:info@yourcompany.com");
        Intent sendEmail = new Intent(Intent.ACTION_SENDTO, uri);
        sendEmail.putExtra(Intent.EXTRA_SUBJECT,
                "Customer comments/questions");
        startActivity(sendEmail);
    }

    // todo: place correct phone number
    // Dial citiez hotel phone number
    public void onCallClick(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:123456789"));

        //check for permission
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(getApplicationContext(), "no permission to dial",Toast.LENGTH_SHORT).show();

            //get permission to call
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    MY_PERMISSIONS_REQUEST_CALL_PHONE);

            return;
        }
        startActivity(callIntent);
    }

    public void onFacebookClick(View view) {
//        TODO CREATE FACEBOOK CLICK HANDLER
    }
}
