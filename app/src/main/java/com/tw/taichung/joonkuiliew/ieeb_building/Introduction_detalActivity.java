package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Introduction_detalActivity extends AppCompatActivity {
    private ImageView imageView_detal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_detal);

        //Catch item num
        Intent intent = new Intent();
        int now_num = intent.getIntExtra("now_num",0);

        //set image and title text
    }
}
