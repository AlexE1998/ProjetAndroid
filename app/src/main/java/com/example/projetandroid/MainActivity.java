package com.example.projetandroid;

import androidx.appcompat.app.AppCompatActivity;

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

        //
        Button identification=(Button) findViewById(R.id.activity_main_connexion_btn);

        i = new Intent(getApplicationContext(), com.example.projetandroid.IdentificationActivity.class);
        startActivity(i);
        identification.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });

        Button appli=(Button) findViewById(R.id.activity_main_appli_btn);
        i = new Intent(getApplicationContext(), com.example.projetandroid.AppliActivity.class);
        startActivity(i);
        appli.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });

    }
}