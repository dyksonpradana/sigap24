package com.sigap.dua.empat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import com.sigap.dua.empat.adapter.GridAdapter;
import com.sigap.dua.empat.layananPolres.satResKrim.SidikJariActivity;

public class MenuLayananPolres extends AppCompatActivity {

    int icons[] = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher};
    String layananPolres[] = {
            "Satuan Reskrim Kriminal",
            "Satuan Lalu Lintas",
            "Satuan Reserse Narkoba",
            "Satuan Intelejen Keamanan",
            "Satuan Pembinaan Masyarakat",
            "Satuan Propam",
            "UR Dokkes",
            "Lokasi Polres Pemalang"};
//    Intent intents[] = {new Intent(MenuLayananPolres.this, SidikJariActivity.class),new Intent(MenuLayananPolres.this, SidikJariActivity.class),new Intent(MenuLayananPolres.this, SidikJariActivity.class),new Intent(MenuLayananPolres.this, SidikJariActivity.class),new Intent(MenuLayananPolres.this, SidikJariActivity.class),new Intent(MenuLayananPolres.this, SidikJariActivity.class),new Intent(MenuLayananPolres.this, SidikJariActivity.class),new Intent(MenuLayananPolres.this, SidikJariActivity.class)};
    Intent intents[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_layanan_polres);

        intents = new Intent[]{
                new Intent(MenuLayananPolres.this, SidikJariActivity.class),
                new Intent(MenuLayananPolres.this, SidikJariActivity.class),
                new Intent(MenuLayananPolres.this, SidikJariActivity.class),
                new Intent(MenuLayananPolres.this, SidikJariActivity.class),
                new Intent(MenuLayananPolres.this, SidikJariActivity.class),
                new Intent(MenuLayananPolres.this, SidikJariActivity.class),
                new Intent(MenuLayananPolres.this, SidikJariActivity.class),
                new Intent(MenuLayananPolres.this, SidikJariActivity.class)};

        initializeGrid();
    }

    private void initializeGrid(){
        GridView gridView = findViewById(R.id.grid_view);

        GridAdapter adapter = new GridAdapter(this,icons,layananPolres,intents);
//                new Intent[]{
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class),
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class),
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class),
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class),
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class),
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class),
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class),
//                        new Intent(MenuLayananPolres.this, SidikJariActivity.class)}
//        );

        gridView.setAdapter(adapter);
    }
}
