package com.example.zeproject;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import android.view.View;
import android.widget.Button;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    //Page d'acceuil
    private TextView mBvnText;
    private Button mConnexionButton;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        OnClickListener btnclick = new OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.activity_main_connexion_btn:
                        i = new Intent(getApplicationContext(), com.example.zeproject.IdentificationActivity.class);
                        startActivity(i);
                        break;
                    case R.id.activity_main_appli_btn:
                        i = new Intent(getApplicationContext(), com.example.zeproject.AppliActivity.class);
                        startActivity(i);
                        break;
                }
            }
        };

        //
        Button identification=(Button) findViewById(R.id.activity_main_connexion_btn);
        Button appli=(Button) findViewById(R.id.activity_main_appli_btn);
        identification.setOnClickListener(btnclick);
        appli.setOnClickListener(btnclick);


    }
}