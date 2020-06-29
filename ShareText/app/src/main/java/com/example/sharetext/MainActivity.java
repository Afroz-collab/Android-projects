package com.example.sharetext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button share;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.text);
        share = findViewById(R.id.btn_share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s = et.getText().toString();

                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, s);
                i.setType("text/plain");
                Intent share = Intent.createChooser(i, null);
                startActivity(share);
            }
        });


    }
}