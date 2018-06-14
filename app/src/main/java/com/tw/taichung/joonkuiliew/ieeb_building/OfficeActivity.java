package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class OfficeActivity extends AppCompatActivity {
    static ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
    private TeacherArrayAdapter teacherArrayAdapter;
    private ListView ls_teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        //測試項目
        Teacher test = new Teacher("KBH","資工學霸");
        teacherlist.add(test);

        //listView建置
        teacherArrayAdapter = new TeacherArrayAdapter(this,teacherlist);
        ls_teacher = (ListView)findViewById(R.id.teacher_listView);
        ls_teacher.setAdapter(teacherArrayAdapter);

        //listView點擊監聽和跳轉
        ls_teacher.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListView listView = (ListView) adapterView;
                Intent intent = new Intent();
                intent.setClass(OfficeActivity.this,TeacherActivity.class);
                intent.putExtra("now_num",i);
                startActivity(intent);
            }
        });
    }

    //listView的adapter
    class TeacherArrayAdapter extends ArrayAdapter<Teacher> {
        Context context;

        public TeacherArrayAdapter(Context context,
                                      ArrayList<Teacher> items) {
            super(context, 0, items);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(context);
            LinearLayout itemlayout = null;

            if (convertView == null) {
                itemlayout = (LinearLayout) inflater.inflate(R.layout.content_teacher_item, null);
            } else {
                itemlayout = (LinearLayout) convertView;
            }

            Teacher item = (Teacher) getItem(position);
            TextView tv_name = (TextView) itemlayout.findViewById(R.id.teacher_name_textView);
            tv_name.setText(item.getTeacher_name());
            TextView tv_departmente = (TextView) itemlayout.findViewById(R.id.teacher_department_textView);
            tv_departmente.setText(item.getTeacher_dep());
            return itemlayout;
        }
    }
}
