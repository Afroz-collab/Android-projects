package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button login, register;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = user.getText().toString();

                    Intent in = new Intent(MainActivity.this, Home.class);
                    in.putExtra("data", data);
                    startActivity(in);
                    user.setText("");
                    pass.setText("");
                    Toast.makeText(MainActivity.this, "Logged in Successfully ", Toast.LENGTH_SHORT).show();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Register.class);
                startActivity(in);
                user.setText("");
                pass.setText("");
            }
        });

    }
}