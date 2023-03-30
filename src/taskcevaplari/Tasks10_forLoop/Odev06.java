package taskcevaplari.Tasks10_forLoop;

import java.util.Scanner;

public class Odev06 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int tamsayi = input.nextInt();
        int toplam=0;
        for(int i=1; i <= tamsayi; i++) {
            toplam+=i*i;

        }System.out.println("1'den " + tamsayi + "'e kadar olan sayıların karelerinin toplamı: " + toplam);
        System.out.println();





    }
}
            //  chatgpt
//        Scanner scanner = new Scanner(System.in);
//
//        // Kullanıcıdan sayı girmesini iste
//        System.out.print("Bir tam sayı giriniz (1'den büyük): ");
//        int n = scanner.nextInt();
//
//        // Karelerin toplamını hesapla
//        int toplam = 0;
//        for (int i = 1; i <= n; i++) {
//            toplam += i * i;
//        }
//
//        // Sonucu ekrana yazdır
//        System.out.println("1'den " + n + "'e kadar olan sayıların karelerinin toplamı: " + toplam);
//    }
//}  konsol görüntüsü       Bir tam sayı giriniz (1'den büyük): 5
//                          1'den 5'e kadar olan sayıların karelerinin toplamı: 55







