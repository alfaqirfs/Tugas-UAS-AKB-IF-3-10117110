package com.fauzisunarya.tugasuasakbif_310117110.ui.gallery;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.fauzisunarya.tugasuasakbif_310117110.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 09-08-2020**/
public class GalleryKabBandungBaratFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery_kab_bandung_barat, container, false);
        ImageSlider imageSlider = view.findViewById(R.id.slider);
        Spinner spinner = view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.wilayah3, R.layout.style_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
//                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//                        fragmentTransaction.replace(R.id.fragment_container, new GalleryKabBandungBaratFragment());
//                        fragmentTransaction.commit();

                        break;
                    case 1:
                        FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.container, new GalleryKotaBandungFragment());
                        fragmentTransaction1.commit();
                        break;
                    case 2:
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.container, new GalleryKabBandungFragment());
                        fragmentTransaction.commit();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Bird-Pavilion.jpg", "Bird Pavilion"));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTvOfrc_ShBlPfqBSYGpG-aJL6s5Mq_De4wCA&usqp=CAU", "Bird Pavilion"));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRA67vvLfLpwZ11MJAwWUp_GNrc9A0PG_ERlw&usqp=CAU", "Bird Pavilion"));
        imageSlider.setImageList(slideModels, true);

        ImageSlider imageSlider2 = view.findViewById(R.id.slider2);
        List<SlideModel> slideModels2 = new ArrayList<>();
        slideModels2.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Curug-Cimahi.jpg", "Curug Cimahi"));
        slideModels2.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ_nQ4qGpNAxmYKBQ-rbz1vlHwCAlJTrc9D9g&usqp=CAU", "Curug Cimahi"));
        slideModels2.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTnVll_i9r6jraWNZaLE9Ub9MoTLSEcAnM5sA&usqp=CAU", "Curug Cimahi"));
        imageSlider2.setImageList(slideModels2, true);

        ImageSlider imageSlider3 = view.findViewById(R.id.slider3);
        List<SlideModel> slideModels3 = new ArrayList<>();
        slideModels3.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Curug-Malela.jpg", "Curug Malela"));
        slideModels3.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQBIxeQB1h7EcNWwQ8ct91R3FhfDoz_Nro2Wg&usqp=CAU", "Curug Malela"));
        slideModels3.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSxqeFp1VA4E3BHDmkfUfkFmduaYFJ0HKirAg&usqp=CAU", "Curug Malela"));
        imageSlider3.setImageList(slideModels3, true);

        ImageSlider imageSlider4 = view.findViewById(R.id.slider4);
        List<SlideModel> slideModels4 = new ArrayList<>();
        slideModels4.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Curug-Tilu-Leuwi-Opat-Lembang.jpg", "Curug Tilu Leuwi Opat Lembang"));
        slideModels4.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSCSUR5FaSfYHz_SfgUEK4F7kDR9ANBS4KsIg&usqp=CAU", "Curug Tilu Leuwi Opat Lembang"));
        slideModels4.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSGaBHuMXCjz-ySq-umhAD43E4ntfqyfBqA7g&usqp=CAU", "Curug Tilu Leuwi Opat Lembang"));
        imageSlider4.setImageList(slideModels4, true);

        ImageSlider imageSlider5 = view.findViewById(R.id.slider5);
        List<SlideModel> slideModels5 = new ArrayList<>();
        slideModels5.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Farm-House.jpg", "Farm House"));
        slideModels5.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTZp1FfZWLTfY5sM4WREYCiTue-dCEs7-HD3Q&usqp=CAU", "Farm House"));
        slideModels5.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRdatRaMB-f3HQ2ixwcsymcXf_qvmSJN1uLyA&usqp=CAU", "Farm House"));
        imageSlider5.setImageList(slideModels5, true);

        ImageSlider imageSlider6 = view.findViewById(R.id.slider6);
        List<SlideModel> slideModels6 = new ArrayList<>();
        slideModels6.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Gunung-Batu-Lembang.jpg", "Gunung Batu Lembang"));
        slideModels6.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSTXkbZXhZ4XMv1_c_ml7KHIE4XdG0EwoajHA&usqp=CAU", "Gunung Batu Lembang"));
        slideModels6.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSmvp7yRWG0hq5kxUhdU8pJBZeOdBGqU-VZ7g&usqp=CAU", "Gunung Batu Lembang"));
        imageSlider6.setImageList(slideModels6, true);

        ImageSlider imageSlider7 = view.findViewById(R.id.slider7);
        List<SlideModel> slideModels7 = new ArrayList<>();
        slideModels7.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Gunung-Tangkuban-Perahu.jpg", "Gunung Tangkuban Perahu"));
        slideModels7.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSK-EWQGoefJ6lZrlefZIVXJhvModE5d8QT_w&usqp=CAU", "Gunung Tangkuban Perahu"));
        slideModels7.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQi0H66juHzodN-4k4jFGodo6V_C94FeP-8sQ&usqp=CAU", "Gunung Tangkuban Perahu"));
        imageSlider7.setImageList(slideModels7, true);

        ImageSlider imageSlider8 = view.findViewById(R.id.slider8);
        List<SlideModel> slideModels8 = new ArrayList<>();
        slideModels8.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Kebun-Teh-Sukawana.jpg", "Kebun Teh Sukawana"));
        slideModels8.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQl15X--1GruFdh2egtDtlqiuP16KaWONxGiA&usqp=CAU", "Kebun Teh Sukawana"));
        slideModels8.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQyTLS3SUUVzgGDHMd8Au5FPvyp_HOv-VufYg&usqp=CAU", "Kebun Teh Sukawana"));
        imageSlider8.setImageList(slideModels8, true);

        ImageSlider imageSlider9 = view.findViewById(R.id.slider9);
        List<SlideModel> slideModels9 = new ArrayList<>();
        slideModels9.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Observatorium-Bosscha.jpg", "Observatorium Bosscha"));
        slideModels9.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRfYwppVWmW-Y4RauUDzgF_2HKN6OJzJafa7Q&usqp=CAU", "Observatorium Bosscha"));
        slideModels9.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRThDnIFCLaLonyrzgM1f6p5DIrGU98g_37Hw&usqp=CAU", "Observatorium Bosscha"));
        imageSlider9.setImageList(slideModels9, true);

        ImageSlider imageSlider10 = view.findViewById(R.id.slider10);
        List<SlideModel> slideModels10 = new ArrayList<>();
        slideModels10.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Orchid-Forest-Cikole.jpg", "Orchid Forest Cikole"));
        slideModels10.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRA7g5f-bTbINNqk6E-vQRFYrTLI2HVEfvvYQ&usqp=CAU", "Orchid Forest Cikole"));
        slideModels10.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTIazTuVqK2JIOxbqJJfeCBpu2QTtdXYre3Fw&usqp=CAU", "Orchid Forest Cikole"));
        imageSlider10.setImageList(slideModels10, true);

        return view;
    }
}