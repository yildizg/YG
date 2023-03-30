package taskcevaplari.task8;

public class _18_String_methods14 {

    public static void main(String[] args) {

        /*  String s1 = "      Techno Study          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu aşağıya yazınız.


        String s1 = "      Techno Study          ";

        //1.yol
        String kaldir = s1.trim();
        System.out.println(kaldir);

        //2.yol
        int index_T = s1.indexOf("T");
        int index_y = s1.indexOf("y");

        String ayrilan = s1.substring(index_T, index_y + 1);
        System.out.println(ayrilan);


    }
}
