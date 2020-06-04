package com.example.maplo.robbyadhanursetia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailRobbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_robby);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Robby robbyditerima = getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView lahir = (TextView)findViewById(R.id.content_lahir);
        TextView wafat = (TextView)findViewById(R.id.content_wafat);

        Glide.with(this).load(robbyditerima.getPhoto()).override(350,550).into(gamabar);
        name.setText(robbyditerima.getName());
        remarks.setText(robbyditerima.getRemarks());
        deskripsi.setText(robbyditerima.getDeskripsi());
        lahir.setText(robbyditerima.getLahir());
        wafat.setText(robbyditerima.getWafat());

        Log.i("photo", robbyditerima.getPhoto());
        Log.i("deskripsi", robbyditerima.getDeskripsi());
    }


}
