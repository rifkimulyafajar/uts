package com.example.uts.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uts.LapFutsalActivity;
import com.example.uts.R;
import com.example.uts.model.Futsal;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class FutsalAdapter extends RecyclerView.Adapter<FutsalAdapter.ViewHolder> {
    Locale localeID = new Locale("in", "ID");
    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

    private List<Futsal> items;
    private Context context;

    public FutsalAdapter(List<Futsal> items, Context context) {
        this.items = items;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textJenis, textHarga;
        ImageView imgLap;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textJenis = itemView.findViewById(R.id.text_jenis);
            textHarga = itemView.findViewById(R.id.text_harga);
            imgLap = itemView.findViewById(R.id.image_lapangan);
            constraintLayout = itemView.findViewById(R.id.item_layout);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_lapangan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final Futsal futsal = items.get(position);
        Glide.with(context).load(futsal.getFoto()).into(holder.imgLap);
        holder.textJenis.setText(futsal.getJenis());
        holder.textHarga.setText(formatRupiah.format((double)futsal.getHarga_wday()));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, futsal.getJenis(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, DetailLapActivity.class);

                intent.putExtra("keyFoto", futsal.getFoto());
                intent.putExtra("keyJenis", futsal.getJenis());
                intent.putExtra("keyDetail", futsal.getDetail());
                intent.putExtra("keyHarga", futsal.getHarga_wday());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (items!=null) ? items.size() : 0;
    }
}
