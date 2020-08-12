package com.fauzisunarya.tugasuasakbif_310117110.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.fauzisunarya.tugasuasakbif_310117110.R;
import com.fauzisunarya.tugasuasakbif_310117110.ui.profile.ProfileFragment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 09-08-2020**/
public class GalleryKotaBandungFragment extends Fragment  {

//    GalleryKotaBandungFragment  galleryKotaBandungFragment;
//    GalleryKabBandungFragment galleryKabBandungFragment;
//    GalleryKabBandungBaratFragment galleryKabBandungBaratFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery_kota_bandung, container, false);



        Spinner spinner = view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.wilayah, R.layout.style_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            switch (position){
                case 0:
                    break;
                case 1:
                    FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.container, new GalleryKabBandungFragment());
                    fragmentTransaction1.commit();
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
        slideModels.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Ciumbuleuit.jpg", "Ciumbuleuit"));
        slideModels.add(new SlideModel("https://cdns.klimg.com/merdeka.com/i/w/news/2019/08/02/1098109/670x335/punclut-spot-instagramable-baru-di-puncak-ciumbuleuit-bandung.jpg", "Ciumbuleuit"));
        slideModels.add(new SlideModel("https://cdns.klimg.com/merdeka.com/i/w/news/2019/08/02/1098109/paging/540x270/menyeruput-minuman-hangat-sambil-meresapi-pemandangan.jpg", "Ciumbuleuit"));
        imageSlider.setImageList(slideModels, true);

        ImageSlider imageSlider2 = view.findViewById(R.id.slider2);
        List<SlideModel> slideModels2 = new ArrayList<>();
        slideModels2.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Curug-Dago.jpg", "Curug Dago"));
        slideModels2.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQClDcnxYRgjf0vLUbkIyJrQ5uZP7R_aLEVvg&usqp=CAU", "Curug Dago"));
        slideModels2.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSm1eamoQ2B9zNBrwgnc6ZwqZWXdZ_xw_5l0Q&usqp=CAU", "Curug Dago"));
        imageSlider2.setImageList(slideModels2, true);

        ImageSlider imageSlider3 = view.findViewById(R.id.slider3);
        List<SlideModel> slideModels3 = new ArrayList<>();
        slideModels3.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Jalan-Braga.jpg", "Jalan Braga"));
        slideModels3.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTdXL5wfSyAyrFptCFJX1h_F68LAagQVpTfQA&usqp=CAU", "Jalan Braga"));
        slideModels3.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRsI496952G7fuUZ4Z_8Ew_vu5GXuYCwrMPgQ&usqp=CAU", "Jalan Braga"));
        imageSlider3.setImageList(slideModels3, true);

        ImageSlider imageSlider4 = view.findViewById(R.id.slider4);
        List<SlideModel> slideModels4 = new ArrayList<>();
        slideModels4.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Museum-Gedung-Sate.jpg", "Museum Gedung Sate"));
        slideModels4.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQuKbBAJ5MUIG81VGXQuABqAxC1gc0T33Q6Iw&usqp=CAU", "Museum Gedung Sate"));
        slideModels4.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS7w4nMf6RSOOyXv90dFwwmPfM7rmqGAky55w&usqp=CAU", "Museum Gedung Sate"));
        imageSlider4.setImageList(slideModels4, true);

        ImageSlider imageSlider5 = view.findViewById(R.id.slider5);
        List<SlideModel> slideModels5 = new ArrayList<>();
        slideModels5.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Museum-Geologi-Bandung.jpg", "Museum Geologi"));
        slideModels5.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSmw7g-GuMKRpTJw8SmruG0lG1N7IoK5ifCXA&usqp=CAU", "Museum Geologi"));
        slideModels5.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTvGggBTruCjSgwNZeJV8pUvkRzi8IyIM0yng&usqp=CAU", "Museum Geologi"));
        imageSlider5.setImageList(slideModels5, true);

