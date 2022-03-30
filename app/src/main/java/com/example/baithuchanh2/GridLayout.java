package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class GridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }
    public void doButtonNew(View v ){
        New();
    }
    public String random(){
        String[] ran = getResources().getStringArray(R.array.you_number);
        String random = ran[new Random().nextInt(ran.length)];
        return random;
    }
    private void New(){
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        Random show = new Random();
        int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
       int size = 30;
       int gravity = Gravity.CENTER;


        textView10.setText("You score: " + random());
        textView10.setTextColor(color);
        textView10.setTextSize(size);
        textView10.setGravity(gravity);
    }
}