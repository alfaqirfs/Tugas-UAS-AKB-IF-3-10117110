package com.fauzisunarya.tugasuasakbif_310117110.ui.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.fauzisunarya.tugasuasakbif_310117110.R;
import com.fauzisunarya.tugasuasakbif_310117110.adapter.ListWisataAdapter;
import com.fauzisunarya.tugasuasakbif_310117110.models.Wisata;
import com.fauzisunarya.tugasuasakbif_310117110.models.WisataGetData;

import java.util.ArrayList;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 06-08-2020**/
public class ListWisata extends AppCompatActivity {

    private ArrayList<Wisata> lisWisata;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_wisata);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        getSupportActionBar().setTitle("WisataBandung");
        recyclerView = findViewById(R.id.recycler_viewlist);
        recyclerView.setHasFixedSize(true);
        lisWisata = new ArrayList<>();
        lisWisata.addAll(WisataGetData.getListData());
        ShowRecyclerView();
    }

    private void ShowRecyclerView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(this);
        listWisataAdapter.setLisWisata(lisWisata);
        recyclerView.setAdapter(listWisataAdapter);
    }

}