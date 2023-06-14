/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

import java.util.Scanner;


public class Umur {


    static void hitungumur(){
         Scanner input = new Scanner(System.in);
            
         int tl, bl,um,bls,bll;
         int us=0;
         
         System.out.print("Masukkan tahun lahir anda: ");
         tl = input.nextInt(); 
         
         um=2023-tl;
         
         System.out.print("Masukkan bulan lahir anda 1 - 12: ");
         bl = input.nextInt();
         
         
         if (bl>=3) {
             us=um -1;
             bls=3+12;
             bll=bls-bl;
        
        }
         else {
             bll=3 - bl;
        }
         
         
         System.out.println("Tahun lahir anda : "+tl);
         System.out.println("Bulan lahir anda : "+bl);
         System.out.println("Umur anda : "+us+" Tahun"+bll+" bulan");
    }
    public static void main(String[] args) {
        
      hitungumur();
   
    }
}

