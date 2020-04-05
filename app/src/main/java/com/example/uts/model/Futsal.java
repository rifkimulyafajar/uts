package com.example.uts.model;

public class Futsal {
    String jenis, detail, foto;
    int harga;

    public Futsal(String jenis, String detail, String foto, int harga) {
        this.jenis = jenis;
        this.detail = detail;
        this.foto = foto;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
