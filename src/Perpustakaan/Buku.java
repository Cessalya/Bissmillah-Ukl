/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Perpustakaan;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Buku { //public termasuk enkapsulasi 
    private ArrayList<String> namaBuku = new ArrayList<String>(); //"string" karena huruf
    private ArrayList<Integer> stok = new ArrayList<Integer>(); //"integer"karena angka
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    //menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal
    //private termasuk enkapsulasi
    //enkapsulasi adalah pembungkus
    
    public Buku() { // mendeklarasikan buku 
        
        this.namaBuku.add("Bahasa Indonesia");
        this.stok.add(20);
        this.harga.add(250000);
        //"this" (pewarisan/inheritance) dipergunakan pada pembuatan kelas dan digunakan untuk menyatakan objek sekarang.
        this.namaBuku.add("Sejarah");
        this.stok.add(7);
        this.harga.add(310000);

        this.namaBuku.add("Agama Islam");
        this.stok.add(12);
        this.harga.add(76000);

        this.namaBuku.add("Bahasa Inggris");
        this.stok.add(19);
        this.harga.add(110000);
    }

    public int getJmlBuku() { //"get atau asesor method" untuk mengambil elemen pada indeks tertentu
        return this.namaBuku.size();//size(), untuk mencari panjang ArrayList
       //"return this" dapat merujuk anggota kelas seperti konstruktor, variabel, dan metode. 
    }

    public void setNamaBuku(String namaBuku) { //"set atau mutator method" (enkapsulasi) untuk menimpa nilai pada indeks tertentu
        this.namaBuku.add(namaBuku); //add(), untuk menambah elemen baru
    }

    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public void editStok(int idBuku, int stok) {
        this.stok.set(idBuku, stok);;
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }
}
//kenapa menggunakan set dikarenakan menambahkan
//kenapa menggunakan get karena untuk mengakses dari class sebelumnya
//"inheritance"this dipergunakan pada pembuatan kelas dan digunakan untuk menyatakan objek