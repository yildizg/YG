package yg_01notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task03_Manav {
    /* TASK :
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     * */


        static List<String > urunlerList=new ArrayList<>(Arrays.asList(
                "Domates- urun kodu : 1",
                "elma- urun kodu : 2",
                "muz - urun kodu : 3",
                "patlican - urun kodu : 4",
                "sarimsak - urun kodu : 5"
                ));
        static List<Double> urunFiyatlarList=new ArrayList<>(Arrays.asList(
                            2.5,
                            1.0,
                            1.5,
                            5.5,
                            2.0
        ));

        static double odenecekToplamTutar;
        static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(urunlerList);
        musteriSecim();

    }
    private static void musteriSecim(){
        System.out.println("hangi urunu alisen");
        int secim=input.nextInt();

        System.out.println("sectigin urunden kac kilo alcaksin");
        double kilo =input.nextDouble();

        odenecekToplamTutar +=   urunFiyatlarList.get(secim-1)   *   kilo ;
        System.out.println("sectigin urun " +urunlerList.get(secim-1));
        System.out.println("aldigin urunun fiyati "+( urunFiyatlarList.get(secim-1)   *   kilo ));

        System.out.println("urun almaya devvam mi 1 tamam mi 2 tuslama yapiniz");
        int karar=input.nextInt();
        if (karar==1){
            musteriSecim();
        }else kasa();


    }
    private static void kasa(){
        System.out.println("odenecekToplamTutar = " + odenecekToplamTutar);
    }

}
