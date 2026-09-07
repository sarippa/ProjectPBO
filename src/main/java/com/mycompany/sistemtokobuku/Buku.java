/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemtokobuku;

/**
 *
 * @author user
 */
public class Buku {
    private String judul;
    private String penulis;
    private int harga;
    private int stok;

    public Buku(String judul, String penulis, int harga, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("===============================");
        System.out.println("Judul Buku  : " + this.judul);
        System.out.println("Penulis     : " + this.penulis);
        System.out.println("Harga       : Rp" + this.harga);
        System.out.println("Stok        : " + this.stok);
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
            System.out.println("Berhasil membeli/meminjam " + jumlah + " buku '" + this.judul + "'.");
        } else {
            System.out.println("Stok buku '" + this.judul + "' tidak cukup!");
        }
    }

    public String getJudul() {
        return judul;
    }

    public int getStok() {
        return stok;
    }
}