package taskcevaplari.task12;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanıcı bir mail lutfen ");

        String str= scan.nextLine();

        System.out.println(emailKontrol(str));
    }

    public static boolean emailKontrol(String str) {
        boolean sonuc=false;
        if (str.contains("@") && str.contains(".") && str.charAt(0)!='@' ) {
            sonuc=true;
        }
        return sonuc;
    }



}