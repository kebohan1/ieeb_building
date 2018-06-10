package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Floor_tourActivity extends AppCompatActivity {
    private ImageView floor_imageView;
    private ImageView map_imageView;
    private TextView floor_name_textView; //樓層
    private TextView floordetile_textView; //主要系所

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_tour);

        //var declare
        floor_imageView = findViewById(R.id.floor_imageView);
        map_imageView = findViewById(R.id.map_imageView);
        floor_name_textView = findViewById(R.id.floor_name_textView);
        floordetile_textView = findViewById(R.id.floordetile_textView);

        //get choice floor
        Intent intent = new Intent();
        int now_floor = intent.getIntExtra("floor_key",0);

        //select action
        switch (now_floor){
            case -1:
                //還沒有圖片 底下那行為圖片設置程式碼
                //floor_imageView.setImageResource(R.id.B1);
                //map_imageView.setImageResource(R.id.B1_map);
                floor_name_textView.setText("資電館B1");
                floordetile_textView.setText("主要系所:{}{}學系");
                break;
            case 1:
                //還沒有圖片 底下那行為圖片設置程式碼
                //floor_imageView.setImageResource(R.id.first);
                //map_imageView.setImageResource(R.id.first_map);
                floor_name_textView.setText("資電館1F");
                floordetile_textView.setText("主要系所:..學系");
                break;
            case 2:
                //還沒有圖片 底下那行為圖片設置程式碼
                //floor_imageView.setImageResource(R.id.second);
                //map_imageView.setImageResource(R.id.second_map);
                floor_name_textView.setText("資電館2F");
                floordetile_textView.setText("主要系所:資訊工程學系");
                break;
            case 3:
                //還沒有圖片 底下那行為圖片設置程式碼
                //floor_imageView.setImageResource(R.id.thr);
                //map_imageView.setImageResource(R.id.thr_map);
                floor_name_textView.setText("資電館3F");
                floordetile_textView.setText("主要系所:__ __學系");
                break;
            case 4:
                //還沒有圖片 底下那行為圖片設置程式碼
                //floor_imageView.setImageResource(R.id.fourth);
                //map_imageView.setImageResource(R.id.fourth_map);
                floor_name_textView.setText("資電館4F");
                floordetile_textView.setText("主要系所:XX學系");
                break;
            case 5:
                //還沒有圖片 底下那行為圖片設置程式碼
                //floor_imageView.setImageResource(R.id.fifth);
                //map_imageView.setImageResource(R.id.fifth_map);
                floor_name_textView.setText("資電館5F");
                floordetile_textView.setText("主要系所:??學系");
                break;
            default:
                floor_name_textView.setText("BUG");
                floordetile_textView.setText("Error Error");
        }
    }
}
