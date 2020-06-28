package com.example.numbercount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn_inc;
    Button btn_dec;
    Button btn_reset;
    Button btn_toast;
    int count = 0;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.text);
        btn_inc = findViewById(R.id.btn_inc);
        btn_dec = findViewById(R.id.btn_dec);
        btn_reset = findViewById(R.id.btn_reset);
        btn_toast = findViewById(R.id.btn_toast);

        if(savedInstanceState != null){
            s = savedInstanceState.getString("Count");
            count = Integer.parseInt(s);
            tv.setText(s);
        }

        btn_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                s = Integer.toString(count);
                tv.setText(s);
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                s = Integer.toString(count);
                tv.setText(s);
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                s = Integer.toString(count);
                tv.setText(s);
            }
        });

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "The Count is: " +count;
                Toast.makeText(MainActivity.this, msg, LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("Count", tv.getText().toString());
    }
}