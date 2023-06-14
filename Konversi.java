/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;
import java.util.Scanner;
/**
 *
 * @author Veroagrisand
 */
public class konversi {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     int ton, kg, g, dg, cg;
     int km, m, dam, dm, cm, mm;
     
      System.out.print("Masukkan nilai berat dalam ton: ");
      ton = input.nextInt();

      kg = ton * 1000;
      g = kg * 1000;
      dg = g * 10;
      cg = dg * 10;

      System.out.println(ton + " ton = " + kg + " kg" );
      System.out.println(ton + " ton = " + g + " g" );
      System.out.println(ton + " ton = " + dg + " dg" );
      System.out.println(ton + " ton = " + cg + " cg" );
      
      
        System.out.print("Masukkan nilai jarak dalam kilometer: ");
        km = input.nextInt();
        
        dam = km * 100;
        m = km * 1000;
        dm = km * 10000;
        cm = km * 100000;
        mm = km * 1000000;
        
        System.out.println(km +" km= "+dam + " dam");
        System.out.println(km +" km= "+m + " m");
        System.out.println(km +" km= "+dm + " dm");
        System.out.println(km +" km= "+cm + " cm");
        System.out.println(km +" km= "+mm + " mm");

    }
}