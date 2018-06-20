package com.tw.taichung.joonkuiliew.ieeb_building;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class inexperimentArrayAdapter extends ArrayAdapter<Inexperiment> {
    Context context;

    public inexperimentArrayAdapter(Context context, List<Inexperiment> items) {
        super(context, 0, items);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if (convertView == null) {
            itemlayout = (LinearLayout) inflater.inflate(R.layout.inexperiment_item, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }
        Inexperiment item = (Inexperiment) getItem(position);
        TextView university = (TextView) itemlayout.findViewById(R.id.et_department_inexp);
        university.setText(item.getDepartment());
        TextView department = (TextView) itemlayout.findViewById(R.id.et_job_experiment);
        department.setText(item.getJobs());
        return itemlayout;
    }
}
