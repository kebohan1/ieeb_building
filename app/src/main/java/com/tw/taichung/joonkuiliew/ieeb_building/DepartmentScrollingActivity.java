package com.tw.taichung.joonkuiliew.ieeb_building;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class DepartmentScrollingActivity extends AppCompatActivity {
    static ArrayList<Department> departmentlist = new ArrayList<Department>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_scrolling);

    }
}
