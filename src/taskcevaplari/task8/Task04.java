package taskcevaplari.task8;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
         */

    String str ="Yildiz";
    String strs ="Sinan";
    if (str.length()%2==0){
        System.out.println("str.substring(0, 3).concat(strs).concat(str.substring( 3)) = " + str.substring(0, 3).concat(strs).concat(str.substring(3)));


    }else
        System.out.println("kelime2 kelime1 eklenemez");

}}
