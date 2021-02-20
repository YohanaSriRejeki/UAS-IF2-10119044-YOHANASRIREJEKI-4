/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119044.yohanasrirejeki.pkg4;

import java.util.Scanner;

/**
 *
 * Nama : Yohana Sri Rejeki
 * NIM : 10119044
 * Tanggal : 20 Feb 2021
 * No Soal : 4
 */
public class UASIF210119044YOHANASRIREJEKI4 {
    public static void main(String[] args) {
        String nama, kewarganegaraan, tujuan_wisata;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("APLIKASI PENDATAAN WISATAWAN");
        System.out.println("============================");
        System.out.print("Nama : ");
        nama = input.nextLine();
        
        System.out.print("Kewarganegaraan : ");
        kewarganegaraan = input.nextLine();
         
        System.out.print("Tujuan Wisata : ");
        tujuan_wisata = input.nextLine();
        
        System.out.println();
        System.out.println("HASIL DATA APLIKASI PENDATAAN WISATAWAN");
        System.out.println("=======================================");
        System.out.println("Nama            : "+nama);
        System.out.println("Kewarganegaraan : "+kewarganegaraan);
        System.out.println("Tujuan Wisata   : "+tujuan_wisata);
    }
    
}
