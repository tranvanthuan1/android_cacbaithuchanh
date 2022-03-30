package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton;

public class Ktra_GK extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener {
    TextView txt;
    EditText txtsend;
    Button btsend,btnthoat;
    SeekBar sb;
    RadioButton red,blue,green;
    RadioGroup r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ktra_gk);
        create();

        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txtsend.getText().toString().trim());
                txtsend.setText("");
            }

        });

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int p=0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p=progress;
                txt.setTextSize(p);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if(p<1)
                {
                    p=1;
                    sb.setProgress(p);
                }
            }
        });
        // Hệ thống gọi hàm này khi có sự thay đổi lựa chọn giới tính

    }
    /// nut send hien thi len textview, nhan chon thay doi mau textview/mau nen, keo sekbar thay doi size, close//
    private void create(){
        txt = (TextView) findViewById(R.id.textView27);
        txtsend = (EditText) findViewById(R.id.editTextTextPersonName3);
        btsend = (Button) findViewById(R.id.button39);
        btnthoat = (Button) findViewById(R.id.button41);
        sb = (SeekBar) findViewById(R.id.seekBar2);
        blue = (RadioButton) findViewById(R.id.radioButton5);
        green = (RadioButton) findViewById(R.id.radioButton6);
        red = (RadioButton) findViewById(R.id.radioButton7);
        r = (RadioGroup) findViewById(R.id.radio);

        blue.setOnCheckedChangeListener(this);
        green.setOnCheckedChangeListener(this);
        red.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            if ((RadioButton)buttonView == blue) {
//                Toast.makeText(this, "Bạn vừa chọn Nam", Toast.LENGTH_SHORT).show();
                txt.setTextColor(Color.BLUE);
            }
            if (buttonView == green) {
                txt.setTextColor(Color.GREEN);
            }
            if (buttonView == red) {
                txt.setTextColor(Color.RED);
            }
        }
    }
    public void doButtonThoat(View v){
        finish();
    }
}