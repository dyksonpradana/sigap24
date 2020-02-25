package com.sigap.dua.empat.layananPolres.satResKrim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sigap.dua.empat.R;

import net.dankito.richtexteditor.android.RichTextEditor;

public class SidikJariActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        RichTextEditor textArticle = findViewById(R.id.text_article);

        textArticle.setHtml(getString(R.string.article_sidik_jari));

        textArticle.setInputEnabled(false);

        Button whatsapp = findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smsNumber = "6287700711001"; //without '+'
                try {
                    Intent sendIntent = new Intent("android.intent.action.MAIN");
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                    sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net");
                    sendIntent.setPackage("com.whatsapp");
                    startActivity(sendIntent);
                } catch(Exception e) {
                    Toast.makeText(SidikJariActivity.this, "Error\n" + e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
