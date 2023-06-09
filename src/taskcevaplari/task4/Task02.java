package taskcevaplari.task4;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("kg olarak vucut agirliginiz = ");

        double agirlik = scan.nextDouble();
        System.out.print("cm olarak boy uzunlugunuz = ");

        double uzunluk = scan.nextDouble();

        uzunluk = uzunluk / 100;  //uzunluk/=100

        double vke = agirlik / (uzunluk * uzunluk);

        System.out.println("vucut kitle indeksi (VKI)= " + vke);
    }
}
