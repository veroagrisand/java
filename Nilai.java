/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Veroagrisand
 */
public class Nilai {
    private int tugas;
    private int uts;
    private int uas;
    private double totalNilai;
    
    public void ProsesTotalNilai(int tugas, int uts, int uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.totalNilai = 0.3 * tugas + 0.35 * uts + 0.35 * uas;
    }
    
    public double TampilkanTotalNilai() {
        return totalNilai;
    }
}