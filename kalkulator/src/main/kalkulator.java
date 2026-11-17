/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("pilih opsi yang akan di hitung:");
        System.out.println("1. bangun datar");
        System.out.println("2. bangun ruang");
        System.out.print("\ninput: ");
        int kategori = input.nextInt();

        if (kategori == 1) {
            // MENU BANGUN DATAR
            System.out.println("\n1. persegi");
            System.out.println("2. persegi Panjang");
            System.out.println("3. segitiga");
            System.out.println("4. lingkaran");
            System.out.print("\ninput: ");
            int pilihDatar = input.nextInt();

            System.out.println("\noperasi yang akan di lakukan:");
            System.out.println("1. hitung luas");
            System.out.println("2. hitung keliling");
            System.out.print("\ninput: ");
            int operasi = input.nextInt();

            switch (pilihDatar) {
                case 1: // Persegi
                    System.out.print("\nmasukan sisi: ");
                    double s = input.nextDouble();
                    Persegi persegi = new Persegi(s);
                    
                    if (operasi == 1) {
                        System.out.println("\nluas dari persegi anda adalah: " + persegi.hitungLuas());
                    } else {
                        System.out.println("\nkeliling dari persegi anda adalah: " + persegi.hitungKeliling());
                    }
                    break;

                case 2: // Persegi Panjang
                    System.out.print("\nmasukan Panjang: ");
                    double p = input.nextDouble();
                    System.out.print("masukan lebar: ");
                    double l = input.nextDouble();
                    PersegiPanjang pp = new PersegiPanjang(p, l);

                    if (operasi == 1) {
                        System.out.println("\nluas dari persegi Panjang anda adalah: " + pp.hitungLuas());
                    } else {
                        System.out.println("\nkeliling dari persegi Panjang anda adalah: " + pp.hitungKeliling());
                    }
                    break;

                case 3: // Segitiga
                    if (operasi == 1) {
                        System.out.print("\nmasukan alas: ");
                        double alas = input.nextDouble();
                        System.out.print("masukan tinggi: ");
                        double tinggi = input.nextDouble();
                        Segitiga segitiga = new Segitiga(alas, tinggi);
                        System.out.println("\nluas dari segitiga anda adalah: " + segitiga.hitungLuas());
                    } else {
                        System.out.print("\nmasukan sisi A: ");
                        double sA = input.nextDouble();
                        System.out.print("masukan sisi B: ");
                        double sB = input.nextDouble();
                        System.out.print("masukan sisi C: ");
                        double sC = input.nextDouble();
                        Segitiga segitiga = new Segitiga(sA, sB, sC);
                        System.out.println("\nkeliling dari segitiga anda adalah: " + segitiga.hitungKeliling());
                    }
                    break;

                case 4: // Lingkaran
                    System.out.print("\nmasukan jari-jari: ");
                    double r = input.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(r);

                    if (operasi == 1) {
                        System.out.println("\nluas dari lingkaran anda adalah: " + lingkaran.hitungLuas());
                    } else {
                        System.out.println("\nkeliling dari lingkaran anda adalah: " + lingkaran.hitungKeliling());
                    }
                    break;

                default:
                    System.out.println("Pilihan bangun datar tidak valid.");
            }

        } else if (kategori == 2) {
            // MENU BANGUN RUANG
            System.out.println("\n1. kubus");
            System.out.println("2. balok");
            System.out.println("3. tabung");
            System.out.println("4. bola");
            System.out.print("\ninput: ");
            int pilihRuang = input.nextInt();

            System.out.println("\noperasi yang akan di lakukan:");
            System.out.println("1. hitung volume");
            System.out.println("2. hitung luas permukaan");
            System.out.print("\ninput: ");
            int operasi = input.nextInt();

            switch (pilihRuang) {
                case 1: // Kubus
                    System.out.print("\nmasukan sisi: ");
                    double s = input.nextDouble();
                    Kubus kubus = new Kubus(s);

                    if (operasi == 1) {
                        System.out.println("\nvolume dari kubus anda adalah: " + kubus.hitungVolume());
                    } else {
                        System.out.println("\nluas permukaan dari kubus anda adalah: " + kubus.hitungLuasPermukaan());
                    }
                    break;

                case 2: // Balok
                    System.out.print("\nmasukan panjang: ");
                    double p = input.nextDouble();
                    System.out.print("masukan lebar: ");
                    double l = input.nextDouble();
                    System.out.print("masukan tinggi: ");
                    double t = input.nextDouble();
                    Balok balok = new Balok(p, l, t);

                    if (operasi == 1) {
                        System.out.println("\nvolume dari balok anda adalah: " + balok.hitungVolume());
                    } else {
                        System.out.println("\nluas permukaan dari balok anda adalah: " + balok.hitungLuasPermukaan());
                    }
                    break;

                case 3: // Tabung
                    System.out.print("\nmasukan jari-jari: ");
                    double rTabung = input.nextDouble();
                    System.out.print("masukan tinggi: ");
                    double tTabung = input.nextDouble();
                    Tabung tabung = new Tabung(rTabung, tTabung);

                    if (operasi == 1) {
                        System.out.println("\nvolume dari tabung anda adalah: " + tabung.hitungVolume());
                    } else {
                        System.out.println("\nluas permukaan dari tabung anda adalah: " + tabung.hitungLuasPermukaan());
                    }
                    break;

                case 4: // Bola
                    System.out.print("\nmasukan jari-jari: ");
                    double rBola = input.nextDouble();
                    Bola bola = new Bola(rBola);

                    if (operasi == 1) {
                        System.out.println("\nvolume dari bola anda adalah: " + bola.hitungVolume());
                    } else {
                        System.out.println("\nluas permukaan dari bola anda adalah: " + bola.hitungLuasPermukaan());
                    }
                    break;

                default:
                    System.out.println("Pilihan bangun ruang tidak valid.");
            }
        } else {
            System.out.println("Pilihan kategori tidak valid.");
        }

        input.close();
    }
}