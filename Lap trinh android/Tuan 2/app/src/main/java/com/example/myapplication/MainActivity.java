package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDown, btnUp;
    TextView txtView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDown = findViewById(R.id.btnDown);
        btnUp = findViewById(R.id.btnUp);
        txtView = findViewById(R.id.txtView);

        count = 0;

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                txtView.setText(count + "");
            }
        });
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                txtView.setText(count + "");
            }
        });
    }

}