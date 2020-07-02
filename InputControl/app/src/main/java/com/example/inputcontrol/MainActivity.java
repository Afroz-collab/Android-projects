package com.example.inputcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_name, et_mob, et_email, et_pass;
    TextView tv;
    String name, mob,ch;
    RadioButton radio_m, radio_f;
    CheckBox ch_java, ch_python, ch_ruby;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.name);
        et_mob = findViewById(R.id.ph_number);
        et_email = findViewById(R.id.email);
        et_pass = findViewById(R.id.pass);
        tv = findViewById(R.id.text_view);
        radio_m = findViewById(R.id.male);
        radio_f = findViewById(R.id.female);
        ch_java = findViewById(R.id.ch_java);
        ch_python = findViewById(R.id.ch_python);
        ch_ruby = findViewById(R.id.ch_ruby);
    }

    public void Submit(View view) {

        name = et_name.getText().toString();
        mob = et_mob.getText().toString();

        et_name.setText("");
        et_mob.setText("");
        et_email.setText("");
        et_pass.setText("");

        if(radio_m.isChecked()){
            gender = radio_m.getText().toString();
        }
        if(radio_f.isChecked()){
            gender = radio_f.getText().toString();
        }

        StringBuilder b = new StringBuilder();
        if(ch_java.isChecked()){
            b.append(ch = ch_java.getText().toString() + ", ");
        }
        if(ch_python.isChecked()){
            b.append(ch = ch_python.getText().toString() + ", ");
        }
        if(ch_ruby.isChecked()){
            b.append(ch = ch_ruby.getText().toString());
        }
        String dis = "Name: " +name + " " + "Mob_no: " + mob + " " +gender + " " + b.toString();
        tv.setText(dis);
    }
}