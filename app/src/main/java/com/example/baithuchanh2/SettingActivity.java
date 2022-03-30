package com.example.baithuchanh2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SettingActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener{
    LinearLayout li;
    Switch s1;
    ImageView ig1;
    EditText edit;
    TextView txt;
    Button btset, btshow,btclose;
    SeekBar sb;
    RadioButton lg1,lg2,lg3;
    private boolean isChecked1 = false,isChecked2 = false,isChecked3 = false,isCheckeds = false;
    Random show = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        li = (LinearLayout) findViewById(R.id.line);
        s1 = (Switch) findViewById(R.id.switch2);
        edit = (EditText) findViewById(R.id.editTextTextPersonName4);
        btset = (Button) findViewById(R.id.button42);
        btshow = (Button) findViewById(R.id.button46);
        btclose = (Button) findViewById(R.id.button47);
        ig1 = (ImageView) findViewById(R.id.imageView8);
        txt = (TextView) findViewById(R.id.textView33);
        sb = (SeekBar) findViewById(R.id.seekBar4);

        lg1 = (RadioButton) findViewById(R.id.radioButton8);
        lg2 = (RadioButton) findViewById(R.id.radioButton9);
        lg3 = (RadioButton) findViewById(R.id.radioButton10);
        lg1.setOnCheckedChangeListener(this);
        lg2.setOnCheckedChangeListener(this);
        lg3.setOnCheckedChangeListener(this);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
                li.setBackgroundColor(color);
            }
        });

        btset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(edit.getText().toString().trim());
                edit.setText("");
            }

        });

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int p=10;

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
                if(p<10)
                {
                    p=10;
                    sb.setProgress(p);
                }
            }
        });

        btshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.button46){
                    if(isChecked1 == true)
                    {
                        // lổi
                        lg1.setText("Logo1");
                    }
                    if(isChecked2 == true)
                    {
                        lg2.setText("Logo2");
                    }
                    if(isChecked3 == true)
                    {
                        lg3.setText("Logo3");
                    }
                    if(isCheckeds == true)
                    {
                        s1.setText("Color mode");
                    }
                }
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SettingActivity.this);
                // gán tiêu đề cho dialog
                alertDialogBuilder.setTitle("Show");
                // hiển thị Thông điệp (thông báo) lên dialog
                alertDialogBuilder .setMessage( "Thông báo" + "\n" + lg1 +lg2 +lg3 + s1 + txt.getText() )
                        .setCancelable(false)
                        .setPositiveButton("Có",new DialogInterface.OnClickListener()  {

                            public void onClick(DialogInterface dialog, int id) {

                                SettingActivity.this.finish();
                            }

                        })
                        .setNegativeButton("Không",new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,int id) {

                                dialog.cancel();
                            }
                        });
                // Tạo alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                // Hiển thị dialog
                alertDialog.show();
            }
        });

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            if ((RadioButton)buttonView == lg1) {
//                Toast.makeText(this, "Bạn vừa chọn Nam", Toast.LENGTH_SHORT).show();
                ig1.setImageResource(R.drawable.anh1);
            }
            if (buttonView == lg2) {
                ig1.setImageResource(R.drawable.images);
            }
            if (buttonView == lg3) {
                ig1.setImageResource(R.drawable.icons8_user);
            }
        }
    }
    public void doButtonClose(View v){
        finish();
    }
}