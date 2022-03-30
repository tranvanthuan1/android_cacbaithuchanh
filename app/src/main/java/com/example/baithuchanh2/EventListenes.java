package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class EventListenes extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_listenes);
        //c2
        Button bt1 = (Button) findViewById(R.id.button25);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inter = new Intent(getApplicationContext(),LightingActivity.class);
                startActivity(inter);
            }
        });

//        bt1.setOnClickListener(this);
        Button bt2 = (Button) findViewById(R.id.button30);
        bt2.setOnClickListener(listener);
    }
    //cach1
    public void doButtonClickHello(View v){
        Intent inter = new Intent(this,HelloActivity.class);
        startActivity(inter);
    }
//c 3
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inter = new Intent(getApplicationContext(),QualationActivity.class);
            startActivity(inter);
        }
    };

        //c4
    @Override
    public void onClick(View v) {
        Intent inter = new Intent(this,MusicActivity.class);
        startActivity(inter);
    }


}