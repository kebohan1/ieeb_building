package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroductionActivity extends AppCompatActivity {

    private Button button_about;
    private Button button_history;
    private Button button_introduct_dean;
    private Button button_introduct_department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        //var declare
        button_about = findViewById(R.id.button_about);
        button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(IntroductionActivity.this,ScrollingintroductionphotoActivity.class);
                startActivity(intent);
            }
        });

        button_history = findViewById(R.id.button_history);
        button_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(IntroductionActivity.this,HistoryScrollingActivity.class);
                startActivity(intent);
            }
        });

        button_introduct_dean = findViewById(R.id.button_introduct_dean);
        button_introduct_dean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(IntroductionActivity.this,Dean_ScrollingActivity.class);
                startActivity(intent);
            }
        });

        button_introduct_department = findViewById(R.id.button_introduct_department);
        button_introduct_department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(IntroductionActivity.this,DepartmentScrollingActivity.class);
                startActivity(intent);
            }
        });
    }
}
