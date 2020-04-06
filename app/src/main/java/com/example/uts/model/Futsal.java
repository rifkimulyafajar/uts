package com.example.uts.model;

public class Futsal {
    String jenis, detail, foto;
    int harga_wday, harga_wend;

    public Futsal(String jenis, String detail, String foto, int harga_wday, int harga_wend) {
        this.jenis = jenis;
        this.detail = detail;
        this.foto = foto;
        this.harga_wday = harga_wday;
        this.harga_wend = harga_wend;
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

    public int getHarga_wday() {
        return harga_wday;
    }

    public void setHarga_wday(int harga) {
        this.harga_wday = harga;
    }
}
