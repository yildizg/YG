package taskcevaplari.Tasks10_forLoop;

import java.util.Scanner;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */Scanner scanner = new Scanner(System.in);
        System.out.print("Kare çarpım tablosunun boyutunu girin: ");
        int boyut = scanner.nextInt();

        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

//        for (int i = 1; i <5 ; i++) {
//            for (int j = 1; j <25 ; j++) {
//            if (j==i*2){
//            }
//            System.out.println((i*j)+" ");
//        }else
//        System.out.println((i*j)+" ");
//
//    }
//        System.out.println();
}}
