/*
Nama    : Andi Ardian Ramadhan HR
Nim     : 13020220114
Kelas   : A3
Senin, 25/03/2024
 */
package Evaluasi;

import EvaluasiHitungNilai.HitungNilaiAkhir;
import EvaluasiMahasiswa.Identitas;
import EvaluasiMahasiswa.Nilai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Utama {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Stambuk: ");
        String stambuk = scanner.nextLine();

        System.out.print("Masukkan Nilai Tugas 1: ");
        int tugas1 = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Masukkan Nilai Tugas 2: ");
        int tugas2 = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Masukkan Nilai MID: ");
        int mid = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Masukkan Nilai UAS: ");
        int uas = Integer.parseInt(bufferedReader.readLine());

        Identitas identitas = new Identitas();
        Nilai nilai = new Nilai();

        HitungNilaiAkhir hitungNilai = new HitungNilaiAkhir();
        double tugas = hitungNilai.nilaiTugas(tugas1, tugas2);

        double na = hitungNilai.nilaiAkhir(tugas, mid, uas);

        JOptionPane.showMessageDialog(null, "Nama: " + nama + "\nStambuk: " + stambuk);
        JOptionPane.showMessageDialog(null, "Nilai Tugas: " + tugas + "\nNilai MID: " + mid + "\nNilai UAS: " + uas + "\nNilai Akhir: " + na);
    }
}

