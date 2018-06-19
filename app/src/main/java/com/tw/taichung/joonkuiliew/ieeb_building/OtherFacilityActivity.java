package com.tw.taichung.joonkuiliew.ieeb_building;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class OtherFacilityActivity extends AppCompatActivity {

    private Spinner facility;
    private Spinner floor;
    private ImageView facility_img_map;
    private final String[] facility_item = {"請選擇設施","販賣機"};
    private final String[] floor_item = {"請選擇樓層","B1","1F","2F","3F","4F","5F",};
    private String select_facility;
    private ArrayAdapter facilityAdapter;
    private ArrayAdapter floorAdapter;
    private int select_floor;
    private int now_sel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_facility);

        // var dealer
        facility = (Spinner) findViewById(R.id.facility_spinner);
        floor = (Spinner) findViewById(R.id.floor_spinner);
        facility_img_map = (ImageView) findViewById(R.id.facility_imageView);

        //set text in spinner
        facilityAdapter = new ArrayAdapter(OtherFacilityActivity.this, R.layout.support_simple_spinner_dropdown_item, facility_item);
        facility.setAdapter(facilityAdapter);
        floorAdapter = new ArrayAdapter(OtherFacilityActivity.this, R.layout.support_simple_spinner_dropdown_item, floor_item);
        floor.setAdapter(floorAdapter);

        //spinner select Listener
        facility.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(facility.getSelectedItem() == "請選擇設施") {
                    //Do nothing.
                }
                else {
                    if(now_sel!=position){
                        floor.setSelection(0,true);
                        now_sel = position;
                    }
                    select_facility = facility_item[position];
                    //Toast.makeText(OtherFacilityActivity.this, "選擇樓層", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        floor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(floor.getSelectedItem() == "請選擇樓層") {
                    //Do nothing.
                }
                else if(facility.getSelectedItemPosition() == 0){
                    Toast.makeText(OtherFacilityActivity.this,"請先選擇設施",Toast.LENGTH_SHORT).show();
                    floor.setSelection(0,true);
                }
                else{
                    //0:B1,1:1F  etc.....
                    select_floor = position;
                    setImage();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private void setImage(){
        //imageView Set
        if (select_facility != null) {
            if (select_facility.equals("販賣機")) {
                switch (select_floor) {
                    case 1:
                        Toast.makeText(OtherFacilityActivity.this,"在B22 正對面!!",Toast.LENGTH_SHORT).show();
                        facility_img_map.setColorFilter(null);
                        facility_img_map.setImageResource(R.drawable.vending_machine_b1_2);
                        break;
                    case 2:
                        Toast.makeText(OtherFacilityActivity.this,"資電館北門的入口處",Toast.LENGTH_SHORT).show();
                        facility_img_map.setColorFilter(0xffaaaaaa);
                        break;
                    case 3:
                        Toast.makeText(OtherFacilityActivity.this,"此地無該設施",Toast.LENGTH_SHORT).show();
                        facility_img_map.setColorFilter(0xffaaaaaa);
//                        facility.setSelection(0,true);
                        floor.setSelection(0,true);
                        break;
                    case 4:
                        Toast.makeText(OtherFacilityActivity.this,"此地無該設施",Toast.LENGTH_SHORT).show();
                        floor.setSelection(0,true);
//                        facility.setSelection(0,true);
                        facility_img_map.setColorFilter(0xffaaaaaa);
                        break;
                    case 5:
                        Toast.makeText(OtherFacilityActivity.this,"此地無該設施",Toast.LENGTH_SHORT).show();
                        floor.setSelection(0,true);
//                        facility.setSelection(0,true);
                        facility_img_map.setColorFilter(0xffaaaaaa);;
                        break;
                    case 6:
                        Toast.makeText(OtherFacilityActivity.this,"此地無該設施",Toast.LENGTH_SHORT).show();
                        floor.setSelection(0,true);
//                        facility.setSelection(0,true);
                        facility_img_map.setColorFilter(0xffaaaaaa);
                        break;
                }
            }
        }
    }
}
