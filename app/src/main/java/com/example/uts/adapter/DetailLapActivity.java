package com.example.uts.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.uts.R;

import java.text.NumberFormat;
import java.util.Locale;

public class DetailLapActivity extends AppCompatActivity {
    Locale localeID = new Locale("in", "ID");
    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

    ImageView imageView;
    TextView text_jenis, text_detail, text_harga;
    TextView hargaDaySiang, hargaDayMalam, hargaEndSiang, hargaEndMalam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lap);

        String foto = getIntent().getStringExtra("keyFoto");
        String jenis = getIntent().getStringExtra("keyJenis");
        String detail = getIntent().getStringExtra("keyDetail");
        int harga = getIntent().getIntExtra("keyHarga", 0);

        setContent(foto, jenis, detail, harga);

        hargaDaySiang = findViewById(R.id.hargaSiangWeekday);
        hargaDayMalam = findViewById(R.id.hargaMalamWeekday);
        hargaEndSiang = findViewById(R.id.hargaSiangWeekend);
        hargaEndMalam = findViewById(R.id.hargaMalamWeekend);

        hargaDaySiang.setText(formatRupiah.format((double)harga));
        hargaDayMalam.setText(formatRupiah.format((double)harga+10000));

        hargaEndSiang.setText(formatRupiah.format((double)harga+10000));
        hargaEndMalam.setText(formatRupiah.format((double)harga+20000));
//        text_harga.setText(formatRupiah.format((double)harga));

    }

    private void setContent(String foto, String jenis, String detail, int harga) {
        imageView = findViewById(R.id.imageView);
        text_jenis = findViewById(R.id.text_hasil_jenis);
        text_detail = findViewById(R.id.text_hasil_detail);
        text_harga = findViewById(R.id.text_hasil_harga);

        Glide.with(this).load(foto).into(imageView);
        text_jenis.setText(jenis);
        text_detail.setText(detail);
        text_harga.setText(formatRupiah.format((double)harga));
    }

    public void handleWA(View view) {
        String number="+6285804871527";

        String url = "https://api.whatsapp.com/send?phone="+number;
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
