package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Introduction_detalActivity extends AppCompatActivity {
    private ImageView imageView_detal;
    private TextView introduction_detail_textView;
    private ArrayList<Introductphoto> introductphotolist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_detal);

        //Catch item num
        Intent intent = new Intent();
        int now_num = intent.getIntExtra("now_num",0);

        //var declare
        imageView_detal = findViewById(R.id.imageView_detal);
        introduction_detail_textView = findViewById(R.id.introduction_detail_textView);
        introductphotolist = ScrollingintroductionphotoActivity.introductphotolist;
        Introductphoto now = introductphotolist.get(now_num);

        //set image and title text
        introduction_detail_textView.setText(now.title);
        imageView_detal.setImageResource(now.imgid);
    }
}
