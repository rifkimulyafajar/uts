package com.example.uts.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.uts.R;
import com.example.uts.model.Menu;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private Context context;
    private List<Menu> menuList;

    public MenuAdapter(Context context, List<Menu> menuList) {
        this.context = context;
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        Menu menu = menuList.get(position);
        Glide.with(context).load(menu.getFoto()).into(holder.image_foto);
        holder.text_nama.setText(menu.getNama());
        holder.text_harga.setText(menu.getHarga());
    }

    @Override
    public int getItemCount() {
        return (menuList != null) ? menuList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text_nama, text_harga;
        ImageView image_foto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_nama = itemView.findViewById(R.id.textView_nama);
            text_harga = itemView.findViewById(R.id.textView_harga);
            image_foto = itemView.findViewById(R.id.image_menu);
        }
    }
}
