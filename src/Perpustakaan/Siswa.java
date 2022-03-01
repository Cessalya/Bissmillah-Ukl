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
    public class Siswa implements User{ //"implements (interface)"  kelas yang berisi method-method abstrak dan kontanta
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>(); //true atau false
    //"arraylist" menambahkan data baru secara dinamis tanpa harus menentukan ukurannya di awal
	//kenapa private karena datannya hanya di class ini tapi bisa di akses diclass yang lain menggunakan method    

    public Siswa() { //mendeklarasikan kelas siswa
        //0
        this.namaSiswa.add("Fadilla");
        this.alamat.add("Tulungagung");
        this.telepon.add("082335162065");
        this.status.add(true);

        //1
        this.namaSiswa.add("Aizar");
        this.alamat.add("Blitar");
        this.telepon.add("081009172611");
        this.status.add(true);

        //2
        this.namaSiswa.add("Cessalya");
        this.alamat.add("Tulungagung");
        this.telepon.add("085259177913");
        this.status.add(false);
    }

    public void setStatus(boolean status) {
        this.status.add(status); 
    }

    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }

    public void editStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }

    public int getJmlSiswa() {
        return this.status.size();
    }

    //@Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }

    //@Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    //@Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    //@Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    //@Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    //@Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
}
//polimorphysme adalah berarti banyak bentuk
//polimorphysme statis "overload" methodnya sama parameternya berbeda
//polimorphysem dinamis "overide"  namanya sama diterapkan di class anaknya
//menggunakan overide dikarenakan untuk mengakses dari kelas lain
//interface diimplementasikan ke dalam suatu class dengan menggunakan kata kunci implements, dan sebuah kelas dapat mengimplementasikan lebih dari satu interface.