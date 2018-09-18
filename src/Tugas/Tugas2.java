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
public class Tugas2 {

    static Scanner masuk = new Scanner(System.in);
    static double c, hasilR, hasilF, hasilK;
    static int ulangi;

    public static void main(String[] args) {
        do {
            Judul();
            Input();
            Konversi();
            System.out.println("");
            System.out.println("Ulangi program ? ");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Jawab : ");
            ulangi = masuk.nextInt();
            System.out.println("");
        } while (ulangi == 1);
        System.out.println("Terima Kasih");
    }

    public static void Judul() {
        System.out.println("Identitas : Michael Kevin Adinata / XR6 / 30");
        System.out.println("===============");
        System.out.println("Konversi Suhu");
        System.out.println("===============");
    }

    public static void Input() {
        System.out.print("Masukkan suhu (dalam derajat Celcius) : ");
        c = masuk.nextDouble();
        System.out.println("");
    }

    public static void Konversi() {

        System.out.println("Silahkan pilih : ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");
        System.out.print("Jawab : ");
        int pilih = masuk.nextInt();
        System.out.println("");

        switch (pilih) {
            case 1:
                hasilF = (c / 5 * 9) + 32;
                System.out.println("Suhu " + c + " derajat dalam Fahrenheit adalah " + hasilF + " derajat");
                break;
            case 2:
                hasilR = c / 5 * 4;
                System.out.println("Suhu " + c + " derajat dalam Reamur adalah " + hasilR + " derajat");
                break;
            case 3:
                hasilK = c + 273;
                System.out.println("Suhu " + c + " derajat dalam Kelvin adalah " + hasilK + " derajat");
        }

    }

}