        ImageSlider imageSlider6 = view.findViewById(R.id.slider6);
        List<SlideModel> slideModels6 = new ArrayList<>();
        slideModels6.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Puncak-Bintang.jpg", "Puncak Bintang"));
        slideModels6.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTUOBO19zBfP5FjCurU38wMp_3PHXLJJMecQA&usqp=CAU", "Puncak Bintang"));
        slideModels6.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRost1nwdrBFXS6boAVgLUMhrajfHXCCpLZ2A&usqp=CAU", "Puncak Bintang"));
        imageSlider6.setImageList(slideModels6, true);

        ImageSlider imageSlider7 = view.findViewById(R.id.slider7);
        List<SlideModel> slideModels7 = new ArrayList<>();
        slideModels7.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Saung-Angklung-Mang-Udjo.jpg", "Saung Angklung Mang Udjo"));
        slideModels7.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSJuWrGAHj7rZ4VVXQH9bMuvnV2L_xVnulO-g&usqp=CAU", "Saung Angklung Mang Udjo"));
        slideModels7.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSJuWrGAHj7rZ4VVXQH9bMuvnV2L_xVnulO-g&usqp=CAU", "Saung Angklung Mang Udjo"));
        imageSlider7.setImageList(slideModels7, true);

        ImageSlider imageSlider8 = view.findViewById(R.id.slider8);
        List<SlideModel> slideModels8 = new ArrayList<>();
        slideModels8.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Taman-Balai-Kota.jpg", "Taman Balai Kota"));
        slideModels8.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRz31kEUN3kugywJgsD4YBDns5t4P5jqL_YFQ&usqp=CAU", "Taman Balai Kota"));
        slideModels8.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQud5qdEMFtSb_6khlm9DdZxbAfDmmEjskn7w&usqp=CAU", "Taman Balai Kota"));
        imageSlider8.setImageList(slideModels8, true);

        ImageSlider imageSlider9 = view.findViewById(R.id.slider9);
        List<SlideModel> slideModels9 = new ArrayList<>();
        slideModels9.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Taman-Hutan-Raya-IR-Juanda.jpg", "Taman Hutan Raya IR Juanda"));
        slideModels9.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRaxVA5w_xDbNJSAP_ktiexNTWCLAI1GpRxIA&usqp=CAU", "Taman Hutan Raya IR Juanda"));
        slideModels9.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQPdi6aOJuxqN_dp8N-rJ_k4HhPJ3TBkyzYPQ&usqp=CAU", "Taman Hutan Raya IR Juanda"));
        imageSlider9.setImageList(slideModels9, true);

        ImageSlider imageSlider10 = view.findViewById(R.id.slider10);
        List<SlideModel> slideModels10 = new ArrayList<>();
        slideModels10.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Trans-Studio-Bandung.jpg", "Trans Studio Bandung"));
        slideModels10.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS_Eww6xT1ot42Z6hgzeW2VsjHg7k4oz_oGEg&usqp=CAU", "Trans Studio Bandung"));
        slideModels10.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ4XXrLhX6Fi9FZVsTvVwCbWD4BkQroH_uMvQ&usqp=CAU", "Trans Studio Bandung"));
        imageSlider10.setImageList(slideModels10, true);

        ImageSlider imageSlider11 = view.findViewById(R.id.slider11);
        List<SlideModel> slideModels11 = new ArrayList<>();
        slideModels11.add(new SlideModel("https://www.javatravel.net/wp-content/uploads/2019/07/Upside-Down-World-Bandung.jpg", "Upside Down World Bandung"));
        slideModels11.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRjcfoR4NfGNk7yK1Lc6CRRxjNLY3fUSC2g0g&usqp=CAU", "Upside Down World Bandung"));
        slideModels11.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQSfOYym9mn3Qx41S3Wr4Gi0pa7mB17wCBV0Q&usqp=CAU", "Upside Down World Bandung"));
        imageSlider11.setImageList(slideModels11, true);

        return view;

    }



}