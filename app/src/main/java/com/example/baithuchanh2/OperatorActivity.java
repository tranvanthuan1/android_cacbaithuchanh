package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OperatorActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btncong,btntru,btnnhan,btnchia,btnkq;
    double kq = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);

        txt1 = findViewById(R.id.editTextTextPersonName5);
        txt2 = findViewById(R.id.editTextTextPersonName6);

        btncong = findViewById(R.id.button21);
        btntru = findViewById(R.id.button22);
        btnnhan = findViewById(R.id.button23);
        btnchia = findViewById(R.id.button24);

        btnkq = findViewById(R.id.button20);

        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = txt1.getText().toString();
                String num2 = txt2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(txt1.getText().toString());
                    double b = Double.parseDouble(txt2.getText().toString());
                    kq = a + b;
                }
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = txt1.getText().toString();
                String num2 = txt2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(txt1.getText().toString());
                    double b = Double.parseDouble(txt2.getText().toString());
                    kq = a - b;
                }
            }
        });

        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = txt1.getText().toString();
                String num2 = txt2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a = Double.parseDouble(txt1.getText().toString());
                    double b = Double.parseDouble(txt2.getText().toString());
                    kq = a * b;
                }
            }
        });

        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = txt1.getText().toString();
                String num2 = txt2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    double a = Double.parseDouble(txt1.getText().toString());
                    double b = Double.parseDouble(txt2.getText().toString());
                    if (b != 0)
                        kq = a / b;
                    else
                        Toast.makeText(getApplicationContext(), "Enter Valid Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnkq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1 = String.valueOf(kq);
                btnkq.setText(ans1);
                kq= 0;
            }
        });
    }
}