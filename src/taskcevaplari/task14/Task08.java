package taskcevaplari.task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("liste atamak için sayi giriniz \nyeterli sayiya ulastiginizda 'q' giriniz");
        int toplam = 0;
        String islem = "";
        while (!islem.equalsIgnoreCase("q")) {
            System.out.println("sayi giriniz : ");
            islem = scan.next();
            list.add(islem);
        }

        list.remove(list.size() - 1);//icinde q bulunmayan sadece sayi bulun list haline geldi
        for (String w : list) {
            int a = Integer.parseInt(w);
            toplam += a;

        }
        for(String w : list) {
            double ortalama=toplam/ list.size();
            if (Integer.parseInt(w)>ortalama) System.out.print(w+" ");
        }


    }


}
