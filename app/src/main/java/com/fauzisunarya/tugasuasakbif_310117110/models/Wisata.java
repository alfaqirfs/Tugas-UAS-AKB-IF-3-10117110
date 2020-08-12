package com.fauzisunarya.tugasuasakbif_310117110.models;

import android.os.Parcel;
import android.os.Parcelable;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 06-08-2020**/
public class Wisata implements Parcelable {
    private String Wtitle;
    private String Wdesc;
    private String Wimage;

    public Wisata(){

    }

    public String getWtitle() {
        return Wtitle;
    }

    public void setWtitle(String wtitle) {
        Wtitle = wtitle;
    }

    public String getWdesc() {
        return Wdesc;
    }

    public void setWdesc(String wdesc) {
        Wdesc = wdesc;
    }

    public String getWimage() {
        return Wimage;
    }

    public void setWimage(String wimage) {
        Wimage = wimage;
    }

    public static Creator<Wisata> getCREATOR() {
        return CREATOR;
    }

    protected Wisata(Parcel in) {
        Wtitle = in.readString();
        Wdesc = in.readString();
        Wimage = in.readString();
    }

    public static final Creator<Wisata> CREATOR = new Creator<Wisata>() {
        @Override
        public Wisata createFromParcel(Parcel in) {
            return new Wisata(in);
        }

        @Override
        public Wisata[] newArray(int size) {
            return new Wisata[size];
        }
    };

    public Wisata(String wtitle, String wdesc, String wimage) {
        Wtitle = wtitle;
        Wdesc = wdesc;
        Wimage = wimage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Wtitle);
        dest.writeString(Wdesc);
        dest.writeString(Wimage);
    }
}
