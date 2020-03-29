package com.example.uts.model;

public class Menu {
    String nama, harga, foto;

    public Menu(String nama, String harga, String foto) {
        this.nama = nama;
        this.harga = harga;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
