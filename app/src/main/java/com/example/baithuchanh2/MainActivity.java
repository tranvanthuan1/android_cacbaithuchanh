package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  MediaPlayer player = MediaPlayer.create(this, R.raw.em_la_cua_ai);
     //   player.start();


    }
    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("Callingg onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("Callingg onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("Callingg onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        System.out.println("Callingg onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("Callingg onDestroy");
    }

    public void onButtonMusic(View v){
        Intent i1 = new Intent(this,MusicActivity.class);
        startActivity(i1);
    }

}