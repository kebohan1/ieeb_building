package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Department_detailScrollingActivity extends AppCompatActivity {
    private ImageView department_detail_imageView;
    private TextView department_detail_textView;
    private TextView dep_content;
    private ArrayList<Department> departmentlist;
    private int now_num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_detail_scrolling);

        //Catch item num
        Intent intent = this.getIntent();
        now_num = intent.getIntExtra("now_num", 0);
        Log.v("Now Item Num",String.valueOf(now_num));

        //var declare
        department_detail_imageView = findViewById(R.id.department_detail_imageView);
        department_detail_textView = findViewById(R.id.department_detail_textView);
        departmentlist = DepartmentScrollingActivity.departmentlist;
        Department now = departmentlist.get(now_num);

        //image text(title) set
        department_detail_imageView.setImageResource(now.getImgid());
        department_detail_textView.setText(now.getTitle());
        department_detail_textView.setTextColor(0xff000000);

        //text set(content)
        dep_content = findViewById(R.id.dep_content);
        dep_content.setText(now.getIntroduct_dep());
        dep_content.setTextColor(0xff000000);
    }
}
