package com.fauzisunarya.tugasuasakbif_310117110.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.fauzisunarya.tugasuasakbif_310117110.models.Wisata;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 06-08-2020**/
public class DatabaseHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "dbwisatabandung.db";
    private static final int DATABASE_VERSION = 1;
    Context context;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    public ArrayList<Wisata> getAllData(){
        try {
            ArrayList<Wisata> list = new ArrayList<>();
            SQLiteDatabase obj = getReadableDatabase();
            if (obj!=null){
                Cursor objC=obj.rawQuery("select * from wisata", null);
                if (objC.getCount() !=0){
                    while (objC.moveToNext()){
                        String title=objC.getString(0);
                        String detail=objC.getString(1);
                        String image=objC.getString(2);
                        list.add(
                                new Wisata(
                                        title,detail,image
                                )
                        );
                    }
                    return list;
                }else {
                    Toast.makeText(context,"No data is retrieved....", Toast.LENGTH_SHORT).show();
                    return null;

                }
            }else {
                Toast.makeText(context,"Data is null ;)", Toast.LENGTH_SHORT).show();
                return null;

            }

        }catch (Exception e){
            Toast.makeText(context,"getAllData:-"+e.getMessage(), Toast.LENGTH_SHORT).show();
            return null;
        }
    }
}
