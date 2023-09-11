package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText idtA, idtB, idtResult;
    Button btnSum, btnSub, btnMul, btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idtA = findViewById(R.id.idA);
        idtB = findViewById(R.id.idtB);
        idtResult = findViewById(R.id.idtResult);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(idtA.getText().toString());
                int b = Integer.parseInt(idtB.getText().toString());
                int c =  a + b;
                idtResult.setText(c + "");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(idtA.getText().toString());
                int b = Integer.parseInt(idtB.getText().toString());
                int c =  a - b;
                idtResult.setText(c + "");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(idtA.getText().toString());
                int b = Integer.parseInt(idtB.getText().toString());
                int c =  a * b;
                idtResult.setText(c + "");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(idtA.getText().toString());
                int b = Integer.parseInt(idtB.getText().toString());
                int c =  a / b;
                idtResult.setText(c + "");
            }
        });
    }
}