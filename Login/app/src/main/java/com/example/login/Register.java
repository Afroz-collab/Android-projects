package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText user, pass, re_pass;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        re_pass = findViewById(R.id.re_pass);

    }


    public void register(View view) {
        s = "registered successfully !";
        user.setText("");
        pass.setText("");
        re_pass.setText("");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }
}