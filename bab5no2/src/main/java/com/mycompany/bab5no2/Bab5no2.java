/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5no2;

/**
 *
 * @author ayash
 */
import java.util.Scanner;
public class Bab5no2 {

        public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Masukan angka untuk panjang dari alas segitiga: ");
       double alas = input.nextDouble();
       
       System.out.print("Masukan angka untuk panjang dari luas segitiga: ");
       double luas = input.nextDouble();
       
       System.out.println("Luas Segitiga : " + alas);
       System.out.println("Luas Segitiga : " + luas);
    }
}