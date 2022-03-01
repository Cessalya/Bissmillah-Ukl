/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Perpustakaan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Perpustakaan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int temp = 0;
        
        do { //perulangan dulu atau menyeleksi run dul

            Buku buku = new Buku();
            Laporan laporan = new Laporan();
            Siswa siswa = new Siswa();
            Peminjaman peminjaman = new Peminjaman();
            laporan.laporan(buku);
            laporan.laporan(siswa);
            peminjaman.prosesPeminjaman(siswa, peminjaman, buku, laporan);

            laporan.laporan(buku);
            laporan.laporan(siswa);

            System.out.println("lanjutkan atau matikan 1 : 99");

            temp = myObj.nextInt();
        } while (temp != 99); //jika sudah benar maka tekan tombol "99" dan akan berhenti
        System.exit(0);
    }
}
//perulangan do-while digunakan untuk mengulang bagian program secara berulang, sampai kondisi yang ditentukan benar.
