package com.tw.taichung.joonkuiliew.ieeb_building;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class skillArrayAdapter extends ArrayAdapter<String> {
    Context context;

    public skillArrayAdapter(Context context, List<String> items) {
        super(context, 0, items);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if (convertView == null) {
            itemlayout = (LinearLayout) inflater.inflate(R.layout.skill_item, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        String item = (String) getItem(position);
        TextView university = (TextView) itemlayout.findViewById(R.id.skill_et);
        university.setText(""+item);
        return itemlayout;
    }

}

