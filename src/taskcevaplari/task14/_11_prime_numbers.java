package taskcevaplari.task14;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {

        int num = 20;

        int count = 0;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    count++;
                    break;
                }
        }

        System.out.print(num - count - 1);
    }
}

   /*
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;

        for (int i = 2; i < num ; i++) {

            if (asalMi(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean asalMi(int num) {

        for (int i = 2; i < num ; i++) {

            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
}

    */

