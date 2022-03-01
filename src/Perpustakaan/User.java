/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Perpustakaan;

/**
 *
 * @author LENOVO
 */
    public interface User {
    //interface "polimorfisme" isi methodnya kosong dan nanti akan diimplementasikan pada class lain
        //interface penghubung
    public void setNama(String nama);//"set atau mutator method" (enkapsulasi) untuk menimpa nilai pada indeks tertentu
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);

    public String getNama(int id); //"get atau asesor method" (enkapsulasi) untuk mengambil elemen pada indeks tertentu
    public String getAlamat(int id);
    public String getTelepon(int id);

}