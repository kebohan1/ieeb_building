package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button tourButton;//分層簡介按鈕
    private Button introductionButton;
    private Button officeButton;
    private Button facilityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tourButton = findViewById(R.id.tour_button);
        tourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,TourActivity.class);
                startActivity(intent);
            }
        });

        introductionButton = (Button) findViewById(R.id.introduction_button);
        introductionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,IntroductionActivity.class);
                startActivity(intent);
            }
        });

        officeButton = (Button) findViewById(R.id.office_button);
        officeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,OfficeActivity.class);
                startActivity(intent);
            }
        });

        facilityButton = (Button) findViewById(R.id.facility_button);
        facilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,OtherFacilityActivity.class);
                startActivity(intent);
            }
        });
    }
}
