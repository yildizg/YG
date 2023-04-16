package tekrarr.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Konular {
     /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirleme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos birakilan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<Wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru



    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrays.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */
     public static void main(String[] args) {


     //nCopies methodu kopyalamak istediginiz degeri verdiginiz sayi kadar copy ediyior
     ArrayList<String> city = new ArrayList<>(Arrays.asList("berlin", "koln", "hamburg", "dussedorf", "frankfurt", "munih"));
        System.out.println("city = " + city);

    ArrayList<String> country = new ArrayList<>(List.of("almanya", "amerika", "fransa", "hollanda", "ingiltere"));
        System.out.println("country = " + country);//country = [almanya, amerika, fransa, hollanda, ingiltere]


    //yeni bir arrayList create ediniz
    ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7, "turkiye"));
        System.out.println("yeniList = " + yeniList);//yeniList = [turkiye, turkiye, turkiye, turkiye, turkiye, turkiye, turkiye]

    //addAll ile iki liste birlestirme
//        city.addAll(country);
//        System.out.println("city = " + city);//city = [berlin, koln, hamburg, dussedorf, frankfurt, munih, almanya, amerika, fransa, hollanda, ingiltere]
//        System.out.println("country = " + country);//country = [almanya, amerika, fransa, hollanda, ingiltere]

    //belirlenen index e country list i eklendi
        city.addAll(1, country);
        System.out.println("city = " + city);
        System.out.println("country = " + country);

    // Integer data type olan bir array listeeleman ekleme
    ArrayList<Integer> num = new ArrayList<>(List.of(25, 33, 66, 55, 88, 55, 66, 34));

        num.add(55);
         //indexOf();-> list içinde istenen elemanın index değerin return eder

         ArrayList<String> city1 = new ArrayList<>(Arrays.asList("berlin", "koln", "hamburg", "dussedorf", "frankfurt", "munih"));
         System.out.println("city = " + city1);

         ArrayList<String> country1 = new ArrayList<>(List.of("almanya", "amerika", "fransa", "hollanda", "ingiltere"));
         System.out.println("country = " + country);//country = [almanya, amerika, fransa, hollanda, ingiltere]

         System.out.println("city.indexOf(\"berlin\") = " + city1.indexOf("berlin"));//city.indexOf("berlin") = 0
         System.out.println("city.indexOf(\"Berlin\") = " + city1.indexOf("Berlin"));//city.indexOf("Berlin") = -1

         country1.add("almanya");//en sona ekler
         System.out.println("country.indexOf(\"almanya\") = " + country1.indexOf("almanya"));//country.indexOf("almanya") = 0
         System.out.println("country.lastIndexOf(\"almanya\") = " + country1.lastIndexOf("almanya"));//country.lastIndexOf("almanya") = 5
         /// en sondaki elamani bulur onun  indexini verir yani aramaya sagdan gelir
         System.out.println("city1.get(1) = " + city1.get(1));
         System.out.println("country1.size() = " + country1.size());
         System.out.println("country1.set(2,\"norvec\") = " + country1.set(2, "norvec"));
         System.out.println("country1.subList(3,5) = " + country1.subList(3,5));
         System.out.println("country1.isEmpty() = " + country1.isEmpty());

        //equals(); -> iki listin index ve elelman eşitliğini montrol eder true/false return

                 ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a","b"));//eleman eklendi [a,b]

         ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A","b"));//eleman eklendi [A,b]

         ArrayList<String> list3 = new ArrayList<>(Arrays.asList("a","b"));//eleman eklendi [a,b]

         ArrayList<String> list4 = new ArrayList<>(Arrays.asList("b","a"));//eleman eklendi [b,a]
         System.out.println("list4 = " + list4);//list4 = [b, a]


         System.out.println("list1.equals(list2) = " + list1.equals(list2));//false birebir ayni mi diye bakiyor
         System.out.println("list1.equals(list3) = " + list1.equals(list3));//true
         System.out.println("list1.equals(list4) = " + list1.equals(list4));//false

        //Collections.sort(list);-> verilen list'i naturel sıralama return eder..
         //Collections.reverse(list);-> verilen listin ters sıralamasını return eder index nolarina gore

         ArrayList<String> country3 = new ArrayList<>(List.of("amerika",  "ingiltere",  "hollanda","almanya","fransa"));
         System.out.println("country3 = " + country3);//country = [amerika, ingiltere, hollanda, almanya, fransa]
         Collections.sort(country3);//bu sout icine alinamaz

         System.out.println("country3 = " + country3);//country = [almanya, amerika, fransa, hollanda, ingiltere]

         Collections.reverse(country3);//tersine cevrildi
         System.out.println("country3 = " + country3); //country = [ingiltere, hollanda, fransa, amerika, almanya]

         System.out.println("country3.contains(\"almanya\") = " + country3.contains("almanya"));// = true
         System.out.println("country3.contains(\"norvec\") = " + country3.contains("norvec")); //false

         Collections.sort(country3);
         System.out.println("country3.remove(1) = " + country3.remove(1));
         country.add("amerika");
         country.addAll(city);

         //replaceAll();-> listte belirli bir elemanı belirli bir değer ile update eder

         ArrayList< Integer > listNumber = new ArrayList<>(Arrays.asList(1 ,2 ,3 ,55 ,66 ,44 ,89 ,8 , 35));
         System.out.println("listNumber = " + listNumber);  //listNumber = [1, 2, 3, 55, 66, 44, 89, 8, 35]

         Collections.replaceAll(listNumber,1,22); //listNumber = [22, 2, 3, 55, 66, 44, 89, 8, 35]

         System.out.println("listNumber = " + listNumber);


         //fill();->listte tüm elelmanları belirli bir değere update der.
         Collections.fill(listNumber,33);

         System.out.println("listNumber = " + listNumber);
         //listNumber = [33, 33, 33, 33, 33, 33, 33, 33, 33]

         //listi Array e cevirmek icin toArray() methodu kullanilir

         ArrayList<String> country5 = new ArrayList<>(List.of("amerika",  "ingiltere",  "hollanda","almanya","fransa"));

         //1..yol donen degeri Object class a atandi
         Object [] arrCountry = country5.toArray();//Arrays.toString(arrCountry) = [amerika, ingiltere, hollanda, almanya, fransa]



             //

             String [] names={"Yildiz","Ahmet","Gulhan","Asiye","Fethiye","Sureyya"};
             System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
//Arrays.toString(names) = [Yildiz, Ahmet, Gulhan, Asiye, Fethiye, Sureyya]

             List<String > namesList = Arrays.asList(names);
             System.out.println("namesList = " + namesList);
             //namesList = [Yildiz, Ahmet, Gulhan, Asiye, Fethiye, Sureyya]

             //RTE     System.out.println("namesList.add(\"zafer\") = " + namesList.add("zafer"));
             ///java.lang.UnsupportedOperationException hatasu aliriz cunku bu bir array den liste cevrilme
             //  bunun cozumu List yerine ArrayList yazmaktir

             //RTE     ArrayList<String > namesList2 = (ArrayList<String>) Arrays.asList(names);
             ///    java.lang.ClassCastException


             ArrayList<String > namesList2 = new ArrayList<>(Arrays.asList(names));
             System.out.println("namesList2 = " + namesList2);//namesList2 = [Yildiz, Ahmet, Gulhan, Asiye, Fethiye, Sureyya]
             Collections.sort(namesList2);
             System.out.println("namesList2 = " + namesList2);//namesList2 = [Ahmet, Asiye, Fethiye, Gulhan, Sureyya, Yildiz]



         }
}