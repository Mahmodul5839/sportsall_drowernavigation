package com.monir.worldsport;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import com.google.android.material.navigation.NavigationView;
import com.startapp.sdk.adsbase.StartAppAd;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private final String TAG = AppCompatActivity.class.getSimpleName();



    ImageSlider imageSlider;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    ImageView imageMenu, exit;
    ImageView chanel1, chanel2, mfootball, score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        StartAppAd.disableSplash();

        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Home.this)
                        .setTitle("Confirm Exit?")
                        .setMessage("Do you really want to exit?")
                        .setIcon(R.drawable.denger)
                        .setNegativeButton("No,thanks", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();

                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                finishAndRemoveTask();

                            }
                        })
                        .show();

            }
        });


        chanel1 = findViewById(R.id.chanel1);
        chanel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Home.this, Home1.class);
                startActivity(intent);








            }
        });

        chanel2 = findViewById(R.id.chanel2);
        chanel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Home2.class);
                startActivity(intent);








            }
        });

        mfootball = findViewById(R.id.mfootball);
        mfootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Football_Sports.class);
                startActivity(intent);







            }
        });

        score = findViewById(R.id.score);
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, Sports_Score.class);
                startActivity(intent);











            }
        });


        imageSlider = findViewById(R.id.image_slider);
        createSlider();

        // Navagation Drawar------------------------------
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);

        toggle = new ActionBarDrawerToggle(Home.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Drawar click event
        // Drawer item Click event ------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.mHome:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        Toast.makeText(Home.this, "Wilcome to Home Menu", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.mRate:
                        final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                        } catch (android.content.ActivityNotFoundException anfe) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));

                        }
                        Toast.makeText(Home.this, "Thank You \uD83E\uDD70\n Please rate us on play store. It helps us doing even better. ", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.mShare:
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        String Body = "Download this App";
                        String Sub = "http://play.google.com";
                        intent.putExtra(Intent.EXTRA_TEXT, Body);
                        intent.putExtra(Intent.EXTRA_TEXT, Sub);
                        startActivity(Intent.createChooser(intent, "Share using"));
                        Toast.makeText(Home.this, "If you like the app,please share with loved ones.", Toast.LENGTH_LONG).show();
                        return true;


                    case R.id.mMore:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Mahmodul Hasan")));
                        Toast.makeText(Home.this, "You can download the apps from play store to get more of our apps services", Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.mContact:
                        Intent name = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("sms", "01736685839", null));
                        name.putExtra("sms", "Hello Dear....");
                        startActivity(name);
                        Toast.makeText(Home.this, "Message us to add any new service to the apps.", Toast.LENGTH_LONG).show();
                        return true;

                    case R.id.mPolicy:
                        Intent ten = new Intent(Intent.ACTION_VIEW);
                        ten.setData(Uri.parse("https://www.bdtopcoder.xyz/2022/07/android-navigation-drawer-custom.html"));
                        startActivity(ten);
                        return true;


                }


                return false;
            }
        });

        //------------------------------

        // ------------------------
        // App Bar Click Event
        imageMenu = findViewById(R.id.imageMenu);

        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        // ------------------------


    }

    private void createSlider() {

        ArrayList<SlideModel> imageList = new ArrayList<>();
        //imageList.add(new SlideModel(R.drawable.slide_1, null));

        imageList.add(new SlideModel(R.drawable.sliderimage, null));




        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);


    }

    public void onBackPressed() {
        // When user press back button

        new AlertDialog.Builder(Home.this)
                .setTitle("Confirm Exit?")
                .setMessage("Do you really want to exit?")
                .setIcon(R.drawable.denger)
                .setNegativeButton("No,thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finishAndRemoveTask();

                    }
                })
                .show();


    }


}