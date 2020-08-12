package com.fauzisunarya.tugasuasakbif_310117110.ui.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fauzisunarya.tugasuasakbif_310117110.MainActivity;
import com.fauzisunarya.tugasuasakbif_310117110.models.Wisata;
import com.fauzisunarya.tugasuasakbif_310117110.ui.maps.MapsActivity;
import com.fauzisunarya.tugasuasakbif_310117110.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 09-08-2020**/
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Intent intent = getIntent();
        Wisata ws = intent.getParcelableExtra("wisataskuy");

        String title = ws.getWtitle();
        String desc = ws.getWdesc();

        CollapsingToolbarLayout cl = findViewById(R.id.collapsingAppbar);
        cl.setTitle(title);

        ImageView img = findViewById(R.id.iv_image);
        Glide.with(this).load(ws.getWimage()).into(img);
//        TextView tv_title = findViewById(R.id.tv_title);
//        tv_title.setText(title);
        TextView tv_desc = findViewById(R.id.tv_desc);
        tv_desc.setText(desc);

        FloatingActionButton fab = findViewById(R.id.maps);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DetailActivity.this, MapsActivity.class);
                startActivity(intent1);
            }
        });

    }

}