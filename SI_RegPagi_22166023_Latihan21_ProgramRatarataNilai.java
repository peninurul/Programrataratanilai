/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan21_program.ratarata.nilai;
import java.util.Scanner;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO21
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Program Ratarata nilai
 */
public class SI_RegPagi_22166023_Latihan21_ProgramRatarataNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa;
        float totalNilai = 0, nilai, rataRata;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextFloat();
            totalNilai += nilai;
        }

        System.out.println();
        rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Maka, Rata-rata nilainya adalah " + rataRata);
    
   
    }
    
}
