package com.example.shopgame;

public class gamenya {
    private String nama;
    private Integer harga,img,gmbar;

    public gamenya(String nama, Integer harga, Integer img, Integer gmbar) {
        this.nama = nama;
        this.harga = harga;
        this.img = img;
        this.gmbar = gmbar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Integer getGmbar() {
        return gmbar;
    }

    public void setGmbar(Integer gmbar) {
        this.gmbar = gmbar;
    }
}
