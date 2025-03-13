/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Penghitung Nilai Akhir
 */

package latihan_1;
import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String nim;
    double tugas, quiz, uts, uas;

    public Mahasiswa(String nama, String nim, double tugas, double quiz, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.tugas = tugas;
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.15) + (quiz * 0.20) + (uts * 0.30) + (uas * 0.25);
    }

    public String konversiNilai(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 65) {
            return "B";
        } else if (nilaiAkhir >= 50) {
            return "C";
        } else if (nilaiAkhir >= 40) {
            return "D";
        } else {
            return "E";
        }
    }

    public String cekKelulusan(double nilaiAkhir) {
        return (nilaiAkhir >= 65) ? "Lulus" : "Tidak Lulus";
    }

    public void tampilData() {
        double nilaiAkhir = hitungNilaiAkhir();
        String nilaiHuruf = konversiNilai(nilaiAkhir);
        String kelulusan = cekKelulusan(nilaiAkhir);
        
        System.out.println("============================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Status: " + kelulusan);
        System.out.println("============================");
    }
}

