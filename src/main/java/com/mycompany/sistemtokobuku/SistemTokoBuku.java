/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemtokobuku;

/**
 *
 * @author user
 */
public class SistemTokoBuku {

    public static void main(String[] args) {
        System.out.println("=== SISTEM TOKO BUKU / PERPUSTAKAAN ===\n");

        Buku buku1 = new Buku("Pemrograman Java Dasar", "Budi Santoso", 85000, 10);
        Buku buku2 = new Buku("Algoritma & Struktur Data", "Siti Aminah", 95000, 5);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        System.out.println("\n--- Transaksi ---");
        buku1.kurangiStok(2);
        
        System.out.println("\n--- Info Setelah Transaksi ---");
        buku1.tampilkanInfo();
    }
}