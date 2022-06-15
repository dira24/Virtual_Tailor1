package com.example.virtaapps;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.OpenCVLoader;

public class ImageProcessing extends AppCompatActivity {
    Button btnkembali,btnsimpan;

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_processing);
        btnkembali= findViewById(R.id.kembali);
        btnsimpan= findViewById(R.id.simpan);



        String nama = getIntent().getExtras().getString(("nama"));
        String umur = getIntent().getExtras().getString(("umur"));
        String alamat = getIntent().getExtras().getString(("alamat"));



        result = findViewById(R.id.data);
        result.setText("Nama :"  +nama+ "\n" +"Kategori :" +umur+ "\n" +"Alamat :" +alamat );
        btnkembali.setOnClickListener(view -> {
            Intent intent =new Intent(ImageProcessing.this,MainActivity.class); // activity skrg dan acticity yang akan dituju
            startActivity(intent);
        });
        //halo

    }
}
