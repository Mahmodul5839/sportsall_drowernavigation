package com.monir.worldsport;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.startapp.sdk.adsbase.StartAppAd;

public class MainActivity extends AppCompatActivity {

    private ProgressBar prograsbar;
    int progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prograsbar = findViewById(R.id.prograsbar);

        StartAppAd.disableSplash();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                finish();

            }

        },1500);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                main();

            }
        });
        thread.start();


    }
    public void main(){
        for (progress=40;progress<=100;progress=progress+10){
            try {
                Thread.sleep(250);
                prograsbar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


}