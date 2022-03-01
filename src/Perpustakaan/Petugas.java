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
public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> status = new ArrayList<String>();

    public Petugas() {
        //0
        this.namaPetugas.add("Cessalya");
        this.alamat.add("Malang");
        this.telepon.add("08105672315");

        //1
        this.namaPetugas.add("Dea");
        this.alamat.add("Jakarta");
        this.telepon.add("084331072611");

        //2
        this.namaPetugas.add("Ivana");
        this.alamat.add("Surabaya");
        this.telepon.add("081001266110");
    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }
    
    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }
}
    //polimorphysme statis "overload"
    //polimorphysem dinamis "overide"
    //menggunakan overide dikarenakan untuk mengakses dari kelas lain
    //interface diimplementasikan ke dalam suatu class dengan menggunakan kata kunci implements, dan sebuah kelas dapat mengimplementasikan lebih dari satu interface.