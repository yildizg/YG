package taskcevaplari.task14;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 4, 6, 2, 1));

        System.out.println(hillNum(arrayList));


    }

    public static int hillNum(ArrayList<Integer> arrayList) {

        int num = 0;

        for (int i = 1; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < arrayList.get(i - 1) && arrayList.get(i) > arrayList.get(i + 1)) {
                num += arrayList.get(i);
            }
        }
        return num;
    }
}
