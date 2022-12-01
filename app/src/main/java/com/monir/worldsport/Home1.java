package com.monir.worldsport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.startapp.sdk.adsbase.StartAppAd;

public class Home1 extends AppCompatActivity {
    ImageView channel1 , channel2,channel3,channel4,channel5,channel6;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        StartAppAd.showAd(Home1.this);
        StartAppAd.disableSplash();

        back =findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }



        });

        channel1 = findViewById(R.id.channel1);
        channel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home1.this,Live1.class);
                startActivity(intent);



            }
        });


        channel2 = findViewById(R.id.channel2);
        channel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home1.this,Live2.class);
                startActivity(intent);




            }
        });

        channel3 = findViewById(R.id.channel3);
        channel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home1.this,Live3.class);
                startActivity(intent);



            }
        });

        channel4 = findViewById(R.id.channel4);
        channel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home1.this,Live4.class);
                startActivity(intent);



            }
        });

        channel5 = findViewById(R.id.channel5);
        channel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home1.this,Live5.class);
                startActivity(intent);



            }
        });

        channel6 = findViewById(R.id.channel6);
        channel6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home1.this,Live6.class);
                startActivity(intent);



            }
        });


    }




}