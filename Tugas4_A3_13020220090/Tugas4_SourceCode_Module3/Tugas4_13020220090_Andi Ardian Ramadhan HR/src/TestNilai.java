/*
Nama    : Andi Ardian Ramadhan HR
Nim     : 13020220090
Kelas   : A3
Senin, 25/03/2024
 */
import java.util.Scanner;

public class TestNilai {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];

        System.out.print("Masukkan Opsi (1 untuk Input Nilai, 2 untuk Input Nilai Baru): ");
        int opsi = input.nextInt();

        switch (opsi) {
            case 1:
                System.out.print("Masukkan Nilai : ");
                hitung.inputNilai(nilai);
                System.out.print("Daftar Nilai : ");
                hitung.cetakNilai(nilai);
                System.out.println("Rata Nilai : " + hitung.rataNilai(banyakData));
                break;
            case 2:
                System.out.print("Masukkan Nilai Baru: ");
                hitung.inputNilaiBaru(banyakData);
                System.out.print("Daftar Nilai Baru : ");
                hitung.cetakNilaiBaru();
                break;
            default:
                System.out.println("Opsi yang dimasukkan tidak valid.");
        }
    }
}
