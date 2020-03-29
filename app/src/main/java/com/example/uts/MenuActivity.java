package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uts.adapter.MenuAdapter;
import com.example.uts.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        RecyclerView recyclerView = findViewById(R.id.rv_menu);

        List<Menu> menuList = new ArrayList<>();

        menuList.add(new Menu("Nasi Goreng Jawa", "Rp. 15,000",
                "https://cdn1-production-images-kly.akamaized.net/UMvdO85RqVX3NGpZtBSWemufZg0=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2397491/original/005398500_1541045846-HL.jpg"));
        menuList.add(new Menu("Nasi Goreng Ikan Asin", "Rp. 15,000",
                "https://awsimages.detik.net.id/community/media/visual/2016/08/12/47bfd2bb-cb18-47e0-957b-ecda0b8698d5_169.jpg?w=700&q=90"));
        menuList.add(new Menu("Nasi Goreng Seafood", "Rp. 15,000",
                "https://www.masakapahariini.com/wp-content/uploads/2019/03/nasi-goreng-seafood-bumbu-jawa-timur-500x300.jpg"));
        menuList.add(new Menu("Nasi Goreng Sunda", "Rp. 15,000",
                "https://www.dictio.id/uploads/db3342/original/3X/d/7/d7308e5e4fa59052b9d06f0a576c4ce4010086df.jpg"));
        menuList.add(new Menu("Nasi Goreng Mawut", "Rp. 15,000",
                "https://www.dimanaja.com/assets/images/cover/790729ab4a6f9609c942e3bfcdef415e36b3b5c8.jpg"));

        MenuAdapter menuAdapter = new MenuAdapter(this, menuList);
        recyclerView.setAdapter(menuAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
