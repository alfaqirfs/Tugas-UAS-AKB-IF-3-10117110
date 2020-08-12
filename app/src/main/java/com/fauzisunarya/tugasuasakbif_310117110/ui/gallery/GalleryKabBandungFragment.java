package com.fauzisunarya.tugasuasakbif_310117110.ui.gallery;

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
public class GalleryKabBandungFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery_kab_bandung, container, false);

        Spinner spinner = view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.wilayah2, R.layout.style_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:


//                        break;
                    case 1:
//                        FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
//                        fragmentTransaction1.replace(R.id.fragment_container, new GalleryKotaBandungFragment());
//                        fragmentTransaction1.commit();
                        break;
                    case 2:
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.container, new GalleryKabBandungBaratFragment());
                        fragmentTransaction.commit();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ImageSlider imageSlider = view.findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Air-Panas-Cimanggu.jpg", "Air Panas Cimanggu"));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSSR4rGreGX9iG6Oi8cUN_B1Ap58ST0_xBhjQ&usqp=CAU", "Air Panas Cimanggu"));
        slideModels.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ-frATWQH7iEfeP76kJlC3L5hqJ0Noh8cH0Q&usqp=CAU", "Air Panas Cimanggu"));
        imageSlider.setImageList(slideModels, true);

        ImageSlider imageSlider2 = view.findViewById(R.id.slider2);
        List<SlideModel> slideModels2 = new ArrayList<>();
        slideModels2.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Bukit-Jamur-Rancabolang-Ciwidey.jpg", "Bukit Jamur Rancabolang Ciwidey"));
        slideModels2.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ3yHL5uZI6T84kCdREqP7Npi0SVoAISbVFHA&usqp=CAU", "Bukit Jamur Rancabolang Ciwidey"));
        slideModels2.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTOqsxWKt6E-c6BWCGRZ1-ejhbA94XlQ5JZLw&usqp=CAU", "Bukit Jamur Rancabolang Ciwidey"));
        imageSlider2.setImageList(slideModels2, true);

        ImageSlider imageSlider3 = view.findViewById(R.id.slider3);
        List<SlideModel> slideModels3 = new ArrayList<>();
        slideModels3.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Ciwidey-Valley-Resort.jpg", "Ciwidey Valley Resort"));
        slideModels3.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTteoQgRYdpsP5DaMwwR6ChXXDVQhk_0SsqVg&usqp=CAU", "Ciwidey Valley Resort"));
        slideModels3.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSyPJDUhKm9pcUc1p4gcnzHiah-jMEYNIxzog&usqp=CAU", "Ciwidey Valley Resort"));
        imageSlider3.setImageList(slideModels3, true);

        ImageSlider imageSlider4 = view.findViewById(R.id.slider4);
        List<SlideModel> slideModels4 = new ArrayList<>();
        slideModels4.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Curug-Upas.jpg", "Curug Upas"));
        slideModels4.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRUXI52EmkF2_P-FJq3Lt2SlJFZxWb-nYCbCQ&usqp=CAU", "Curug Upas"));
        imageSlider4.setImageList(slideModels4, true);

        ImageSlider imageSlider5 = view.findViewById(R.id.slider5);
        List<SlideModel> slideModels5 = new ArrayList<>();
        slideModels5.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Danau-Situ-Patenggang.jpg", "Danau Situ Patenggang"));
        slideModels5.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTubBRUYS-GwDBxP8qKW9We28T8oXj6Spp7dA&usqp=CAU", "Danau Situ Patenggang"));
        slideModels5.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSNvBNr_95-oOO5sIPxR2T4O46yLkZ4z9t6xQ&usqp=CAU", "Danau Situ Patenggang"));
        imageSlider5.setImageList(slideModels5, true);

        ImageSlider imageSlider6 = view.findViewById(R.id.slider6);
        List<SlideModel> slideModels6 = new ArrayList<>();
        slideModels6.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Gunung-Puntang.jpg", "Gunung Puntang"));
        slideModels6.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQg-myz5GtTa2rmjhHoAf2mpuXVJK9F2QS4ow&usqp=CAU", "Gunung Puntang"));
        slideModels6.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQoMT5WK7lwVa0AOU4qMy17KlaR4OKgse1Vvg&usqp=CAU", "Gunung Puntang"));
        imageSlider6.setImageList(slideModels6, true);

        ImageSlider imageSlider7 = view.findViewById(R.id.slider7);
        List<SlideModel> slideModels7 = new ArrayList<>();
        slideModels7.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS-3E54leToLZfEaFOaCX91n8GOR-M2b5ML0Q&usqp=CAU", "Kawah Putih"));
        slideModels7.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT81nJz9aJUE5c4KNMjFAF8xjLGlp8X7P2o9g&usqp=CAU", "Kawah Putih"));
        imageSlider7.setImageList(slideModels7, true);

        ImageSlider imageSlider8 = view.findViewById(R.id.slider8);
        List<SlideModel> slideModels8 = new ArrayList<>();
        slideModels8.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Ranca-Upas.jpg", "Ranca Upas"));
        slideModels8.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQn7XL5IBaWqkzg9EqegW-qCH8SVftAQzuQjg&usqp=CAU", "Ranca Upas"));
        imageSlider8.setImageList(slideModels8, true);

        ImageSlider imageSlider9 = view.findViewById(R.id.slider9);
        List<SlideModel> slideModels9 = new ArrayList<>();
        slideModels9.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Situ-Patenggang.jpg", "Situ Patenggang"));
        slideModels9.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSgBBgtA9IsJAfbcdF_9loNAmVyq6DTdu7mXA&usqp=CAU", "Situ Patenggang"));
        slideModels9.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQqG2dnOcUje1or8gtueqzvxSljUgTGp_6hJA&usqp=CAU", "Situ Patenggang"));
        imageSlider9.setImageList(slideModels9, true);

        return view;
    }
}