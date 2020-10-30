/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 *  @author
 * Nama : Rafsan Zen Mustaofa
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Menamplkan Hasil Hitung
 */
public class PBOIF210119083Latihan22PerhitunganLingkaran {
     public static double hitungJari(double diameter){
        double jari = diameter/2;
        return jari;
    }
    public static double hitungLuas(double diameter){
        double jari = hitungJari(diameter);
        double luas = 3.14 * jari * jari;
        return luas;
    }
    public static double hitungKeliling(double diameter){
        double jari = hitungJari(diameter);
        double keliling = 2 *  3.14 * jari;
        return keliling;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        String filterAngka;
        double diameter = 0;
        boolean kondisi = true;

        System.out.println("=====Perhitungan Lingkaran=====");
        do{
            System.out.print("Masukan nilai diameter lingkaran : ");
            filterAngka = scanner.nextLine();
            if(filterAngka.matches("[0-9]")){
                diameter = Integer.parseInt(filterAngka);
                kondisi = true;
            }else{
                System.out.println("Nilai Diameter Tidak Sesuai!");
                System.out.println("");
                kondisi = false;
            }
        } while(!kondisi);
        System.out.println("=======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran\t = " + hitungJari(diameter));
        System.out.println("Luas Lingkaran\t\t = " + hitungLuas(diameter));
        System.out.println("Keliling Lingkaran\t = " + hitungKeliling(diameter));
        
         System.out.println("==============================");
        System.out.println("Developed by : Rafsan Zen Mustaofa");
    }
    
}
