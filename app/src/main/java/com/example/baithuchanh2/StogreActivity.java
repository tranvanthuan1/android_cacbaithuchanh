package com.example.baithuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StogreActivity extends AppCompatActivity {
    EditText txt;
    Button btaset,btraw;
    ImageView ig1;
    RadioButton rd1,rd2,rd3,rdf1,rdf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stogre);
        ig1 = (ImageView) findViewById(R.id.imageView9);
        txt = (EditText) findViewById(R.id.editTextText1);
        btaset = (Button) findViewById(R.id.button52);
        btraw = (Button) findViewById(R.id.button56);
        rd1 = (RadioButton) findViewById(R.id.radioButton11);
        rd2 = (RadioButton) findViewById(R.id.radioButton12);
        rd3 = (RadioButton) findViewById(R.id.radioButton13);
        rdf1 = (RadioButton) findViewById(R.id.radioButton15);
        rdf2 = (RadioButton) findViewById(R.id.radioButton16);

        btaset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fileContent = "";
                try {
                    AssetManager am = getAssets();
                    InputStream is = am.open("files/VD.txt");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                    String line = "";
                    while((line = reader.readLine()) != null){
                        fileContent += line + "\n";
                    }
                    reader.close();
                    txt.setText(fileContent);
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        });
    }
    public void doLogo(View v){
        try {
            AssetManager assetManager = getAssets();
            //font chữ
            Typeface fontArial = Typeface.createFromAsset(assetManager,"fonts/ArialCE.ttf");

            txt.setTypeface(fontArial);
            // hinh anh
            InputStream is = assetManager.open("logos/m.jpg");
            Drawable image = Drawable.createFromStream(is,null);
            ig1.setImageDrawable(image);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}