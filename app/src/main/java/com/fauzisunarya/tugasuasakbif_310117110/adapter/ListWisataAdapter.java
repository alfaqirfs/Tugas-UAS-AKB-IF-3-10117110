package com.fauzisunarya.tugasuasakbif_310117110.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.fauzisunarya.tugasuasakbif_310117110.R;
import com.fauzisunarya.tugasuasakbif_310117110.models.Wisata;
import com.fauzisunarya.tugasuasakbif_310117110.ui.detail.DetailActivity;

import java.util.ArrayList;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 06-08-2020**/

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Wisata> lisWisata;

    public ListWisataAdapter(Context context){
        this.context = context;
    }

    public void setLisWisata(ArrayList<Wisata> lisWisata){
        this.lisWisata = lisWisata;
    }

    public ArrayList<Wisata> getLisWisata(){
        return lisWisata;
    }

    @NonNull
    @Override
    public ListWisataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wisata_horizontal, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListWisataAdapter.ViewHolder holder, final int position) {
        holder.tvTitle.setText(getLisWisata().get(position).getWtitle());
        holder.tvDesc.setText(getLisWisata().get(position).getWdesc());
        Glide.with(context).load(getLisWisata().get(position).getWimage()).into(holder.ivImage);
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("wisataskuy", lisWisata.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lisWisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivImage;
        TextView tvTitle, tvDesc;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title_card);
            tvDesc = itemView.findViewById(R.id.tv_desc_card);
            ivImage = itemView.findViewById(R.id.iv_poster);
            constraintLayout = itemView.findViewById(R.id.constraint);
        }
    }
}
