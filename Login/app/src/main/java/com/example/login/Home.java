package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    String data,str;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv = findViewById(R.id.heading);

        data = getIntent().getStringExtra("data");

        str = "Welcome "+data +" !";

        tv.setText(str);

    }
}