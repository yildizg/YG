package taskcevaplari.Tasks10_forLoop;

public class Odev04 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


        //  chat gpt

        int satirSayisi = 5;

        // İki boyutlu dizi oluştur ve sıfırlarla doldur
        int[][] matris = new int[satirSayisi][satirSayisi];
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j <= i; j++) {
                matris[i][j] = 0;
            }
        }

        // Her satırın başlangıcındaki sayıyı hesapla
        for (int i = 0; i < satirSayisi; i++) {
            int sayi = i + 1;
            matris[i][0] = sayi;

            for (int j = 1; j <= i; j++) {
                sayi += satirSayisi - j;
                matris[i][j] = sayi;
            }
        }

        // Matrisi ekrana yazdır
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }


        int number=1;
        for  (int i = 1; i <6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print( number+ " ");
                number++;
            }
            System.out.println();

        }




//        int rows = 5;
//        int number = 1;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }










//        for (int i = 0; i < 4 ; i++) {
//            for (int j = 0; j <= i ; j++) {//j <= i neden yapiyoruz cunku cikan sekil dik ucgen oluyor
//                System.out.print( (char) (harf+j)+" " );//burada ascii degerlerinden faydalanip char a casting yapip karakterlere cevirdik
//
//                // System.out.print(  (harf+j)+" " );// bu sekilde olursa sadece ascii degerlerini yazar
//
//            }
//            System.out.println();
        }

    }





