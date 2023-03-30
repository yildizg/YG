package taskcevaplari.task8;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Adinizi ve soyadinizi giriniz");
        String adsoyad = input.nextLine();
        String ad = adsoyad.toUpperCase().substring(0, 1);

        String ad2soyad = adsoyad.toUpperCase().substring(adsoyad.indexOf(" ")+1);
        String ad2 = ad2soyad.toUpperCase().substring(0,1);

        String soyad = ad2soyad.toUpperCase().substring(ad2soyad.indexOf(" ")+1,ad2soyad.indexOf(" ")+2);
        System.out.println(ad + "." + ad2 + "." + soyad);
        System.out.println(soyad);


    }
}
