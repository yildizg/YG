package taskcevaplari.Tasks10_forLoop;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */
//
//        Scanner input=new Scanner(System.in);
//        System.out.println(" bir sayi giriniz" );
//        int sayi1= input.nextInt();
//
//        System.out.println(" bir sayi giriniz" );
//        int sayi2= input.nextInt();
//
//        System.out.println(" bir sayi giriniz" );
//        int sayi3= input.nextInt();
//
//        System.out.println(" bir sayi giriniz" );
//        int sayi4= input.nextInt();
//
//        System.out.println(" bir sayi giriniz" );
//        int sayi5= input.nextInt();
//
//        int i;
//
//         for(i=1; i<5; i++);{
//            System.out.println((sayi1) + (sayi2) + (sayi3) + (sayi4) + (sayi5));



                int toplam = 0;
                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < 5; i++) {
                    System.out.print((i + 1) + ". sayıyı giriniz: ");
                    int sayi = scanner.nextInt();

                    if (sayi < 10 || sayi > 20) {
                        toplam += sayi;
                    }
                }

                System.out.println("10 ile 20 arası hariç diğer sayıların toplamı: " + toplam);


        int total = 0;
        int count = 0;



        do {
            System.out.print("Bir sayı girin: ");
            int num = scanner.nextInt();

            if (num < 10 || num > 20) {
                total += num;

            }
            count++;
        } while (count < 5);

        System.out.println("Girilen sayıların 10 ile 20 arası hariç toplamı: " + total);

        scanner.close();
















        }
        }









