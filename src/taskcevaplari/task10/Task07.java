package taskcevaplari.task10;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner oku = new Scanner(System.in);

        int enb = 0;
        int sayac = 1;
        while (sayac <= 5) {
            System.out.print(sayac + ".Sayı giriniz= ");
            int sayi = oku.nextInt();

//            if (sayi > enb)
//                enb = sayi;

            enb = Math.max(enb, sayi);
            sayac++;
        }

        System.out.println("enb = " + enb);
    }
}
