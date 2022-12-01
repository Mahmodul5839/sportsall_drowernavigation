package com.monir.worldsport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.startapp.sdk.adsbase.StartAppAd;

public class Sports_Score extends AppCompatActivity {


    ImageView channel1,channel2,channel3,channel4;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_score);

        StartAppAd.showAd(Sports_Score.this);
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
                Intent intent = new Intent(Sports_Score.this,Score1.class);
                startActivity(intent);



            }
        });


        channel2 = findViewById(R.id.channel2);
        channel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sports_Score.this,Score2.class);
                startActivity(intent);




            }
        });

        channel3 = findViewById(R.id.channel3);
        channel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sports_Score.this,Score3.class);
                startActivity(intent);



            }
        });

        channel4 = findViewById(R.id.channel4);
        channel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sports_Score.this,Score4.class);
                startActivity(intent);



            }
        });


    }
}