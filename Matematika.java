/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Veroagrisand
 */
public class Matematika {
        int hasil;
    //mutator <memproses nilai>=====
    void Tambah(int a, int b){
        hasil=a+b;
        System.out.print("penjumlahan "+a+" dengan "+b+" adalah ");
    }
    void Kurang(int a, int b){
        hasil=a-b;
        System.out.print("pengurangan "+a+" dengan "+b+" adalah ");
    }
    void Kali(int a, int b){
        hasil=a*b;
        System.out.print("perkalian "+a+" dengan "+b+" adalah ");
    }
    void Bagi(int a, int b){
        hasil=a/b;
        System.out.print("pembagian "+a+" dengan "+b+" adalah ");
    }
    //==============================
    //Accessor======================
    int hasile(){
        return hasil;
    }

}

