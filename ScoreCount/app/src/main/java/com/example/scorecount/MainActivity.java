package com.example.scorecount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_a, tv_b;
    Button ba_1, ba_2, ba_3,bb_1, bb_2, bb_3;
    Button ra, rb;
    int score_a = 0, score_b = 0;
    String sa,sb,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_a = findViewById(R.id.score_a);
        tv_b = findViewById(R.id.score_b);

        ba_1 = findViewById(R.id.plus_1_a);
        ba_2 = findViewById(R.id.plus_2_a);
        ba_3 = findViewById(R.id.plus_3_a);
        bb_1 = findViewById(R.id.plus_1_b);
        bb_2 = findViewById(R.id.plus_2_b);
        bb_3 = findViewById(R.id.plus_3_b);

        ra = findViewById(R.id.reset_a);
        rb = findViewById(R.id.reset_b);

        if(savedInstanceState!=null){
            sa = savedInstanceState.getString("score_a");
            score_a = Integer.parseInt(sa);
            tv_a.setText(sa);

            sb = savedInstanceState.getString("score_b");
            score_b = Integer.parseInt(sb);
            tv_b.setText(sb);
        }

        ba_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_a++;
                s = Integer.toString(score_a);
                tv_a.setText(s);
            }
        });

        bb_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_b++;
                s = Integer.toString(score_b);
                tv_b.setText(s);
            }
        });

        ba_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_a += 2;
                s = Integer.toString(score_a);
                tv_a.setText(s);
            }
        });

        bb_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_b += 2;
                s = Integer.toString(score_b);
                tv_b.setText(s);
            }
        });

        ba_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_a += 3;
                s = Integer.toString(score_a);
                tv_a.setText(s);
            }
        });


        bb_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_b += 3;
                s = Integer.toString(score_b);
                tv_b.setText(s);
            }
        });

        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_a = 0;
                s = Integer.toString(score_a);
                tv_a.setText(s);
            }
        });

        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score_b = 0;
                s = Integer.toString(score_b);
                tv_b.setText(s);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.getString("score_a", tv_a.getText().toString());
        outState.getString("score_b", tv_b.getText().toString());
    }
}