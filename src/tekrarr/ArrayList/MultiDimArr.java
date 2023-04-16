package tekrarr.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MultiDimArr {
    public static void main(String[] args) {

    /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve
         harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
    String[][] mdNames = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
    arrayConvertToList(mdNames);


    }



    private static ArrayList<String> arrayConvertToList(String[][] str) {//bu method MDarray alir ArrayList return eder
        ArrayList <String> nameList=new ArrayList<>();

        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j < str[i].length ; j++) {
                nameList.add(str[i][j]);

            }
        }
        System.out.println("nameList = " + nameList);//nameList = [Ali, Veli, Ayse, Hasan, Can, Suzan]
        Collections.sort(nameList);
        System.out.println("nameList = " + nameList);//nameList = [Ali, Ayse, Can, Hasan, Suzan, Veli]

        return nameList;

    }
}
