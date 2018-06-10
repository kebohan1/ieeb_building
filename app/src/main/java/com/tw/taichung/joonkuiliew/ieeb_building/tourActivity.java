package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TourActivity extends AppCompatActivity {
    private ImageButton floor_imageButtonB1;
    private ImageButton floor_imageButton1;
    private ImageButton floor_imageButton2;
    private ImageButton floor_imageButton3;
    private ImageButton floor_imageButton4;
    private ImageButton floor_imageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

        floor_imageButtonB1 = findViewById(R.id.floor_imageButtonB1);
        //還沒有圖片 底下那行為圖片設置程式碼
        // floor_imageButtonB1.setImageResource(R.drawable.firefox);
        floor_imageButtonB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TourActivity.this,Floor_tourActivity.class);
                intent.putExtra("floor_key",-1);
                startActivity(intent);
            }
        });

        floor_imageButton1 = findViewById(R.id.floor_imageButton1);
        //還沒有圖片 底下那行為圖片設置程式碼
        // floor_imageButton1.setImageResource(R.drawable.firefox);
        floor_imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TourActivity.this,Floor_tourActivity.class);
                intent.putExtra("floor_key",1);
                startActivity(intent);
            }
        });

        floor_imageButton2 = findViewById(R.id.floor_imageButton2);
        //還沒有圖片 底下那行為圖片設置程式碼
        // floor_imageButton2.setImageResource(R.drawable.firefox);
        floor_imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TourActivity.this,Floor_tourActivity.class);
                intent.putExtra("floor_key",2);
                startActivity(intent);
            }
        });

        floor_imageButton3 = findViewById(R.id.floor_imageButton3);
        //還沒有圖片 底下那行為圖片設置程式碼
        // floor_imageButton3.setImageResource(R.drawable.firefox);
        floor_imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TourActivity.this,Floor_tourActivity.class);
                intent.putExtra("floor_key",3);
                startActivity(intent);
            }
        });

        floor_imageButton4 = findViewById(R.id.floor_imageButton4);
        //還沒有圖片 底下那行為圖片設置程式碼
        // floor_imageButton4.setImageResource(R.drawable.firefox);
        floor_imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TourActivity.this,Floor_tourActivity.class);
                intent.putExtra("floor_key",4);
                startActivity(intent);
            }
        });

        floor_imageButton5 = findViewById(R.id.floor_imageButton5);
        //還沒有圖片 底下那行為圖片設置程式碼
//        floor_imageButton5.setImageResource(R.drawable.ic_launcher_background);
        floor_imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(TourActivity.this,Floor_tourActivity.class);
                intent.putExtra("floor_key",5);
                startActivity(intent);
            }
        });
    }
}
