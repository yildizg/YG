package taskcevaplari.task12;

import java.util.Scanner;

public class Odev01Medium {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Max Number: ");
        int max = scanner.nextInt();

        System.out.println(randomNum(max));


    }


    public static int randomNum(int max) {
        int random = (int) (Math.random() * max);
        return random;
    }
}
