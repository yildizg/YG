package taskcevaplari.task8;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

       String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      System.out.println( harfDepo.substring(24,25).concat(harfDepo.substring(8, 9)).concat(harfDepo.substring(11, 12))
              .concat(harfDepo.substring(3, 4)).concat(harfDepo.substring(8, 9).concat(harfDepo.substring(25,26))));




    }
}
