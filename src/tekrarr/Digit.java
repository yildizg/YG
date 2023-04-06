package tekrarr;

public class Digit {
     /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */


    public static void main(String[] args) {
        sumOfDigits("ade1r4d3");

    }public static void sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) { // karakter rakamsa
                sum += Character.getNumericValue(c); // karakterin sayısal değerini toplama ekle
            }
        }
        System.out.println("Rakamların toplamı: " + sum);
    }




}
