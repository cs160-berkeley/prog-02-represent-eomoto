package com.example.ellenomoto.proj2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView sen1;
    private TextView sen2;
    private TextView house;
    private ImageView sen1_pic;
    private ImageView sen2_pic;
    private ImageView house_pic;
    private ImageView sen1_back;
    private ImageView sen2_back;
    private ImageView house_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sen1 = (TextView) findViewById(R.id.gen_sen1);
        sen2 = (TextView) findViewById(R.id.gen_sen2);
        house = (TextView) findViewById(R.id.gen_house);
        sen1_pic = (ImageView) findViewById(R.id.gen_sen1_pic);
        sen2_pic = (ImageView) findViewById(R.id.gen_sen2_pic);
        house_pic = (ImageView) findViewById(R.id.gen_house_pic);
        sen1_back = (ImageView) findViewById(R.id.gen_sen1_back);
        sen2_back = (ImageView) findViewById(R.id.gen_sen2_back);
        house_back = (ImageView) findViewById(R.id.gen_house_back);


        sen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main22Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "sen1");
                startService(sendIntent);
            }
        });

        sen1_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main22Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "sen1");
                startService(sendIntent);
            }
        });

        sen1_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main22Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "sen1");
                startService(sendIntent);
            }
        });

        sen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main23Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "sen2");
                startService(sendIntent);
            }
        });
        sen2_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main23Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "sen2");
                startService(sendIntent);
            }
        });

        sen2_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main23Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "sen2");
                startService(sendIntent);
            }
        });

        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main24Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "house");
                startService(sendIntent);
            }
        });

        house_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main24Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "house");
                startService(sendIntent);
            }
        });

        house_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main24Activity.class);
                startActivity(intent);
                Intent sendIntent = new Intent(getBaseContext(), PhoneToWatchService.class);
                sendIntent.putExtra("INFO", "house");
                startService(sendIntent);
            }
        });
    }
}
