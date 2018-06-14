package com.tw.taichung.joonkuiliew.ieeb_building;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Dean_ScrollingActivity extends AppCompatActivity {
    private ImageView dean_imageView;
    private TextView content_dean;
    private String dean_content = "專長:\n\n" + "1\n" + "行動計算/Mobile Computing\n" + "2\n" + "隨意網路/Ad-hoc Wireless Networks\n" + "3\n" + "網路代理人/Network Agents\n" + "4\n" + "容錯處理/Fault Tolerance\n" + "5\n" + "學習科技/Learning Technologies\n"+"\n\n最高學歷:\n\n" + "畢業學校\t主修學門系所\t學位\n" + "美國匹茲堡大學\t電腦科學\t博士\n" + "國立交通大學\t資訊工程\t\n" + "碩士\n" + "美國匹茲堡大學\t電腦科學\t碩士\n" + " \n\n校內經歷:\n\n" + "序號\t服務系所\t職稱\n" + "1\t資訊工程學系\t教授\n" + "2\t資訊工程學系(所)\t副教授\n" + "3\t資訊電機學院\t院長\n" + "4\t研究推動組\t組長\n" + "5\t研究發展處\t研發長\n" + "6\t產學合作與技術營運辦公室(籌備)\t執行長\n" + "7\t資訊工程學系\t系主任\n" + "8\t資訊電機學院\t秘書\n" + "9\t系統與網路組\t組長";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean_scrolling);

        //var declare
        dean_imageView = findViewById(R.id.dean_imageView);

        //image set
        //沒有設定照片(No Photo)
        //dean_imageView.setImageResource(R.id.);

        //text set (content)
        content_dean = findViewById(R.id.content_dean);
        content_dean.setText(dean_content);

    }
}
