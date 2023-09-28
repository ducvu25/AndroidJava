package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;

    EditText edtName;

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnClick);

        edtName = findViewById(R.id.edtName);

        txtView = findViewById(R.id.txtView);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView.setText("Hello, " + edtName.getText().toString() + "!");
            }
        });
    }

}