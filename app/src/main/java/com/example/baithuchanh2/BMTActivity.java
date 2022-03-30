package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

import java.text.BreakIterator;
import java.text.DecimalFormat;

public class BMTActivity extends AppCompatActivity {
    EditText kqcn;
    TextView hienthi,kq;
    Button btchon,btthoat,bttinh;
    SeekBar sb1;
    int pro = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmtactivity);

        kqcn = (EditText) findViewById(R.id.editTextNumber);
        btchon = (Button) findViewById(R.id.button33);
        btthoat = (Button) findViewById(R.id.button37);
        bttinh = (Button) findViewById(R.id.button36);
        sb1 = (SeekBar) findViewById(R.id.seekBar);
        hienthi = (TextView) findViewById(R.id.textView20);
        kq = (TextView) findViewById(R.id.textView21);


        //Hien thi tư NhapSo sang BMT ở ô ok
        Intent intent = getIntent();
        String message = intent.getStringExtra(NhapSo.EXTRA_MESSAGE);
        kqcn.setText(message);

        //sekbar
        sb1.setMax(200);
        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                hienthi.setText(String.valueOf(seekBar.getProgress()));
            }
        });

        btthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Khoi tao lai Activity main
                Intent intent = new Intent(getApplicationContext(), BMTActivity.class);
                startActivity(intent);

                // Tao su kien ket thuc app
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });
    }
    //Nut Chon
    public void doButtonClickChon(View v){
        Intent inter1 = new Intent(this,NhapSo.class);
        startActivity(inter1);
    }
    //Nut tính BMT
    public void doButtonTinh(View v){
        try {
            //Lấy giá trị nhập vào và ép kiểu về float
            double chieuCao = Double.parseDouble(hienthi.getText().toString());
            double canNang = Double.parseDouble(kqcn.getText().toString());
            DecimalFormat df = new DecimalFormat("0.00"); //định dạng lấy đến 2 con số
            double BMI = canNang / Math.pow(chieuCao, 2) * 10000; //chiều cao * chiều cao
            switch (v.getId()) //lấy id của các Button
            {
                case R.id.button36: //nếu id là Button Tính
                  //  textView21.setText(df.format(BMI) + "");
                    if (BMI < 18)
                        kq.setText("Bạn hơi gầy");
                    else if (18 <= BMI && BMI < 25)
                        kq.setText("Bạn bình thường");
                    else if (25 <= BMI && BMI < 30)
                        kq.setText("Bạn béo phì độ 1");
                    else if (30 <= BMI && BMI < 35)
                        kq.setText("Bạn béo phì độ 2");
                    else if (35 <= BMI)
                        kq.setText("Bạn béo phì độ 3");
                    break;
//                case R.id.button37: //Nếu id là Thoát
//                    finish();
//                    System.exit(0);
            }
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), "Bạn chưa nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
}