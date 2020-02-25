package com.sigap.dua.empat.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sigap.dua.empat.R;

public class GridAdapter extends BaseAdapter {
    Intent intents[];
    String layanan[];
    Context context;
    int logos[];
    LayoutInflater inflter;
    public GridAdapter(Context applicationContext, int[] logos, String[] layanan, Intent[] intents) {
        this.context = applicationContext;
        this.logos = logos;
        this.layanan = layanan;
        this.intents = intents;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return logos.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.grid_item, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.grid_item_icons); // get the reference of ImageView
        icon.setImageResource(logos[position]); // set logo images

        TextView title = view.findViewById(R.id.grid_item_title);
        title.setText(layanan[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(intents[position]);
            }
        });

        return view;
    }
}
