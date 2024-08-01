package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signIn;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signIn=(Button) findViewById(R.id.btn);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSignIn();
            }
        });
    }
    public void setSignIn(){
        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("Admin") && pass.equals("12345")){
            Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
            String url = "https://www.facebook.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        }else{
            Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show();
        }

    }
}