package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Answer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        TextView textView = (TextView) findViewById(R.id.answer);
        int val = bundle.getInt("nval");
        int x = 1;
        for(int i=1; i<val; i++)
        {
            x =(x*i);
        }

        String txt = Integer.toString(x);
        textView.setText(txt);
    }}