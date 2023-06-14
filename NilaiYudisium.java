/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Veroagrisand
 */
public class NilaiYudisium extends Nilai {
    private String nilaiHuruf;
    private String yudisium;
    
    public void HitungYudisium(int totalNilai) {
        if (totalNilai >= 90 && totalNilai <= 100) {
            nilaiHuruf = "A+";
            yudisium = "Excelent";
        } else if (totalNilai >= 80 && totalNilai <= 89) {
            nilaiHuruf = "A";
            yudisium = "Sempurnah";
        } else if (totalNilai >= 70 && totalNilai <= 79) {
            nilaiHuruf = "B+";
            yudisium = "Sangat Baik";
        } else if (totalNilai >= 60 && totalNilai <= 69) {
            nilaiHuruf = "B";
            yudisium = "Baik";
        } else if (totalNilai >= 55 && totalNilai <= 59) {
            nilaiHuruf = "C+";
            yudisium = "Kurang Baik";
        } else if (totalNilai >= 50 && totalNilai <= 54) {
            nilaiHuruf = "C";
            yudisium = "Cukup";
        } else if (totalNilai >= 45 && totalNilai <= 49) {
            nilaiHuruf = "D";
            yudisium = "Kurang";
        } else {
            nilaiHuruf = "E";
            yudisium = "Gagal";
        }
    }
    
    public String TampilkanYudisium() {
        return "Nilai Huruf: " + nilaiHuruf + "\nYudisium: " + yudisium;
    }
}