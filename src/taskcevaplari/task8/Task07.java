package taskcevaplari.task8;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner input =new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String str = input.nextLine();
        System.out.println("kacinci karakteri istiyorsun");
        System.out.println("String ifadenin hangi indexini  yazdirmak istiyorsunuz");
        int index=input.nextInt();
        if (index>=0 && index< str.length()) {
            char c = str.charAt(index);
            System.out.println("girilen ifadedeki" + index + ".indeksteki karakter="+ c );

        } else {
            System.out.println("lütfen gecerli bir index girin" );
        }
    }}

