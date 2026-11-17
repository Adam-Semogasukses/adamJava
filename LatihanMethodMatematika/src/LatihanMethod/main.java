/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMethod;
import java.util.Scanner;
import static LatihanMethod.LatihanMethodMatematika.hitungLuasBola;
import static LatihanMethod.LatihanMethodMatematika.hitungLuasKubus;
import static LatihanMethod.LatihanMethodMatematika.hitungLuasBalok;
import static LatihanMethod.LatihanMethodMatematika.tampilkanHeader;

/**
 *
 * @author MSI
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        tampilkanHeader("Menghitung Luas Bola");
        System.out.print("Masukkan jari-jari: ");
        double jarijari = input.nextDouble();
        double LuasLingkaran = hitungLuasBola (jarijari);
        System.out.println("luas Bola = "+LuasLingkaran);
        
        tampilkanHeader("Menghitung Luas Kubus");
        System.out.print("Masukkan Sisi: ");
        double sisi = input.nextDouble();
        double LuasKubus = hitungLuasKubus (sisi);
        System.out.println("luas kubus = "+LuasKubus);
        
        tampilkanHeader("Menghitung Luas Permukaan Balok");
            System.out.print("Masukkan panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();

            double luasBalok = hitungLuasBalok(panjang, lebar, tinggi);
            System.out.println("Luas Permukaan Balok = " + luasBalok);
    }
 }
