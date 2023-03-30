
package taskcevaplari.task10;
public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */


        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");


        // ayni soruyu while loop ile yapalim

        while (baslangic<=bitis){

            System.out.print(baslangic + " ");
            baslangic++;
        }
        System.out.println("");
        System.out.println(baslangic); // 61
    }
}
