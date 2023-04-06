package tekrarr;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayTekEleman {
    //Task-> girilen 7 elemanlı bir int  arrayın tek
    // elemanlarını print eden code create ediniz.
    public static void main(String[] args) {
        int boyut=3;
        Scanner a=new Scanner(System.in);
        int[]arr =new int[boyut];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+"inci elemani gir");
            arr[i]= a.nextInt();

            }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }

        }
        }




    }

