package taskcevaplari.task14;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(getSum(arrayList));


    }

    public static int getSum(ArrayList<Integer> arrayList) {

        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {

            sum += arrayList.get(i);
        }
        return sum;
    }
}
