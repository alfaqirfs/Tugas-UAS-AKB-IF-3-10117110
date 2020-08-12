package com.fauzisunarya.tugasuasakbif_310117110.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fauzisunarya.tugasuasakbif_310117110.models.WisataData;
import com.fauzisunarya.tugasuasakbif_310117110.models.Wisata;
import com.fauzisunarya.tugasuasakbif_310117110.ui.list.ListWisata;
import com.fauzisunarya.tugasuasakbif_310117110.R;
import com.fauzisunarya.tugasuasakbif_310117110.adapter.WisataAdapter;

import java.util.ArrayList;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 06-08-2020**/
public class HomeFragment extends Fragment {
    private ArrayList<Wisata> lisWisata;
    private RecyclerView recyclerView;


    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_home, container, false);
    recyclerView = view.findViewById(R.id.rv_movie);
    recyclerView.setHasFixedSize(true);
    lisWisata = new ArrayList<>();
    lisWisata.addAll(WisataData.getListData());

    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    WisataAdapter wisataAdapter = new WisataAdapter(getActivity());
    wisataAdapter.setLisWisata(lisWisata);
    recyclerView.setAdapter(wisataAdapter);

    TextView tvAllWisata = view.findViewById(R.id.tv_all_wisata);
    tvAllWisata.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), ListWisata.class);
            startActivity(intent);
        }
    });
    return view;

    }

}