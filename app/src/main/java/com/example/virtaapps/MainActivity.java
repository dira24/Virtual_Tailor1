package com.example.virtaapps;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.OpenCVLoader;


public class MainActivity extends AppCompatActivity {
    Button btnuserukur,btninfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        if (OpenCVLoader.initDebug()){
            Toast.makeText(MainActivity.this, "OpenCV Berhasil di Install", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "OpenCV Gagal di Install", Toast.LENGTH_LONG).show();
        }

        setContentView(R.layout.activity_main);
        btnuserukur= findViewById(R.id.button);
        btninfo= findViewById(R.id.button2);

                btnuserukur.setOnClickListener(view -> {
                    Intent intent =new Intent(MainActivity.this,test.class); // activity skrg dan acticity yang akan dituju
                    startActivity(intent);
                });
                btninfo.setOnClickListener(view -> {
                    Intent intent=new Intent(MainActivity.this, info.class);// activity skrg dan acticity yang akan dituju
                    startActivity(intent);
                });
    }
}