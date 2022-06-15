package com.example.virtaapps;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class loginactivity extends AppCompatActivity {
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        login= findViewById(R.id.button3);

        login.setOnClickListener(view -> {
            Intent intent=new Intent(loginactivity.this, MainActivity.class);// activity skrg dan acticity yang akan dituju
            startActivity(intent);
        });
    }
}