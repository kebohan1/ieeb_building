package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class ScrollingintroductionphotoActivity extends AppCompatActivity {
    static ArrayList<Introductphoto> introductphotolist = new ArrayList<Introductphoto>();
    private IntroductphotoArrayAdapter aboutphotoadapter;
    private ListView ls_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_photoscrolling);

        //clear
        introductphotolist.clear();

        //Class Introductphoto 建構值沒給Night Image時 會自動將白天imgid導入夜間模式的imgid
        //add項目
        Introductphoto college_of_information_office = new Introductphoto("資電學院辦公室",R.drawable.college_of_information_office);
        introductphotolist.add(college_of_information_office);
        Introductphoto electrical_engineering_office = new Introductphoto("電機工程學系辦公室",R.drawable.electrical_engineering_office);
        introductphotolist.add(electrical_engineering_office);
        Introductphoto information_engineering_office = new Introductphoto("資訊工程學系辦公室",R.drawable.information_engineering_office,R.drawable.information_engineering_office_2);
        introductphotolist.add(information_engineering_office);
        Introductphoto center_chinese = new Introductphoto("國語文中心",R.drawable.center_chinese,R.drawable.center_chinese_2);
        introductphotolist.add(center_chinese);
        Introductphoto language_center = new Introductphoto("外語言中心",R.drawable.language_center,R.drawable.language_center_2);
        introductphotolist.add(language_center);
        Introductphoto language_self_stydy_center = new Introductphoto("語言自學中心",R.drawable.language_self_stydy_center);
        introductphotolist.add(language_self_stydy_center);
        Introductphoto b22 = new Introductphoto("B22視聽室",R.drawable.b22,R.drawable.b22_2);
        introductphotolist.add(b22);
        Introductphoto classroom = new Introductphoto("教室",R.drawable.classroom,R.drawable.classroom_2);
        introductphotolist.add(classroom);
        Introductphoto corridor_1_floor = new Introductphoto("一樓走廊",R.drawable.corridor_1_floor);
        introductphotolist.add(corridor_1_floor);
        Introductphoto hall = new Introductphoto("一樓穿堂",R.drawable.hall,R.drawable.hall_2);
        introductphotolist.add(hall);
        Introductphoto engine_room = new Introductphoto("QOIT機房",R.drawable.engine_room,R.drawable.engine_room_3);
        introductphotolist.add(engine_room);
        Introductphoto g_print = new Introductphoto("G  Print",R.drawable.g_print);
        introductphotolist.add(g_print);
        Introductphoto international_room_3rd = new Introductphoto("第三國際會議廳",R.drawable.international_room_3rd);
        introductphotolist.add(international_room_3rd);
        Introductphoto elevator = new Introductphoto("電梯間",R.drawable.elevator,R.drawable.elevator_2);
        introductphotolist.add(elevator);
        Introductphoto east_door = new Introductphoto("資電學院東門",R.drawable.east_door);
        introductphotolist.add(east_door);
        Introductphoto main_sign_south_door = new Introductphoto("資電學院南門",R.drawable.main_sign_south_door,R.drawable.main_sign_south_door_2);
        introductphotolist.add(main_sign_south_door);
        Introductphoto north_door = new Introductphoto("資電學院北門",R.drawable.north_door,R.drawable.north_door_2);
        introductphotolist.add(north_door);
        Introductphoto obstacle_free_passageway = new Introductphoto("資電學院南門-無障礙通道",R.drawable.obstacle_free_passageway);
        introductphotolist.add(obstacle_free_passageway);
        Introductphoto west_door = new Introductphoto("資電學院西門",R.drawable.west_door);
        introductphotolist.add(west_door);

        //listView建置
        aboutphotoadapter = new IntroductphotoArrayAdapter(this,introductphotolist);
        ls_photo = (ListView)findViewById(R.id.listView_about_photo);
        ls_photo.setAdapter(aboutphotoadapter);

        //listView點擊監聽和跳轉
        ls_photo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListView listView = (ListView) adapterView;
                Intent intent = new Intent();
                intent.setClass(ScrollingintroductionphotoActivity.this,Introduction_detalActivity.class);
                intent.putExtra("now_num",i);
                startActivity(intent);
            }
        });
    }

    //相關圖片listView的adapter
    class IntroductphotoArrayAdapter extends ArrayAdapter<Introductphoto> {
        Context context;

        public IntroductphotoArrayAdapter(Context context,
                                 ArrayList<Introductphoto> items) {
            super(context, 0, items);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(context);
            LinearLayout itemlayout = null;

            if(convertView == null) {
                itemlayout = (LinearLayout)inflater.inflate(R.layout.content_introduct_photoscolling, null);
            } else {
                itemlayout = (LinearLayout) convertView;
            }

            Introductphoto item = (Introductphoto)getItem(position);
            TextView tv_title = (TextView)itemlayout.findViewById(R.id.introduct_photo_lv_text);
            tv_title.setText(item.getTitle());
            ImageView iv = (ImageView)itemlayout.findViewById(R.id.introduct_photo_lv_image);
            iv.setImageResource(item.getImgid());
            return itemlayout;
        }
    }

}
