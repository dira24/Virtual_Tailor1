package com.example.virtaapps;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class userukur extends AppCompatActivity {
    ImageView ImageData;
    Button pickimage, CapImage, ukur;
    EditText nama, alamat;
    RadioGroup umur;
    RadioButton pilumur;
    ImageButton btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userukur);
        ImageData = findViewById(R.id.imagedata);
        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        ukur = findViewById(R.id.ukur);
        umur = findViewById(R.id.umur);
        CapImage = findViewById(R.id.captureimage);
        btnback = findViewById(R.id.back);

        if (ContextCompat.checkSelfPermission(userukur.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(userukur.this, new String[]{
                            Manifest.permission.CAMERA
                    },
                    100);
        }
        CapImage.setOnClickListener(view -> {
            //Open Camera
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 100);
        });

        btnback.setOnClickListener(view -> {
            Intent intent = new Intent(userukur.this, MainActivity.class); // activity skrg dan acticity yang akan dituju
            startActivity(intent);
        });
        ukur.setOnClickListener(view -> {
            //jika tombol ditekan akan berpindah ke kamera
            int radioId = umur.getCheckedRadioButtonId();
            pilumur = (RadioButton) findViewById(radioId);
            Intent intent = new Intent(userukur.this, ImageProcessing.class); // activity skrg dan acticity yang akan dituju
            intent.putExtra("nama", nama.getText().toString());
            intent.putExtra("umur", pilumur.getText().toString());
            intent.putExtra("alamat", alamat.getText().toString());
            startActivity(intent);
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            assert data != null;
            Bitmap captureImage = (Bitmap) data.getExtras().get("data");
            ImageData.setImageBitmap(captureImage);
        }

    }

}

