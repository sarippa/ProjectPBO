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
        System.out.println("                 SISTEM TOKO BUKU                 \n");
        System.out.println("Shafira Muthia Az-Zahra");
        System.out.println("2507071009");
        System.out.println("2507071009@students.unila.ac.id");
        
        Buku buku1 = new Buku(
                "K1213L",
                "Tokyo Ghoul",
                85000,
                10);
        
        Buku buku1a = new Komik(
                "K1213L",
                "Tokyo Ghoul",
                85000,
                10,
                14,
                "Sui Ishida",
                "Shueisha");

        System.out.println("==================================================");
        System.out.println("------------------ DATA AWAL ---------------------");
        System.out.println("==================================================");
        buku1.tampilkanInfo();
        
        System.out.println("==================================================");
        System.out.println("------------------ ENKAPSULASI -------------------");
        System.out.println("==================================================");
        
        buku1.setHarga(95000);
        System.out.println("Harga terbaru buku " + buku1.getjudul() + " : Rp" + String.format("%,.0f", buku1.getHarga()));
        
        buku1.setQty(8);
        System.out.println("Jumlah terbaru barang " + buku1.getQty());
        
        buku1.setHarga(-45000);
        buku1.setQty (-8);
        
        System.out.println("==================================================");
        System.out.println("------------------ INHERITANCE -------------------");
        System.out.println("==================================================");
        
        buku1a.tampilkanInfo();
    }
}