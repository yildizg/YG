package CALISMALAR.ilkkonular;

import java.util.Scanner;

public class yg_02TypeCasting {
    public static void main(String[] args) {
        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         */
        Scanner input=new Scanner(System.in);  //kullaniicidan veri alabilmek icin Scanner
        System.out.println("bir karakter girin");//kullaniciya komut verdik veri girmesi icin
        char ch = input.nextLine().charAt(0);   //1-kullanici veri girebilsin diye input objesinden nextLine methodu kullanildi
        //2- tek karakter istedigimiz icin chatAt methodu kullanildi
        //3- estiligin sol tarafi ile ilgili kullanicinin girdigi veri uygun data type belirlenerek
        //        1 ve 2. adimlardaki islemlerden  fayadalanip ATAMA yapildi
        System.out.println("ch = " + (ch+0)); //yazdirildi
        //char variable bir deger ile toplanirsa ascii degerine gore islem yapilir

        //double charAsciiDegeri = ch; buda olur
        int charAsciiDegeri =  ch;

        System.out.println("charAsciiDegeri = " + charAsciiDegeri);
        // System.out.println("ch = " + (int) ch); tercihe dayali diger yol

        System.out.println("bir string ifade giriniz");

        String str=input.nextLine(); //
        System.out.println("str = " + str.hashCode());

        String str2="$";
        System.out.println("str2 = " + str2.hashCode());












    }
}
