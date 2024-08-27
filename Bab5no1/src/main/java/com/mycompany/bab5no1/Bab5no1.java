/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5no1;
import java.util.Scanner;
/**
 *
 * @author ayash
 */


public class Bab5no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        
        System.out.print("Gaji: ");
        String gaji = input.nextLine();
        
        System.out.println("### pendataan Karyawan Pt. Petani kode ###");
        System.out.println("Nama Karyawan; "+ nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Gaji: " + gaji);
    }
}
