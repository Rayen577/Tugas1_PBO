/*
Nim  : 13020220090
Nama : Andi Ardian Ramadhan HR
--Sabtu, 24/02/2024--
 */
public class Oper4 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);

        System.out.print ("Nilai e = "+ e); System.out.print ("\nNilai k = "+ k);
        i = 2;
        j = 3;
        k = ((i++>j++) ? i: j) ;
        System.out.print ("\nNilai k = "+ k);
    }
}
