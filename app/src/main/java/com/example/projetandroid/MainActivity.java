package com.example.projetandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//teeeeeeeeeeeeest
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button Button1=(Button1) findViewById(R.id.button);
        Button Button2=(Button2) findViewById(R.id.button2);
        Button Button3=(Button3) findViewById(R.id.button3);
        Button Button4=(button4) findViewById(R.id.button4);
        Button1.setOnClickListener(btnclick);
        Button2.setOnClickListener(btnclick);
        Button3.setOnClickListener(btnclick);
        Button4.setOnClickListener(btnclick);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}