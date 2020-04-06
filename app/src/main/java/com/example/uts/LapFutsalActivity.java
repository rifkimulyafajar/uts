package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uts.adapter.FutsalAdapter;
import com.example.uts.model.Futsal;

import java.util.ArrayList;
import java.util.List;

public class LapFutsalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap_futsal);

        RecyclerView recyclerView = findViewById(R.id.rv_lapangan);

        List<Futsal> futsals = new ArrayList<>();

        futsals.add(new Futsal("InterLock", "Lantai Futsal Interlock adalah jenis puzzel karpet lantai lapangan futsal yang terbuat dari bahan copolymer biji plastik dan tentu nya berbagai macam jenis warna kombinasi untuk 1 lapangan dan bahan interlock futsal di khususkan untuk bangunan indoor dan sudah digunakan liga futsal Indonesia.",
                "https://arnidecor.com/wp-content/uploads/2018/07/Lantai-Interlock-Untuk-Lapangan-Futsal-02.png",
                90000, 110000));
        futsals.add(new Futsal("Vinyl", "Lapangan futsal jenis vinyl ini terbuat dari material utama berbahan lapisan karet. Lapangan Vinyl memiliki tingkat kerataan yang bagus, selain itu tekstur lapangan vinyl sangat empuk sehingga sangat ramah lingkungan banget buat kiper. Lapangan berjenis vinyl sangat bagus untuk aliran bola dan juga pemain. Dibalik beberapa hal positifnya ada hal negatif dari lapangan vinyl, lapangan jenis vinyl rentan menggelupas digunakan dalam rentang waktu yang cukup lama.",
                "https://i1.wp.com/ayobaca.web.id/wp-content/uploads/2017/01/Lapangan-Futsal-Vinyl.jpg?fit=480%2C360&ssl=1",
                90000, 110000));
        futsals.add(new Futsal("Rumput Sintetis", "Material rumput sintetis biasanya hanya digunakan untuk indoor soccer atau hanya untuk hiburan semata, Lapangan futsal berjenis rumput sintetis tidak digunakan untuk kompetisi resmi. kelebihan menggunakan jenis rumput sintetis adalah mudahnya mengontrol bola dan meminimalisir cedera saat ada pemain yang terjatuh. Walaupun bisa meminimalisir cedera, rumput sintetis bisa saja membuat pemain terkena luka, mengingat ujung dari rumput sintetis sedikit lebih tajam jika dibandingkan rumput alami.",
                "https://www.karyatukang.com/wp-content/uploads/2020/02/kontraktor-lapangan-futsal.jpg",
                80000, 100000));
        futsals.add(new Futsal("Parquette", "Apasih Parquette itu? parquette adalah kayu, sejak dulu kayu digunakan untuk menjadi alas lapangan di gelanggang olahraga atau sering disingkat GOR. Salah satu dampak positif penggunaan kayu pada lapangan futsal adalah kekesatannya yang tinggi, jadi kemungkinan pemain terjatuh karena terpeleset sangat kecil. Dibalik sisi positifnya, lapangan bermaterialkan parquette ini membutuhkan perawatan yang bagus, jika lapangan kurang terawat maka akan muncul sambungan yang menggelupas, sebab sambungan yang mengelupas inilah keselamatan pemain jadi terancam.",
                "https://2.bp.blogspot.com/-sR1M2TumiJk/Vz1K-GtRKAI/AAAAAAAAAT0/SdtOxKrwjBQiN6fQC5VWdkjQRNqROORmgCLcB/s640/LapanganFutsal%2BParquette.jpg",
                100000, 120000));
        futsals.add(new Futsal("Rumput Sintetis(Outdoor)", "Material rumput sintetis biasanya hanya digunakan untuk indoor soccer atau hanya untuk hiburan semata, Lapangan futsal berjenis rumput sintetis tidak digunakan untuk kompetisi resmi. kelebihan menggunakan jenis rumput sintetis adalah mudahnya mengontrol bola dan meminimalisir cedera saat ada pemain yang terjatuh. Walaupun bisa meminimalisir cedera, rumput sintetis bisa saja membuat pemain terkena luka, mengingat ujung dari rumput sintetis sedikit lebih tajam jika dibandingkan rumput alami.",
                "https://www.jaringfutsalpengaman.com/wp-content/uploads/2018/07/25.jpg",
                80000, 100000));

        FutsalAdapter adapter = new FutsalAdapter(futsals, this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}
