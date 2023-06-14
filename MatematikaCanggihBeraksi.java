/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Veroagrisand
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        
        MatematikaCanggih mt=new MatematikaCanggih();
        
           mt.Tambah(20, 20);
           System.out.println(": "+mt.hasile());
           mt.Kurang(10, 5);
           System.out.println(": "+ mt.hasile());
           mt.Kali(10, 20);
           System.out.println(": "+ mt.hasile());
           mt.Bagi(21, 2);
           System.out.println(": "+mt.hasile());
           mt.modulus(5, 2);
           System.out.println(": "+mt.hasilmodulus());
    }
    
}
