package com.zihadul.practicechallenge7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView plyer1,plyer2,plyer3,plyer4,plyer5,flag;
    TextView plyerName,plyerType,plyerDec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plyer1 = findViewById(R.id.plyer1);
        plyer2 = findViewById(R.id.plyer2);
        plyer3 = findViewById(R.id.plyer3);
        plyer4 = findViewById(R.id.plyer4);
        plyer5 = findViewById(R.id.plyer5);
        flag = findViewById(R.id.flag);
        plyerName = findViewById(R.id.plyerName);
        plyerType =findViewById(R.id.plyerType);
        plyerDec = findViewById(R.id.plyerDec);

        plyer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             flag.setVisibility(View.GONE);
             
            }
        });



    }
}