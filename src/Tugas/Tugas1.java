package Tugas;

import java.util.Scanner;

public class Tugas1 {

    static double r, hasil;
    static int ulangi;
    static final double phi = 3.14285714;
    static Scanner masuk = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            Judul();
            Input();
            Proses();
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
        System.out.println("================================");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("================================");
    }

    public static void Input() {

        System.out.print("Masukkan jari-jari (cm) : ");
        r = masuk.nextDouble();
    }

    public static void Proses() {
        hasil = 4 * phi * r * r;
        System.out.println("Luas permukaan bola berjari-jari " + r + " adalah " + Math.ceil(hasil));

    }

}
