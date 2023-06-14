/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Veroagrisand
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        // Menciptakan objek dari class mobil
         Mobil den =new Mobil();
         Mobil buruak=new Mobil();
         
         //memberikan attributte object
         
         den.tahunperakitan=2002;
         den.ban="Ucupbotak";
         den.warna="Hijau lumuik";
         den.Jumlahban=5;
         
         //jika mobil buruak ingin beda dengan value makan input dibawah dengan format yang sama diatas
         buruak.tahunperakitan=2003;
         buruak.ban="roda kayu lubang";
         buruak.warna="Kuniang cirik";
         buruak.Jumlahban=10;
         
         //MEmanggil fungsi
         System.out.println("Warna oto den "+buruak.warna);
         System.out.println("Ban oto den "+buruak.ban); 
         System.out.println("Ban oto den ado "+buruak.Jumlahban); 
    }
}
