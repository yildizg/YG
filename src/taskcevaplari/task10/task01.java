package taskcevaplari.task10;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */


        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;
        int sayAdedi = 0;

        while (toplam < 333) {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayAdedi++;
        }

        System.out.println("artik yeter " + sayAdedi + " sayi girdin, toplam : " + toplam + " oldu");
    }
}
