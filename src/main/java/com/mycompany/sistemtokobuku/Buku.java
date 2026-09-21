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
    protected String id;
    protected String judul;
    protected double harga;
    protected int qty;

    public Buku(String id, String judul, double harga, int qty) {
        this.id = id;
        this.judul = judul;
        setHarga(harga);
        setQty(qty);
    }

    public void tampilkanInfo() {
        System.out.println("==================================================");
        System.out.println("ID Buku     : " + this.id);
        System.out.println("Judul Buku  : " + this.judul);
        System.out.println("Harga       : Rp" + this.harga);
        System.out.println("Qty         : " + this.qty);
        System.out.println("Total       : Rp" + (this.harga * this.qty));
    }

    public String getId() {
        return id;
    }
    
    public String getjudul(){
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