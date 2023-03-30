package taskcevaplari.task10;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */


        Scanner oku = new Scanner(System.in);
        String okunan = "";

        do {
            okunan = oku.nextLine();
            if (okunan.equalsIgnoreCase("x")) break; // break : döngü kırıcı

            System.out.println("Program çalışıyor");
        } while (!okunan.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");
    }
}
