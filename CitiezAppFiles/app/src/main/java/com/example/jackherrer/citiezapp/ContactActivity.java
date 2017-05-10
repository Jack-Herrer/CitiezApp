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

    //user is redirected to email client on click
    public void onEmailClick(View view) {
// todo place correct email
        Uri uri = Uri.parse("mailto:info@yourcompany.com");
        Intent sendEmail = new Intent(Intent.ACTION_SENDTO, uri);
        sendEmail.putExtra(Intent.EXTRA_SUBJECT,
                "Customer comments/questions");
        startActivity(sendEmail);
    }

    public void onCallClick(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:123456789"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: GET CALL PERMISSION
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            Toast.makeText(getApplicationContext(), "no permission to dial",Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(callIntent);
    }

    public void onFacebookClick(View view) {
//        TODO CREATE FACEBOOK CLICK HANDLER
    }
}
