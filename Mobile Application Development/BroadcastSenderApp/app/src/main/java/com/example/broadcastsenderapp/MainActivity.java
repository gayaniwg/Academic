package com.example.broadcastsenderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter1=new IntentFilter("android.intent.action.AIRPLANE_MODE");
        MyBroadcastReceiver objReciver1=new MyBroadcastReceiver();

        registerReceiver(objReciver1,intentFilter1);
        MaterialButton checkBtn=(MaterialButton) findViewById(R.id.check);
        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnected())
                    Toast.makeText(getApplicationContext(), "Internet available", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Internet not available", Toast.LENGTH_SHORT).show();





            }
        });
    }



    boolean isConnected(){
            ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if(networkInfo!=null) {
                if (networkInfo.isConnected())
                    return true;
                else
                    return false;

            }
            else
                return false;



        }
    }
