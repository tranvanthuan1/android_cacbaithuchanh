package com.example.baithuchanh2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class QualationActivity extends AppCompatActivity {
    /*
    private String[] m = {"Có kiến thức thì không nghi ngờ, có lòng nhân thì không ưu tư, có dũng cảm thì không sợ hãi",
            "Nếu là đá, hãy là nam châm. Nếu là cây, hãy là cây trinh nữ. Nếu là người, xin hãy dâng hiến cho tình yêu",
            "Làm việc đừng mong dễ thành công. Vì nếu dễ thành công thì bản thân thường kiêu ngạo",
            "Khi bạn khao khát một điều gì đó, cả vũ trụ sẽ hợp lực giúp bạn đạt điều đó. ",
            "Lòng tốt của con người có thể như một ngọn lửa cháy âm ỉ chứ không bao giờ dập tắt đi."};*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qualations_activity);


    }

    public void doButtonShow(View v){

        Show();
    }
    public String random(){
        String[] ran = getResources().getStringArray(R.array.you_string);
        String random = ran[new Random().nextInt(ran.length)];
        return random;
    }



    private void Show(){
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        Random show = new Random();
        //String con = m[show.nextInt(m.length)];
        int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
        int size = 20 + show.nextInt(15);

        // vi tri
        int post = show.nextInt(4);
        int gravity = Gravity.CENTER;
        if (post == 0) gravity |= Gravity.LEFT;
        else  if (post == 1) gravity |= Gravity.RIGHT;
        else if (post == 2) gravity |= Gravity.TOP;
        else  gravity |= Gravity.BOTTOM;

        //TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setTextColor(color);
        textView4.setTextSize(size);
        textView4.setText(random());
        textView4.setGravity(gravity);


    }


}
