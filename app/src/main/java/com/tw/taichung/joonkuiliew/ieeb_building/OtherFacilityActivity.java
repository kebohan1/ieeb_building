package com.tw.taichung.joonkuiliew.ieeb_building;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class OtherFacilityActivity extends AppCompatActivity {

    private Spinner facility;
    private Spinner floor;
    private ImageView facility_img_map;
    private final String[] facility_item = {"廁所"};
    private final String[] floor_item = {"B1","1F","2F","3F","4F","5F"};
    private String select_facility;
    private int select_floor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_facility);

        // var dealer
        facility = (Spinner) findViewById(R.id.facility_spinner);
        floor = (Spinner) findViewById(R.id.floor_spinner);
        facility_img_map = (ImageView) findViewById(R.id.facility_imageView);

        //set text in spinner
        ArrayAdapter<String> facilityAdapter = new ArrayAdapter<>(OtherFacilityActivity.this, R.layout.support_simple_spinner_dropdown_item, facility_item);
        facility.setAdapter(facilityAdapter);
        ArrayAdapter<String> floorAdapter = new ArrayAdapter<>(OtherFacilityActivity.this, R.layout.support_simple_spinner_dropdown_item, floor_item);
        floor.setAdapter(floorAdapter);

        //spinner select Listener
        facility.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select_facility = facility_item[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        floor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //0:B1,1:1F  etc.....
                select_floor = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //imageView Set
        if (select_facility != null) {
            if (select_facility.equals(facility_item[0])) {
                switch (select_floor) {
                    case 0:
                        //facility_img_map.setImageResource();
                        break;
                    case 1:
                        //facility_img_map.setImageResource();
                        break;
                    case 2:
                        //facility_img_map.setImageResource();
                        break;
                    case 3:
                        //facility_img_map.setImageResource();
                        break;
                    case 4:
                        //facility_img_map.setImageResource();
                        break;
                    case 5:
                        //facility_img_map.setImageResource();
                        break;
                }
            }
        }
    }
}
