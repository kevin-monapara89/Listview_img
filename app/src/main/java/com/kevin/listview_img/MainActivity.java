package com.kevin.listview_img;

import static com.kevin.listview_img.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listtxt;

    int image[] = {R.drawable.img_1,img_2,img_3,img_4,img_5,img_6,img_7,img_8,img_9,img_10,img_11,img_12,img_13,img_14,img_15,};

    String name[] = {"Surat","Ahmedabad","Vadodara","Rajkot","Mumbai","Pune","Chennai","Bangalore","Hyderabad","Kolkata","Delhi","Jaipur","Lucknow","Kanpur","Nagpur"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listtxt = findViewById(R.id.listtxt);
        NameListAdapter adapter = new NameListAdapter(name,image);
        listtxt.setAdapter(adapter);
        listtxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            }
        });
    }
}