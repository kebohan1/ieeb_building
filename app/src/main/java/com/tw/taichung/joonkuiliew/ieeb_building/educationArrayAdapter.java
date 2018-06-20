package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class educationArrayAdapter extends ArrayAdapter<Education> {
    Context context;

    public educationArrayAdapter(Context context, List<Education> items) {
        super(context, 0, items);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if (convertView == null) {
            itemlayout = (LinearLayout) inflater.inflate(R.layout.education_item, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        Education item = (Education) getItem(position);
        TextView university = (TextView) itemlayout.findViewById(R.id.tv_University);
        university.setText(item.getUniversity());
        TextView department = (TextView) itemlayout.findViewById(R.id.tv_department);
        department.setText(item.getDepartment());
        TextView grade = (TextView) itemlayout.findViewById(R.id.tv_grade);
        grade.setText(item.getEducation());
        return itemlayout;
    }
}
