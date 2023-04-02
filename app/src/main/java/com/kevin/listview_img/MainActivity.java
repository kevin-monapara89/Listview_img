package com.kevin.listview_img;





import static com.kevin.listview_img.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listtxt;

    int image[] = {img_1,img_2,img_3,img_4,img_5,img_6,img_7,img_8,img_9,img_10,img_11,img_12,img_13,img_14,img_15,
    img_16,img_17,img_18,img_19,img_20,img_21,img_22,img_23,img_24,img_25,img_26,img_27,img_28,img_29,img_30};

    String name[] = {"Surat","Ahmedabad","Vadodara","Rajkot","Mumbai","Pune","Chennai","Bangalore","Hyderabad","Kolkata","Delhi","Jaipur","Lucknow","Kanpur","Nagpur",
                     "Indore","Thane","Bhopal","Visakhapatnam","Patna","Ludhiana","Agra","Nashik","Varanasi","Amritsar","Srinagar","Navi mumbai","Ranchi","Jodhpur","Gandhinagar"};

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