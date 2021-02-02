package com.example.projetandroid;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CreateAccountActivity extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button ValiderCreate=(Button) findViewById(R.id.account_activity_create_btn);

        i = new Intent(getApplicationContext(), com.example.projetandroid.AppliActivity.class);
        startActivity(i);
        ValiderCreate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });
    }
}