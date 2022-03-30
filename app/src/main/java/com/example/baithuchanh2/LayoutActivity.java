package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LayoutActivity extends AppCompatActivity {
    private int  random ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

    }
//
//    ImageButton a = (ImageButton) findViewById(R.id.imageButton);
//    ImageButton b = (ImageButton) findViewById(R.id.imageButton2);
//    ImageButton c = (ImageButton) findViewById(R.id.imageButton3);
//    public void doButtonLight2(View v){
//        Drawable d = getResources().getDrawable(R.drawable.iconlight);
//        int x= random();
//        switch (x){
//            case 0:
//                a.setImageDrawable(d);
//                break;
//            case 1:
//                b.setImageDrawable(d);
//                break;
//            case 2:
//                c.setImageDrawable(d);
//                break;
//        }
//    }
//
//    private int random() {
//        return random;
//    }
//
//    public void doButtonLight(View v){
//        ImageButton id = (ImageButton) v;
//        id.setImageResource(R.drawable.iconslight2);
//    }
//ImageButton a1 = (ImageButton) findViewById(R.id.imageButton5);
//    ImageButton a2 = (ImageButton) findViewById(R.id.imageButton9);
//    ImageButton a3 = (ImageButton) findViewById(R.id.imageButton);
//    ImageButton a4 = (ImageButton) findViewById(R.id.imageButton2);
//    ImageButton a5 = (ImageButton) findViewById(R.id.imageButton3);
//    ImageButton a6 = (ImageButton) findViewById(R.id.imageButton4);
//    ImageButton a7 = (ImageButton) findViewById(R.id.imageButton5);
//    ImageButton a8 = (ImageButton) findViewById(R.id.imageButton6);
//    ImageButton a9 = (ImageButton) findViewById(R.id.imageButton7);
//
//    public void doButtonLight2(View v){
//        Drawable d = getResources().getDrawable(R.drawable.icon_lightsang);
//        int x= random();
//        switch (x){
//            case 0:
//                a1.setImageDrawable(d);
//                break;
//            case 1:
//                a2.setImageDrawable(d);
//                break;
//            case 2:
//                a3.setImageDrawable(d);
//                break;
//        }
//    }
//
//    private int random() {
//        int[]aray = {1,2,3,4,5,6,7,8};
//        int x = aray[r.nextInt(aray.length)];
//        return x;
//    }

}