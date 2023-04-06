package tekrarr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UceBolunen {
    /* TASK :
    Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int []arr=new int[8];
        int count=0;
        for (int i = 0; i <8 ; i++) {
            System.out.println(i+"nci elemani gir");
            i=scn.nextInt();
           if (i%3==0){
            count++;
           }

        }
        System.out.println(count);

    }
}
