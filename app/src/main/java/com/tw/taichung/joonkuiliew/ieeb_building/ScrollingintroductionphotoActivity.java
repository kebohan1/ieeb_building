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

        //Class Introductphoto 建構值沒給Night Image時 會自動將白天imgid導入夜間模式的imgid
        //測試項目
        Introductphoto test = new Introductphoto("電梯間",R.drawable.ic_launcher_background);
        introductphotolist.add(test);

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
            tv_title.setText(item.title);
            ImageView iv = (ImageView)itemlayout.findViewById(R.id.introduct_photo_lv_image);
            iv.setImageResource(item.imgid);
            return itemlayout;
        }
    }

}
