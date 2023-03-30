package taskcevaplari.task8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
        String adSoyad = scan.nextLine();

        // Haluk Bilgin    substring(başlangıç index, e kadar - dahil değil)


        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        String Soyad = adSoyad.substring(adSoyad.indexOf(" ")+ 1);

        System.out.println("ad = " + ad);       //ad = haluk
        System.out.println("Soyad = " + Soyad); //Soyad = bilgin
    }
}
