/*
Nama    : Andi Ardian Ramadhan HR
Nim     : 13020220090
Kelas   : A3
Senin, 25/03/2024
 */
import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> dataMap = new java.util.HashMap<>();

        System.out.println("Masukkan data (Key=Value) atau ketik 'selesai' untuk mengakhiri:");

        while (true) {
            System.out.print("Masukkan key: ");
            String key = scanner.nextLine();

            if (key.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan value (Integer): ");
            int value = scanner.nextInt();
            scanner.nextLine();

            dataMap.put(key, value);
        }

        System.out.println("\nData yang dimasukkan:");
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
