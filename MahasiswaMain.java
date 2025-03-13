/*
 * Nama Pembuat : Daffiq Trie Octorino
 * NIM          : 2401083003
 * Nama Program : Penghitung Nilai Akhir
 */

package latihan_1;
import java.util.Scanner;


public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai Quiz: ");
        double quiz = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, tugas, quiz, uts, uas);
        mhs.tampilData();
        
        scanner.close();
    }
}
