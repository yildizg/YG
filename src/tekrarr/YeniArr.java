package tekrarr;

import java.util.Arrays;

public class YeniArr {
    // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
    // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
    // output : int yeniArr[]={6,11,-7}
    public static void main(String[] args) {
    int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
    int sayi2[] =new int[sayi.length];
    int toplam=0;
        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length; j++) {
                toplam+=sayi[i][j];
                
            }sayi2[i]=toplam;


            }
        System.out.println("Arrays.toString(sayi2) = " + Arrays.toString(sayi2));

    }




    }


