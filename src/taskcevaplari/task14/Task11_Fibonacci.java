package taskcevaplari.task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);

        System.out.println(fibo); // [1, 1]


        for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi ; i++) {


            fibo.add(fibo.get(i-2)+fibo.get(i-1));

        }

        System.out.println(fibo);

        //2.yol

        int i = 2;
        int yeniSayi = 0;

        while (yeniSayi < sayi) {

            yeniSayi = fibo.get(i - 2) + fibo.get(i - 1);

            fibo.add(yeniSayi);

            i++;
        }

        System.out.println(fibo);


    }
}
