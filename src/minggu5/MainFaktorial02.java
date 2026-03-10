package minggu5;

import java.util.Scanner;

public class MainFaktorial02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();

        Faktorial02 fk = new Faktorial02();
        System.out.println(" Nilai faktorial " + nilai + " Menggunakan BF  : " + fk.faktorialBF(nilai));
        System.out.println(" Nilai faktorial " + nilai + " Menggunakan DC  : " + fk.faktorialDC(nilai));
    }
}
