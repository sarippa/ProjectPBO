[readme_github.md](https://github.com/user-attachments/files/32455517/readme_github.md)
# Sistem Toko Buku (Java OOP Concept)

Proyek ini merupakan implementasi sederhana dari **Pemrograman Berbasis Objek (Object-Oriented Programming / OOP)** dalam bahasa Java untuk mensimulasikan manajemen data buku dan komik pada sebuah toko buku.

---

## 👤 Informasi Mahasiswa

* **Nama:** Shafira Muthia Az-Zahra  
* **NPM:** 2507071009  
* **Email:** [2507071009@students.unila.ac.id](mailto:2507071009@students.unila.ac.id)  
* **Universitas:** Universitas Lampung  

---

## 🚀 Fitur & Konsep OOP yang Diterapkan

1. **Encapsulation (Enkapsulasi)**  
   * Penggunaan akses privat/proteksi (`private`, `protected`) pada atribut kelas.
   * Modifikasi dan validasi nilai atribut melalui metode *getter* dan *setter*.

2. **Inheritance (Pewarisan)**  
   * `Komik` bertindak sebagai *Subclass* yang mewarisi atribut dan metode dari `Buku` sebagai *Superclass*.

3. **Polymorphism (Polimorfisme) & Method Overriding**  
   * Metode `tampilkanInfo()` pada kelas `Komik` melakukan *override* terhadap metode `tampilkanInfo()` milik kelas `Buku` untuk menyajikan informasi tambahan khas komik (Volume, Author, dan Publisher).

---

## 📁 Struktur Kelas

| Nama Kelas | Tipe | Deskripsi |
| :--- | :--- | :--- |
| `Buku` | *Superclass* | Menyimpan data dasar buku seperti `id`, `judul`, `harga`, dan `qty`. |
| `Komik` | *Subclass* | Turunan dari `Buku`, menambahkan atribut khusus komik seperti `volume`, `author`, dan `publisher`. |
| `SistemTokoBuku` | *Main Class* | Kelas utama yang menjalankan program (*main method*), membuat objek, dan menguji fungsi enkapsulasi. |

---
