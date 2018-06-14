package com.tw.taichung.joonkuiliew.ieeb_building;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class OtherFacilityActivity extends AppCompatActivity {

    private Spinner facility;
    private Spinner floor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_facility);
    }
}
