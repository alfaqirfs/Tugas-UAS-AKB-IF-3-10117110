package com.fauzisunarya.tugasuasakbif_310117110;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.fauzisunarya.tugasuasakbif_310117110.ui.gallery.GalleryKotaBandungFragment;
import com.fauzisunarya.tugasuasakbif_310117110.ui.home.HomeFragment;
import com.fauzisunarya.tugasuasakbif_310117110.ui.profile.ProfileFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 06-08-2020**/
public class MainActivity extends AppCompatActivity  {
    private ChipNavigationBar chipNavigationBar;
    private Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        chipNavigationBar = findViewById(R.id.chipNavigation);

        chipNavigationBar.setItemSelected(R.id.home, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i) {
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.cart:
                        fragment = new GalleryKotaBandungFragment();
                        break;
                    case R.id.profile:
                        fragment = new ProfileFragment();
                        break;

                }

                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                }
            }
        });


    }

}