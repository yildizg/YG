package yg_01notes;

public class Task03 {
    public static void main(String[] args) {

          /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden
        METHOD create ediniz.
         */
        int sayi=5;
        String name="sureyya";
        String name2="ahmet";
        String name3="fethiye";
        String name4="gulhan";
        String name5="yildiz";
        String name6="asiye";

        carpEnUzunIsimLength(5,  name,name2,name3,name4,name5,name6);
    }

    private static void carpEnUzunIsimLength( int sayi, String... names  ) {//Vararg parameter must be the last in the list
        String enUzunIsim=" ";
        System.out.println("names.length = " + names.length);//kactane elaman var

        for (String str:names  ) {
            if (str.length() > enUzunIsim.length()){
                enUzunIsim=str;
            }
        }
        System.out.println("enUzunIsim = " + enUzunIsim);
        System.out.println("istenen deger "+sayi + " * " +enUzunIsim.length()+" = "+(sayi*enUzunIsim.length()));

    }
}
