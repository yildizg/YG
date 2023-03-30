package taskcevaplari.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sayi = oku.nextInt();

        while (sayi > 0) {
            if (sayi % 2 == 1) {
                System.out.println("sayi = " + sayi);
            }

            sayi--; // sayi=sayi-1;
        }
    }
}
