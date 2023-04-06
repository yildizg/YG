package yg_01notes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02_Arrays {
    public static void main(String[] args) {
         /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int[] arr = {1, 2, -6, 5, 66, 88, 5};

        sayininTersIsareti(arr);

        //ahmet bey
        for (int x : arr) {
            x *= -1;
            System.out.println(x);
        }
        //gulhan hanim
        for (int i : arr) {
            i *= -1;
            System.out.println(i);

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        //fethiye hanim
        isaretDegis();
    }


    public static void sayininTersIsareti(int[] array) {
        for (int w : array) {
            w *= -1;
            System.out.print(w + " ");
        }
    }

    private static List<Integer> isaretDegis() {
        int[] arr = {1, 2, -6, 5, 66, 88, 5};
        List<Integer> list = new ArrayList<>();
        int carpim = 1;
        for (int each : arr) {
            carpim = each * (-1);
            list.add(carpim);
        }
        System.out.println("list = " + list);
        return list;

    }


}