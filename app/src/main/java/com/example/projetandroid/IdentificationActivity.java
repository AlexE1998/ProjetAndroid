package com.example.projetandroid;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IdentificationActivity extends AppCompatActivity {
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        Button Valider=(Button) findViewById(R.id.identification_activity_connexion_btn);

        i = new Intent(getApplicationContext(), com.example.projetandroid.AppliActivity.class);
        startActivity(i);
        Valider.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });

        Button createAccount=(Button) findViewById(R.id.identification_activity_create_btn);
        i = new Intent(getApplicationContext(), com.example.projetandroid.AppliActivity.class);
        startActivity(i);
        createAccount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });
    }
}