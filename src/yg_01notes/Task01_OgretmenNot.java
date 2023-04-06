package yg_01notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01_OgretmenNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        List<Integer> listNotlar= new ArrayList<>();
        Scanner input =new Scanner(System.in);
        String devamMi;
        do {
            System.out.println("notlari gir");
            int ogrNot=input.nextInt();
            System.out.println("devam etmek ister misin? (E) / (H) evet icin E hayir H tuslarina basiniz");
            devamMi=input.next();
            listNotlar.add(ogrNot);
        }while (devamMi.equalsIgnoreCase("E"));

        Collections.sort(listNotlar);
        System.out.println("listNotlar = " + listNotlar);

        //ortalama hesapla
        int toplam=0;
        for (int w: listNotlar  ) {
            toplam+=w;
        }
        double ortalama = toplam / listNotlar.size();

        System.out.println("ortalama = " + ortalama);

        //ortalamayi gecen notlar
        int ortalamaGecenSayi=0;
        for (int q:listNotlar    ) {
            if (q > ortalama){
                ortalamaGecenSayi++;
                System.out.print("ortalamayi gecen not "+q);
            }
        }
        System.out.println();
        System.out.println("ortalamaGecenSayi = " + ortalamaGecenSayi);


    }
}
