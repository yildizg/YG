package tekrarr;

import java.util.ArrayList;
import java.util.Arrays;

public class TheBiggestElement {
    // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...

    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24
        int max=sayi[0][0];
        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
              if(sayi[i][j]>max){
                  max=sayi[i][j];
              }
            }
        }
        System.out.println("max = " + max);


    }
}
