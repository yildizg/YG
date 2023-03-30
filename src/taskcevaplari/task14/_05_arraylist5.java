package taskcevaplari.task14;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));

        System.out.println(rotateList(arrayList));

    }

    public static ArrayList<String> rotateList(ArrayList<String> arrayList) {

        ArrayList<String> arrayListTers = new ArrayList<>();

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayListTers.add(arrayList.get(i));
        }
        return arrayListTers;
    }
}

    /*
     public static ArrayList<String> rotateList(ArrayList<String> list){

        Collections.reverse(list);

        return list;
    }
     */