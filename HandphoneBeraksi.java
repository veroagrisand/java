/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;
import java.util.Scanner;
import static hp.Handphone.hidupkan;
import static hp.Handphone.kirimSMS;
import static hp.Handphone.lakukanpanggilan;
import static hp.Handphone.matikan;

/**
 *
 * @author Veroagrisand
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
            int plh;
            
            System.out.println("====Pilihan Menu====");
            System.out.println("1. Hidupkan Handphone ");
            System.out.println("2. Lakukan Panggilan ");
            System.out.println("3. Kirim SMS ");
            System.out.println("4. Matikan Handphone ");
            
            System.out.println("Silahkan pilih 1 - 4 : ");
            plh=input.nextInt();
            
            if(plh==1){
                hidupkan();
            }
            if(plh==2){
                lakukanpanggilan();
            }
            if(plh==3){
                kirimSMS();
            }
            if(plh==4){
                matikan();
            }
            else{
                System.out.println("Pilihan tidak ditemukan");
            }
            
    }      
} 
