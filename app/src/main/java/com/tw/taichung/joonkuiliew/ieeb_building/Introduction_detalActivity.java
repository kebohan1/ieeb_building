package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Introduction_detalActivity extends AppCompatActivity {
    private ImageView imageView_detal;
    private TextView introduction_detail_textView;
    private ArrayList<Introductphoto> introductphotolist;
    private Switch nightmode_switch;
    private int now_num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_detal);

        //Catch item num
        Intent intent = this.getIntent();
        now_num = intent.getIntExtra("now_num", 0);
        Log.v("Now Item Num",String.valueOf(now_num));

        //var declare
        imageView_detal = findViewById(R.id.imageView_detal);
        introduction_detail_textView = findViewById(R.id.introduction_detail_textView);
        nightmode_switch = findViewById(R.id.nightmode_switch);
        introductphotolist = ScrollingintroductionphotoActivity.introductphotolist;
        Introductphoto now = introductphotolist.get(now_num);

        //set image and title text
        introduction_detail_textView.setText(now.getTitle());
        introduction_detail_textView.setTextColor(0xff000000);
        imageView_detal.setImageResource(now.getImgid());

        //如果Img=nightImg => disable switch
        if(now.getImgid()==now.getImgid_night()){
            nightmode_switch.setEnabled(false);
        }

        //set nightmode_switch listener
        nightmode_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Introductphoto now = introductphotolist.get(now_num);

                if(compoundButton.isChecked()){
                    Log.v("Switch_test","Open >_<");
                    Toast.makeText(Introduction_detalActivity.this,"Change !!!!",Toast.LENGTH_SHORT).show();
                    imageView_detal.setImageResource(now.getImgid_night());
                } else{
                    Log.v("Switch_test","Close!!!!");
                    Toast.makeText(Introduction_detalActivity.this,"Revert @_@!",Toast.LENGTH_SHORT).show();
                    imageView_detal.setImageResource(now.getImgid());
                }
            }
        });
    }
}
