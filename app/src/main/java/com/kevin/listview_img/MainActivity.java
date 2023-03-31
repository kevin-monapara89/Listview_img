package com.kevin.listview_img;

import static com.kevin.listview_img.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listtxt;

    int image[] = {img,img_1,img_2,img_3,img_4,img_5,};

    String name[] = {"1","2","3","4","5","6"};
    @Override
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