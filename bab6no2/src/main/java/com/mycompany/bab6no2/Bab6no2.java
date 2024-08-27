/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6no2;
import java.util.Scanner;
/**
 *
 * @author ayash
 */
public class Bab6no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);      
       System.out.print("Masukan NIM : ");
       int NIM = input.nextInt();
       input.nextLine();
       
        System.out.print("Masukan Nama :");
        String nama = input.nextLine();
        
        System.out.print("Masukan Nilai :");
        int nilai = input.nextInt();
        
         if(nilai>=85 && nilai<100) {
            System.out.println("grade A");
            System.out.println("Keterangan : Lulus");
        } else if (nilai>=75 && nilai<85) {
            System.out.println("grade B");
            System.out.println("Keterangan : Lulus");
        } else if (nilai>=65 && nilai<75){
            System.out.println("grade C");
            System.out.println("Keterangan : Lulus");
        } else if (nilai > 100) {
            System.out.println("Maksimal hanya 100");
        } else { 
            System.out.println("Mohon maaf, anda dinyatakan tidak lulus.");
        }
    }
}
