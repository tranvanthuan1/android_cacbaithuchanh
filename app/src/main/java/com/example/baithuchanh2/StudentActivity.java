package com.example.baithuchanh2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Random;

public class StudentActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3;
    RadioButton rd1,rd2;
    Switch s1;
    ToggleButton tg;
    TextView txt;
    EditText edit1,edit2;
    LinearLayout li;
    Button btinfo,btcancel;
    Random show = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        create();

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
               // txt.setTextColor(color);
                li.setBackgroundColor(color);
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
                // txt.setTextColor(color);
                li.setBackgroundColor(color);
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
                // txt.setTextColor(color);
                li.setBackgroundColor(color);
            }
        });
        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
                // txt.setTextColor(color);
                li.setBackgroundColor(color);
            }
        });
        rd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
                // txt.setTextColor(color);
                li.setBackgroundColor(color);
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
                // txt.setTextColor(color);
                li.setBackgroundColor(color);
            }
        });
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.rgb(show.nextInt(255),show.nextInt(255),show.nextInt(255));
                li.setBackgroundColor(color);

            }
        });

        //Hien thi thong bao
        btinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Th??ng b??o",
                        Toast.LENGTH_LONG).show();
            }
        });
        // Hien thi Dialog thong bao
        btcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(StudentActivity.this);
                        // g??n ti??u ????? cho dialog
                alertDialogBuilder.setTitle("Tho??t");
                        // hi???n th??? Th??ng ??i???p (th??ng b??o) l??n dialog
                alertDialogBuilder .setMessage("B???n c?? mu???n tho??t kh??ng?")
                        .setCancelable(false)
                        .setPositiveButton("C??",new DialogInterface.OnClickListener()  {

                            public void onClick(DialogInterface dialog, int id) {

                                StudentActivity.this.finish();
                            }

                        })
                        .setNegativeButton("Kh??ng",new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,int id) {

                                dialog.cancel();
                            }
                        });
                // T???o alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                // Hi???n th??? dialog
                alertDialog.show();

            }
        });
    }
    private void create(){
        cb1 = (CheckBox) findViewById(R.id.checkBox4);
        cb2 = (CheckBox) findViewById(R.id.checkBox3);
        cb3 = (CheckBox) findViewById(R.id.checkBox2);
        li = (LinearLayout) findViewById(R.id.li);
        rd1 = (RadioButton) findViewById(R.id.radioButton2);
        rd2 = (RadioButton) findViewById(R.id.radioButton3);
        s1 = (Switch) findViewById(R.id.switch1);
        tg = (ToggleButton) findViewById(R.id.toggleButton);
        edit1 = (EditText)findViewById(R.id.editTextTextEmailAddress2);
        edit2 = (EditText)findViewById(R.id.editTextTextEmailAddress3);
        btinfo = (Button) findViewById(R.id.button34);
        btcancel = (Button) findViewById(R.id.button35);

    }
}