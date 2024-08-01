package com.example.video;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private static int CAMERA_PERMISSION_CODE = 100;
    private static int VIDEO_RECORD_CODE = 101;
    private static int IMAGE_CAPTURE_CODE = 102;
    private Uri videoPath, imagePath;
    Button button, imageButton;
    VideoView videoView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (isCameraPresentInPhone()) {
            Log.i("VIDEO_RECORD_TAG", "Camera has detected");
            getCameraPermission();
        }

        button = findViewById(R.id.button);
        imageButton = findViewById(R.id.button2);
        videoView = findViewById(R.id.videoView);
        imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recordVideo();
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                captureImages();
            }
        });

    }


    private boolean isCameraPresentInPhone() {
        if (getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY)) {
            return true;
        } else
            return false;
    }


    private void getCameraPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.CAMERA}, CAMERA_PERMISSION_CODE);
        }
    }

    private void recordVideo() {
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(intent, VIDEO_RECORD_CODE);
    }

    private void captureImages() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, IMAGE_CAPTURE_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VIDEO_RECORD_CODE) {
            if (resultCode == RESULT_OK) {
                assert data != null;
                videoPath = data.getData();

                videoView.setVideoURI(videoPath);
                imageView.setVisibility(View.INVISIBLE);
                videoView.setVisibility(View.VISIBLE);
               MediaController mediaController = new MediaController(this);
                videoView.setMediaController(mediaController);
                videoView.start();
                Log.i("VIDEO_RECORD_TAG", "Video is recorded and available" + videoPath);

            } else if (resultCode == RESULT_CANCELED) {
                Log.i("VIDEO_RECORD_TAG", "Recorded Video is Canceled");
            } else {
                Log.i("VIDEO_RECORD_TAG", "Recorded Video got some errors");
            }
        }else if (requestCode == IMAGE_CAPTURE_CODE) {
            if (resultCode == RESULT_OK) {
                assert data != null;
                Bitmap photo = (Bitmap) data.getExtras().get("data");
                imageView.setImageBitmap(photo);
                imageView.setVisibility(View.VISIBLE);
                videoView.setVisibility(View.INVISIBLE);
                Log.i("IMAGE_CAPTURE_CODE", "Image is captured and available" + imagePath);
            } else if (resultCode == RESULT_CANCELED) {
                Log.i("IMAGE_CAPTURE_CODE", "Captured image is Canceled");
            } else {
                Log.i("IMAGE_CAPTURE_CODE", "Captured image got some errors");
            }
        }

    }
}