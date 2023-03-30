package taskcevaplari.task14;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 4, 6, 7));

        System.out.println(secondMax(arrayList));


    }

    public static int secondMax(ArrayList<Integer> arrayList) {

        int max = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }

        int max2 = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) > max2 && arrayList.get(i) != max) {
                max2 = arrayList.get(i);
            }
        }
        return max2;
    }
}
 /*
        Collections.sort(arrayList);
        int num =  arrayList.get(arrayList.size()-2);
        return num;

     */
