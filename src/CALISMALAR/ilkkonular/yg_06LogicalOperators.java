package CALISMALAR.ilkkonular;

public class yg_06LogicalOperators {
    public static void main(String[] args) {

        /*
    -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)---------

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
    */
        // && ile & arasindaki fark
        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı
        // kontrol etmeye calısmaz.

        // Ancak & tum satırı kontrol eder ondan sonra durur.
        //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri
        // sonuna kadar gider.&& tekliye gore daha hizli calisir

        //and->ve

        boolean b1 = true;
        int a = 3;
        int b = 5;

        //and  ve
        System.out.println("b1 & (a<b) = " + (b1 & (a < b)));  //true// pesimist

        System.out.println("b1 && (a>b) = " + (b1 && (a > b))); // Condition 'b1 && (a > b)' is always 'false' when reached


        //or veya
        System.out.println("b1 || (a<b) = " + (b1 || (a < b))); // Condition 'b1 || (a < b)' is always 'true' when reached

        System.out.println("b1 || (a<b) = " + (b1 || (a > b)));//Condition 'b1 || (a > b)' is always 'true' when reached
        // sonuc true dur cunku bir tane true olmasi yeterli optimist



        //not !
        System.out.println("b1 || (a>b) = " + !(b1 || (a > b))     ); // Condition '!(b1 || (a > b))' is always 'false' when reached












    }
}
