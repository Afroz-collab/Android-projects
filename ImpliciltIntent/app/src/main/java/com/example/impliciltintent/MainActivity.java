package com.example.impliciltintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.*;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void google(View view) {

        Uri link;
        link = Uri.parse("https://www.google.com");
        Intent in = new Intent(Intent.ACTION_VIEW, link);
        startActivity(in);

    }

    public void call(View view) {

        Uri link;
        link = Uri.parse("tel:123456789");
        Intent in = new Intent(Intent.ACTION_DIAL, link);
        startActivity(in);

    }

    public void location(View view) {
        Uri maplink = Uri.parse("geo:16.4649, 80.5078?z=21");
        Intent in = new Intent(Intent.ACTION_VIEW, maplink);
        startActivity(in);
    }

    public void send(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");
        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}