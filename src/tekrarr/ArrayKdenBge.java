package tekrarr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayKdenBge {

        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge
//        // siralayip return eden METHOD create ediniz
        public static void main (String[]args){
//            int numbers[] = {12, 13, 321, 432, 34, 4323, 4, 23};
//            int sayi1[] = {39, 3, 72, 63, 84};

//            Arrays.sort(sayi1);
//            System.out.println(Arrays.toString(sayi1));//kücükten büyüge
//            for (int i = sayi1.length-1; i >=0 ; i--) {
//                System.out.print( sayi1[i]+" ");//büyükten kücüge


//            //Task-> kullanıcidan alınan değerlerle bir int array
//            // elemanlarını bukukten kucuge   print eden code create edin.
//            Scanner input=new Scanner(System.in);
//            System.out.println("kac elemanli array olsun");
//            int boyut= input.nextInt();
//            int []arr5=new int[boyut];
//            for (int i = 0; i <boyut ; i++) {
//                System.out.println(i+" nci degeri gir");
//                arr5[i]=input.nextInt();
//
//
//            } System.out.println(Arrays.toString(arr5));//girildigi sirayla yazdirma
//            Arrays.sort(arr5);//kücükten büyüge siralama
//            System.out.println(Arrays.toString(arr5));//kücükten büyüge yazdirma
//            for (int i = arr5.length-1; i >=0 ; i--) {
//                System.out.println(arr5[i]+" ");//büyükten kücüge yazdirma


            //task-> girilen int array elemanları
            // toplamını print eden code create ediniz.
            Scanner input1=new Scanner(System.in);
            System.out.println("kac elemanli");
            int boy= input1.nextInt();
            int arr3[]=new int[boy];
            int toplam=0;
            for (int i = 0; i <boy ; i++) {
                System.out.println(i +" nci elemani gir");
                arr3[i]= input1.nextInt();
                toplam+=arr3[i];


            }
            System.out.println("toplam" +toplam);
            System.out.println(Arrays.toString(arr3));
            Arrays.sort(arr3);
            System.out.println(Arrays.toString(arr3));
            for (int i = arr3.length-1; i >=0 ; i--) {
                System.out.println(arr3[i]+" ");

            }
        }
}
