package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class LightingActivity extends AppCompatActivity {
    ImageButton a1,a2,a3,a4,a5,a6,a7,a8;
    Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighting);

        Button bt1 = (Button) findViewById(R.id.button19);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void doButtonLight(View v){
        ImageButton id = (ImageButton) v;
        id.setImageResource(R.drawable.icon_lightsang);
    }


    public void light(){
        a1 = findViewById(R.id.imageButton5);
        a2 = findViewById(R.id.imageButton9);
        a3 = findViewById(R.id.imageButton);
        a4 = findViewById(R.id.imageButton2);
        a5 = findViewById(R.id.imageButton3);
        a6 = findViewById(R.id.imageButton4);
        a7 = findViewById(R.id.imageButton6);
        a8 = findViewById(R.id.imageButton7);
    }
    private int random() {
        int[]aray = {1,2,3,4,5,6,7,8};
        int x = aray[r.nextInt(aray.length)];
        return x;
    }
    public void doButtonLight2(View v){
        Drawable d = getResources().getDrawable(R.drawable.icon_lightsang);
        int x= random();
        switch (x){
            case 0:
                a1.setImageDrawable(d);
                break;
            case 1:
                a2.setImageDrawable(d);
                break;
            case 2:
                a3.setImageDrawable(d);
                break;
            case 3:
                a4.setImageDrawable(d);
                break;
            case 4:
                a5.setImageDrawable(d);
                break;
            case 5:
                a6.setImageDrawable(d);
                break;
            case 6:
                a7.setImageDrawable(d);
                break;
            case 7:
                a8.setImageDrawable(d);
                break;
        }
    }
}