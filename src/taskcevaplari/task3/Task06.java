
package taskcevaplari.task3;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin a kenar uzunluğunu giriniz: ");
        int a = scanner.nextInt();

        System.out.print("Üçgenin b kenar uzunluğunu giriniz: ");
        int b = scanner.nextInt();

        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + h);



    }
}
