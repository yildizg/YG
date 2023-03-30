package taskcevaplari.task8;

public class Task13 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14
        String str="Ali okula gitti.";
        System.out.println(str.replaceAll("\\s", "").length());


        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.





        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.

        String str2= "adana";
        System.out.println(str2.replaceAll("a", "A"));

        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz

        String str3= "kara";
        System.out.println(str3.replaceAll("k", "*").replaceAll("a","*").replaceAll("r","*") );



        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********

        String str4= "AC202117004";
        System.out.println(str4.replaceAll("\\d", "*"));


    }
}
