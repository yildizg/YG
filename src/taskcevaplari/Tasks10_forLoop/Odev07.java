package taskcevaplari.Tasks10_forLoop;

public class  Odev07 {


    public static void main(String[]args){

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *

     */
//        int boyut= 7;
//        for (int i = 0; i <=7 ; i++) {
//            for (int j = 0; j <=i ; j++) {
//
//        if(i==j){
//            System.out.println("*");
//        }
//        else System.out.println("!");
//        }
        int rows = 7; // Toplam satır sayısı
        int spaces = rows - 1; // Başlangıçta yazdırılacak boşluk sayısı
        int exclamation = 1; // Başlangıçta yazdırılacak ünlem sayısı

        for (int i = 0; i < rows; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Ünlemleri yazdır
            for (int k = 0; k < exclamation; k++) {
                if (k == 0 || k == exclamation - 1 || i == rows - 1) {
                    System.out.print("*");


                } else {
                    System.out.print("!");
                }


                System.out.print(" ");
            }
            }
//         */ hocadan
//        Scanner input =new Scanner(System.in);
//        System.out.println("satir gir");
//        int st=input.nextInt();
//        for (int i = 1; i <= st ; i++) {
//            System.out.print("-");
//            for (int k = st; k >= i ; k--) {//inner loop 1
//                System.out.print("/");
//            }
//            for (int m = 1; m <= i ; m++) {//inner loop 2
//                if (m==1 || m==i || i==st ){
//                    System.out.print("* ");
//                } else {
//                    System.out.print("! ");
//                }
//            }
//            System.out.println();
//        }



//            gülhandan
//            System.out.println();
//            spaces--;
//            exclamation += 2;
//            int n = 8;
//            int b = n - 1;
//
//            for (int i = 0; i < n ; i++) {
//                for (int j = 0; j < b; j++) {
//                    System.out.print(" ");
//                }
//                for ( int j = 0; j <= i ; j++) {
//                    if (j == 0 || j == i || i == n - 1) {
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("! ");
//                    }
//                }
//                b--;
//                System.out.println();



}



}
