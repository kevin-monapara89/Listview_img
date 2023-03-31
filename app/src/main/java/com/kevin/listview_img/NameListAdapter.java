package com.kevin.listview_img;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class NameListAdapter extends BaseAdapter {

    String name[];
    int image[];

    public NameListAdapter(String[] name, int[] image) {
        this.name = name;
        this.image = image;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewlist,viewGroup,false);
        ImageView img = view.findViewById(R.id.img);
        TextView txt = view.findViewById(R.id.txt);
        Glide.with(viewGroup.getContext()).load(image[i]).into(img);
        txt.setText(name[i]);
        return view;
    }
}
