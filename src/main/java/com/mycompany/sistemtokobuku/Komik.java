/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemtokobuku;

/**
 *
 * @author user
 */
public class Komik extends Buku {
    private int volume;
    private String author;
    private String publisher;
    
    public Komik(String id, String judul, double harga, int qty, int volume, String author, String publisher) {
        super(id, judul, harga, qty);
        this.volume = volume;
        this.author = author;
        this.publisher = publisher;
    }
    
    public int volume() {
        return volume;
    }
    
    public void volume(int volume) {
        this.volume = volume;
    }
    
    public String author() {
        return author;
    }
    
    public void author(String author){
        this.author = author;
    }
    
    public String publisher() {
        return publisher;
    }
    
    public void publisher(String publisher){
        this.author = publisher;
    }
    
    public void tampilkanBeasiswa(){
        System.out.println("Volume      : " + volume);
        System.out.println("Author      : " + author);
        System.out.println("Publisher   : " + publisher);
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        tampilkanBeasiswa();
    }
}