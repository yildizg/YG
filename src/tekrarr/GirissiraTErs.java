package tekrarr;

import java.util.Arrays;
import java.util.Scanner;

public class GirissiraTErs {
    // Task -> Kullanıcıdan alacağınız 5 adet sayıyı ,
    // girişi sırasına göre tersten print eden code create ediniz
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+"inci sayi girin");
            arr[i]=a.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+",");

        }
        System.out.println();
    }
}
