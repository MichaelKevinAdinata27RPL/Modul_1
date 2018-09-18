/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tugas3 {

    static String nama, tmptLahir, jnsKelamin, almtMalang, mtHidup, blnLahir;
    static int NIS1, tglLahir, thnLahir;
    static Scanner masuk = new Scanner(System.in);

    public static void main(String[] args) {
        Judul();
        Biodata();
        Tampil();
    }

    public static void Judul() {
        System.out.println("Identitas : Michael Kevin Adinata / XR6 / 30");
        System.out.println("===============");
        System.out.println("Biodata Diri");
        System.out.println("===============");
    }

    public static void Biodata() {
        System.out.print("Masukkan nama : ");
        nama = masuk.nextLine();
        System.out.print("Masukkan NIS : ");
        NIS1 = masuk.nextInt();
        System.out.println("");
        System.out.print("Masukkan tempat lahir : ");
        tmptLahir = masuk.next();
        System.out.print("Masukkan tanggal lahir : ");
        tglLahir = masuk.nextInt();
        System.out.print("Masukkan bulan lahir : ");
        blnLahir = masuk.next();
        System.out.print("Masukkan tahun lahir : ");
        thnLahir = masuk.nextInt();
        System.out.println("");
        System.out.print("Masukkan jenis kelamin : ");
        jnsKelamin = masuk.next();
        System.out.println("");
        System.out.print("Masukkan alamat rumah di Malang : ");
        almtMalang = masuk.next();
        System.out.println("");
        System.out.print("Masukkan motto hidup : ");
        mtHidup = masuk.next();
        System.out.println("");
    }

    public static void Tampil() {
        System.out.println("\nNama : " + nama + "\n"
                + "NIS : " + NIS1 + "\n"
                + "Tempat Lahir : " + tmptLahir + "\n"
                + "Tanggal Lahir : " + tglLahir + "-" + blnLahir + "-" + thnLahir + "\n"
                + "Jenis Kelamin : " + jnsKelamin + "\n"
                + "Alamat di Malang : " + almtMalang + "\n"
                + "Motto Hidup : " + mtHidup);
    }

}
