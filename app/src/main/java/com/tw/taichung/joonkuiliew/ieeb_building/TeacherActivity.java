package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {
    private educationArrayAdapter educationArrayAdapters = null;
    private inexperimentArrayAdapter inexperimentArrayAdapters = null;
    private skillArrayAdapter skillArrayAdapters=null;
    private ImageView photo;
    private TextView teacher_jobs_textview;
    private TextView teacher_name;
    private TextView teacher_email;
    private TextView teacher_tel;
    private TextView teacher_office;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
//        educationArrayAdapters.clear();
//        inexperimentArrayAdapters.clear();
//        skillArrayAdapters.clear();
        Intent intent = getIntent();
        Teacher teacher = null;
        Bundle bundle = intent.getExtras();

        String name = bundle.getString("name");
        String department = bundle.getString("department");
        String email = bundle.getString("email");
        String jobs = bundle.getString("jobs");
        String tel = bundle.getString("tel");
        String office = bundle.getString("office");
        Bitmap img = bundle.getParcelable("bitmap");
        String[] skills_s = bundle.getStringArray("skills");
        ArrayList<String> skills = new ArrayList<>();

        photo=(ImageView)findViewById(R.id.iv_pic);
        photo.setImageBitmap(img);
        teacher_jobs_textview = (TextView) findViewById(R.id.tv_teacher_job);
        teacher_name = (TextView) findViewById(R.id.tv_teacher_name);
        teacher_name.setText(name);
        //Log.e("ds",email);
        teacher_email = (TextView) findViewById(R.id.tv_email);
        teacher_email.setText(email);
        teacher_tel = (TextView) findViewById(R.id.tv_tel);
        teacher_tel.setText(tel);
        teacher_office = (TextView) findViewById(R.id.tv_office);
        teacher_office.setText(office);
        for(int i=0;i<skills_s.length;i++)
        {
            if(skills_s[i]!=null)
            {
                skills.add(skills_s[i]);
            }

        }
        teacher_jobs_textview.setText(jobs);
        ListView skills_view = (ListView)findViewById(R.id.list_skill);
        skillArrayAdapters =new skillArrayAdapter(this,skills);
        skills_view.setAdapter(skillArrayAdapters);

    }

}
