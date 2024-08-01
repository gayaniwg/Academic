package com.example.broadcastsenderapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import android.net.ConnectivityManager;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.i("BroadcastReceiver","Broadcast massage is received");
        Toast.makeText(context,"Broadcast massage is received",Toast.LENGTH_LONG).show();
        if(Intent.ACTION_CAMERA_BUTTON.equals(intent.getAction())){
            Toast.makeText(context,"Camara is on",Toast.LENGTH_LONG).show();
        }
        if(Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(intent.getAction())){
            Toast.makeText(context,"Connectivity changed",Toast.LENGTH_LONG).show();
        }
        if(Intent.ACTION_BATTERY_LOW.equals(intent.getAction())){
            Toast.makeText(context,"Battery is low",Toast.LENGTH_LONG).show();
        }
    }

}