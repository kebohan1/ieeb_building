package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class OfficeActivity extends AppCompatActivity {
    static ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
    private TeacherArrayAdapter teacherArrayAdapter;
    private ListView ls_teacher;
    List<Teacher> teacher = new ArrayList<>();
    private static final int LIST_Teacher = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        //測試項目
        //Teacher test = new Teacher("KBH","資工學霸");
        //teacherlist.add(test);

        //listView建置
        teacherArrayAdapter = new TeacherArrayAdapter(this,teacherlist);
        ls_teacher = (ListView)findViewById(R.id.teacher_listView);
        ls_teacher.setAdapter(teacherArrayAdapter);
        gethotelfromFirebase();
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
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case LIST_Teacher: {
                    List<Teacher> teachers = (List<Teacher>)msg.obj;
                    refreshPetList(teachers);
                    break;
                }
            }
        }
    };

    private void refreshPetList(List<Teacher> teachers) {
        teacherArrayAdapter.clear();
        teacherArrayAdapter.addAll(teachers);

    }
    private void gethotelfromFirebase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                new FirebaseThread(dataSnapshot).start();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
    class FirebaseThread extends Thread {

        private DataSnapshot dataSnapshot;

        public FirebaseThread(DataSnapshot dataSnapshot) {
            this.dataSnapshot = dataSnapshot;
        }

        @Override
        public void run() {

            for (DataSnapshot ds : dataSnapshot.getChildren()) {
                DataSnapshot Name = ds.child("name");
                DataSnapshot picture = ds.child("photo");
                DataSnapshot tel = ds.child("tel");
                DataSnapshot skill = ds.child("skill");
                DataSnapshot educational = ds.child("educational");
                DataSnapshot email = ds.child("email");
                DataSnapshot office = ds.child("office");
                DataSnapshot department = ds.child("department");
                DataSnapshot inexperiment = ds.child("InExperiment");
                Education[] education = new Education[5];
                int i=0;
                for (DataSnapshot ds_a : educational.getChildren())
                {
                    education[i] = new Education();
                    DataSnapshot department_edu = ds_a.child("department");
                    DataSnapshot education_edu = ds_a.child("education");
                    DataSnapshot university_edu = ds_a.child("university");
                    education[i].setDepartment((String)department_edu.getValue());
                    education[i].setEducation((String)education_edu.getValue());
                    education[i].setUniversity((String)university_edu.getValue());
                    i++;
                }
                i=0;
                String[] skill_a = new String[5];
                for(DataSnapshot ds_b : skill.getChildren())
                {
                    DataSnapshot skill_name = ds_b.child("");
                    skill_a[i] = (String)skill_name.getValue();
                    i++;
                }
                i=0;
                Inexperiment[] inexperiment1 = new Inexperiment[15];
                for(DataSnapshot ds_b : inexperiment.getChildren())
                {
                    inexperiment1[i] = new Inexperiment();
                    DataSnapshot department_Inexperiment = ds_b.child("department");
                    DataSnapshot job_Inexperiment = ds_b.child("job");
                    inexperiment1[i].setDepartment((String)department_Inexperiment.getValue());
                    inexperiment1[i].setJobs((String)job_Inexperiment.getValue());
                    i++;
                }
                String TeacherName = (String) Name.getValue();
                String TeacherPic = (String) picture.getValue();
                String TeacherTel = (String) tel.getValue();
                String TeacherEmail = (String) email.getValue();
                String TeacherOffice = (String) office.getValue();
                String Teacherdepartment = (String) department.getValue();
                Bitmap TeacherImg = getImgBitmap(TeacherPic);
                Teacher item_Teacher = new Teacher(TeacherName,Teacherdepartment,TeacherTel,TeacherOffice,TeacherEmail,TeacherImg,skill_a,inexperiment1,education);
                teacher.add(item_Teacher);
                Log.v("Teacher", TeacherName + ";" + Teacherdepartment);
            }
            Message msg = new Message();
            msg.what = LIST_Teacher;
            msg.obj = teacher;
            handler.sendMessage(msg);
        }
    }
    private Bitmap getImgBitmap(String imgUrl) {
        try {
            URL url = new URL(imgUrl);
            Bitmap bm = BitmapFactory.decodeStream(url.openConnection()
                    .getInputStream());
            return bm;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
