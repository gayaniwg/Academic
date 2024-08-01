package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;
    ToggleButton toggleButton;
    Button showMessageButton;
    double order=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkbox_1);
        checkBox2 = findViewById(R.id.checkbox_2);
        checkBox3 = findViewById(R.id.checkbox_3);
//        toggleButton = findViewById(R.id.toggle_button);
        showMessageButton = findViewById(R.id.show_message_button);

        showMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Selected items: \n";
                if (checkBox1.isChecked()) {
                    message += "Pizza - , RS:1000\n";
                    order+=1000;
                }
                if (checkBox2.isChecked()) {
                    message += "Coffee - , RS:250\n";
                    order+=250;
                }
                if (checkBox3.isChecked()) {
                    message += "Burger - , RS:300\n";
                    order+=300;
                }
//                if (message.endsWith(", ")) {
//                    message = message.substring(0, message.length() - 2);
//                }
                message = message + "\n" + "Total :- RS: "+order;
//                String toggleStatus = "Toggle Button: " + (toggleButton.isChecked() ? "ON" : "OFF");
//                message = message + "\n" + toggleStatus;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
