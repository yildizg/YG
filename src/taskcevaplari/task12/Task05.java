package taskcevaplari.task12;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        enKucukSayi();

    }

    public static void enKucukSayi() {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scan.nextInt();
        scan.nextLine();


        if (sayi2 > sayi1 && sayi3 > sayi2) { // sayi1 en kucuk ise
            System.out.println("Girilen en kucuk sayi : " + sayi1);
        } else if (sayi1 > sayi2 && sayi3 > sayi1) { // sayi2 en kucuk ise
            System.out.println("Girilen en kucuk sayi : " + sayi2);
        } else if (sayi1 > sayi3 && sayi2 > sayi3) { // sayi3 en kucuk ise
            System.out.println("Girilen en kucuk sayi : " + sayi3);
        }

        // ternary ile
        System.out.println(sayi1 < sayi2 ? (sayi1 < sayi3 ? sayi1 : sayi3) : (sayi2 < sayi3 ? sayi2 : sayi3));

    }


}

