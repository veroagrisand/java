/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Veroagrisand
 */
public class Matematikaberaksi {
       public static void main(String[] args) {
           
           Matematika mat= new Matematika();
                   
           mat.Tambah(20, 20);
           System.out.println(": "+mat.hasile());
           mat.Kurang(10, 5);
           System.out.println(": "+ mat.hasile());
           mat.Kali(10, 20);
           System.out.println(": "+ mat.hasile());
           mat.Bagi(21, 2);
           System.out.println(": "+mat.hasile());
           
           
           

    }
}
    