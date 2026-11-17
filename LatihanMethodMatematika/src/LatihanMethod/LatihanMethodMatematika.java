/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMethod;

/**
 *
 * @author MSI
 */
public class LatihanMethodMatematika {
    public static double hitungLuasBola(double jarijari){
       double LuasBola=(3.14 * 4 * jarijari * jarijari);
       return LuasBola;       
    }   
    
    public static double hitungLuasKubus(double sisi){
       double LuasKubus=(6*sisi*sisi);
       return LuasKubus;       
    }   
    
    public static double hitungLuasBalok(double p, double l, double t) {
    double luasPermukaan = 2 * ((p * l) + (p * t) + (l * t));
    return luasPermukaan;
}
        
       // Method Void: Menampilkan Header/Banner dekoratif
    public static void tampilkanHeader(String judul) {
        System.out.println(" ");
        System.out.println("===+==========================+==");
        System.out.println("  " + judul.toUpperCase());
        System.out.println("===+==========================+==");
        
    }
}
