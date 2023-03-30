package taskcevaplari.task14;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("yellow", "red", "blue", "red", "blue"));

        String s1 = "blue";
        String s2 = "yellow";

        System.out.println(changeInArraylist(arrayList, s1, s2));


    }

    public static ArrayList<String> changeInArraylist(ArrayList<String> arrayList, String s1, String s2) {

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).equals(s1)) {
                arrayList.set(i, s2);
            }
        }
        return arrayList;
    }
}
