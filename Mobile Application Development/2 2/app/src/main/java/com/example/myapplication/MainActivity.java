package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText n = (EditText) findViewById(R.id.input_num);
    Bundle bundle = new Bundle();

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.ok_button:
                int val = Integer.parseInt(n.getText().toString());
                bundle.putInt("nval",val);
                Intent intent = new Intent(this, Answer.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;

        }
    }
}