package tekrarr;

public class Intters {
    // Task-> girilen int değeri tersten print eden code create ediniz.
    public static void main(String[] args) {
    int a =123;


        int reversedNumber = 0;
        while (a != 0) {
            int digit = a % 10;
            reversedNumber = reversedNumber * 10 + digit;
            a /= 10;
        }

        System.out.println("Girilen sayının tersi: " + reversedNumber);
        //todo asiyeye sor
    }
}
