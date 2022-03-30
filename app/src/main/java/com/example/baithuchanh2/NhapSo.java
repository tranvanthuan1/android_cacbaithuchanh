package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NhapSo extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btc,btok,btcancel;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_so);

        bt1 = (Button) findViewById(R.id.button53);
        bt2 = (Button) findViewById(R.id.button54);
        bt3 = (Button) findViewById(R.id.button55);
        bt4 = (Button) findViewById(R.id.button57);
        bt5 = (Button) findViewById(R.id.button32);
        bt6 = (Button) findViewById(R.id.button40);
        bt7 = (Button) findViewById(R.id.button49);
        bt8 = (Button) findViewById(R.id.button50);
        bt9 = (Button) findViewById(R.id.button51);
        bt0 = (Button) findViewById(R.id.button38);
        btc = (Button) findViewById(R.id.button44);
        btok = (Button) findViewById(R.id.button59);
        btcancel = (Button) findViewById(R.id.button60);
        txt = (TextView) findViewById(R.id.textView23);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText() + "0");
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
            }
        });

        btcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void sendMessageOk(View view) {
        Intent intent = new Intent(this, BMTActivity.class);
       // EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = txt.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}