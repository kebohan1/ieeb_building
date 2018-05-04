package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button TourButton;//分層簡介按鈕
    private Button IntroductionButton;
    private Button OfficeButton;
    private Button FacilityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TourButton = (Button) findViewById(R.id.tour_button);
        TourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Floor_tourActivity.class);
                startActivity(intent);
            }
        });
        IntroductionButton = (Button) findViewById(R.id.introduction_button);
        IntroductionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,IntroductionActivity.class);
                startActivity(intent);
            }
        });
        OfficeButton = (Button) findViewById(R.id.office_button);
        OfficeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,OfficeActivity.class);
                startActivity(intent);
            }
        });
        FacilityButton = (Button) findViewById(R.id.facility_button);
        FacilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,OtherFacilityActivity.class);
                startActivity(intent);
            }
        });
    }
}
