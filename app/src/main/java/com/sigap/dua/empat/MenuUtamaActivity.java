package com.sigap.dua.empat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuUtamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

    }

    public void onClickLayananPolres(View v){
        Intent i = new Intent(MenuUtamaActivity.this, MenuLayananPolres.class);
        MenuUtamaActivity.this.startActivity(i);
    }
}
