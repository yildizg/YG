package taskcevaplari.task8;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Adinizi giriniz" );
        String isim= input.nextLine();
        System.out.println("Soyadinizi giriniz" );
        String soyisim= input.nextLine();
        System.out.println("isim.substring(0).toUpperCase() = " + isim.substring(0,1).toUpperCase());
        System.out.println("soyisim.substring(0).toUpperCase() = " + soyisim.substring(0,1).toUpperCase());

    }
}
