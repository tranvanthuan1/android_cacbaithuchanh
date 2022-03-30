package com.example.baithuchanh2;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MusicActivity extends AppCompatActivity {
    private final static String TAG = "Main" ;
    private Handler updateHandler = new Handler();
    private int[] baihat;
    private int randombaihat;
    private String tenbaihat;
    TextView txttimePlay,txttimetop,pause;
    SeekBar sb;

    MediaPlayer player = null;
    Boolean running=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity);
      //  MediaPlayer player = MediaPlayer.create(this, R.raw.em_la_cua_ai);
      //  player.start();
        baihat = new int[]{R.raw.thoi_thanh_xuan_se_qua,R.raw.ngay_hanh_phuc,R.raw.the_luong};
        randombaihat = new Random().nextInt(baihat.length);
        player = MediaPlayer.create(this,baihat[randombaihat]);
        pause = (TextView) findViewById(R.id.textView7);

        txttimePlay = (TextView) findViewById(R.id.textView31);
        int minutes = (int)TimeUnit.MILLISECONDS.toMinutes(player.getDuration());
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(player.getDuration()) - minutes * 60;
        txttimePlay.setText(String.format("%02d:%02d",minutes, seconds));
        txttimePlay.setTextColor(Color.WHITE);

        txttimetop = (TextView) findViewById(R.id.textView28);
        txttimetop.setTextColor(Color.WHITE);
        updateHandler = new Handler();
        updateHandler.postDelayed(update, 100);
        sb = (SeekBar) findViewById(R.id.seekBar3);
        sb.setMax((int) player.getDuration());
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser)
                    player.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        Log.d(TAG, "Start mucsic ");

        System.out.println(randombaihat);

        if(randombaihat == 0){
            tenbaihat = "Thời thanh xuân đả qua";
        }
        if(randombaihat == 1){
            tenbaihat = "Ngày hạnh phúc";
        }
        if(randombaihat == 2){
            tenbaihat = "Thê lương";
        }

        TextView txtmucsic = (TextView) findViewById(R.id.textView3);
        txtmucsic.setText(tenbaihat);
        txtmucsic.setTextColor(Color.BLUE);
        txtmucsic.setTextSize(25);
    }
    private Runnable update = new Runnable()
    {
        public void run()
        {
            long currentTime = player.getCurrentPosition();
            sb.setProgress((int)currentTime);
            int minutes = (int)TimeUnit.MILLISECONDS.toMinutes(currentTime);
            int seconds = (int)TimeUnit.MILLISECONDS.toSeconds(currentTime) - minutes * 60;
            txttimetop.setText(String.format("%02d:%02d",minutes, seconds));
            updateHandler.postDelayed(this, 100);
        }
    };



    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Resume mucsic ");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Pause mucsic ");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "Stop mucsic ");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("Stop and pause music");
    }


    public void doButtonStart(View v) {
        if (!running) {
            player.start();
            running=true;
            pause.setText(" ");
        }

    }
    public void doButtonPause(View v) {
        if (running) {
            player.pause();
            running=false;
            Hienthi();
        }
    }
    public void doButtonExit(View v){
        finish();
    }
    private void Hienthi(){
        pause.setText("Pause");
        pause.setTextSize(25);
        pause.setTextColor(Color.RED);

    }
}
