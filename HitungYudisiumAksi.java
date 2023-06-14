/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author Veroagrisand
 */
public class HitungYudisiumAksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NilaiYudisium ver = new NilaiYudisium();

        System.out.print("Masukkan nilai tugas: ");
        int tugas = input.nextInt();

        System.out.print("Masukkan nilai UTS: ");
        int uts = input.nextInt();

        System.out.print("Masukkan nilai UAS: ");
        int uas = input.nextInt();

        ver.ProsesTotalNilai(tugas, uts, uas);
        double totalNilai = ver.TampilkanTotalNilai();

        ver.HitungYudisium((int) totalNilai);
        String yudisium = ver.TampilkanYudisium();

        System.out.println("Total nilai: " + totalNilai);
        System.out.println("Nilai huruf dan yudisium: " + yudisium);
    }
}