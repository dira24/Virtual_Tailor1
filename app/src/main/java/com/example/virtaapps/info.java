package com.example.virtaapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import org.opencv.android.JavaCameraView;
public class info extends AppCompatActivity {
    ImageButton btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        btnback= findViewById(R.id.back);
        btnback.setOnClickListener(view -> {
            Intent intent =new Intent(info.this,MainActivity.class); // activity skrg dan acticity yang akan dituju
            startActivity(intent);
        });
    }
}