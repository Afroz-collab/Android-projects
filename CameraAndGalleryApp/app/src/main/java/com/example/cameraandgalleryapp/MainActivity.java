package com.example.cameraandgalleryapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final static int CAMERA_REQUEST_CODE = 22;
    final static int GALLERY_REQUEST_CODE = 33;

    Button btn_cam, btn_gall;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cam = findViewById(R.id.btn_cam);
        btn_gall = findViewById(R.id.btn_gall);
        iv = findViewById(R.id.image_view);

        btn_cam.setOnClickListener(this);
        btn_gall.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_cam:
                openCamera();
                break;
            case R.id.btn_gall:
                openGallery();
                break;
        }

    }

    private void openGallery() {

        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_PICK);
        startActivityForResult(i, GALLERY_REQUEST_CODE);
    }

    private void openCamera() {
       Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
       startActivityForResult(i, CAMERA_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == CAMERA_REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Bitmap b= (Bitmap) data.getExtras().get("data");
                iv.setImageBitmap(b);
            }
        }

        if(requestCode == GALLERY_REQUEST_CODE){
            if(resultCode == RESULT_OK){
                Uri u = data.getData();
                iv.setImageURI(u);
            }
        }
    }
}