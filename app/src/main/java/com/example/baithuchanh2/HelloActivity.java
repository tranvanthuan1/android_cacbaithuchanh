package com.example.baithuchanh2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {
    TextView b;
    int nhap;
    EditText editText1;
    private ImageView imageView;
    //private ImageView imageView;
    private Button button10;
    private Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        this.imageView = (ImageView) this.findViewById(R.id.imageView);
        editText1 = (EditText) findViewById(R.id.editText1);


        this.button10 = (Button) this.findViewById(R.id.button10);
        this.button11 = (Button) this.findViewById(R.id.button11);

        this.button10.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                showImage1();
            }
        });

        this.button11.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                showImage2();
            }
        });
    }


        private void showImage1() {
            this.imageView.setImageResource(R.drawable.anh1);
        }

        private void showImage2() {
            this.imageView.setImageResource(R.drawable.images);
        }





    public void onButtonChangeText(View v){

        //b = findViewById(R.id.textView2);
       //b.setText("Trần Văn Thuần - Lớp 18CT4");
       // b.setTextColor(Color.GREEN);
      //  b.setTextSize(TypedValue.COMPLEX_UNIT_SP,30f);

     //   b.setTextColor(randomColor());
     //   b.setTextSize(randomSize());
     //   b = findViewById(R.id.editTextTextPostalAddress);
      //  b.setTextColor(MauandSize());
        List<String> list = new ArrayList<String>();
        list.add("#eb4034");
        list.add("#3449eb");
        list.add("#e8eb34");
        Random rand = new Random();
        String random = list.get(rand.nextInt(list.size()));

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(editText1.getText());
        TextView editText2 = (TextView) findViewById(R.id.editText2);
        //int color = Integer.parseInt(editText1.getText().toString());
        if ( Integer.parseInt(editText2.getText().toString()) == 1 ){
            textView2.setTextColor(Color.RED);
        }
        else if ( Integer.parseInt(editText2.getText().toString()) == 2 ){
            textView2.setTextColor(Color.parseColor("#eb7134"));
        }
        else if ( Integer.parseInt(editText2.getText().toString()) == 3 ){
            textView2.setTextColor(Color.BLUE);
        }
        else{
            textView2.setTextColor(Color.parseColor("#df18f5"));
        }

        TextView editText3 = (TextView) findViewById(R.id.editText3);
        textView2.setTextSize(Integer.parseInt(editText3.getText().toString()));

        //textView2.setText(title);
        //textView2.setTextColor(editText2);
        //textView2.setTextSize(size);


    }
}
