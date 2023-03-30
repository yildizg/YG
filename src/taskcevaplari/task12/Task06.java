package taskcevaplari.task12;

import java.time.LocalDate;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner sc = new Scanner(System.in);
        System.out.print("Tarih giriniz : ");
        int a = sc.nextInt();
        LocalDate date = LocalDate.of(a, 11, 15);
        System.out.println(date.isLeapYear());


    }

    @SuppressWarnings("unused")
    private static boolean artikYilMi2(int yil) {


        return (yil % 400 == 0 || (yil % 100 != 0 && yil % 4 == 0));
    }
}
