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
    private double harga;
    private int qty;

    public Buku(String judul, String penulis, double harga, int qty) {
        this.judul = judul;
        this.penulis = penulis;
        setHarga(harga);
        setQty(qty);
    }

    public void tampilkanInfo() {
        System.out.println("==================================================");
        System.out.println("Judul Buku  : " + this.judul);
        System.out.println("Penulis     : " + this.penulis);
        System.out.println("Harga       : Rp" + this.harga);
        System.out.println("Qty         : " + this.qty);
        System.out.println("Total       : Rp" + (this.harga * this.qty));
    }

    public String getJudul() {
        return judul;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("[ERROR] Masukkan ulang harga!");
        }
    }
    
    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        if (qty >= 0) {
            this.qty = qty;
        } else {
            System.out.println("[ERROR] Stok tidak sesuai! Set default ke 0.");
        }
    }
}