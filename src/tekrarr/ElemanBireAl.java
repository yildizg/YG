package tekrarr;

public class ElemanBireAl {
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        // son elemanı birinci konuma taşı
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            System.out.println(arr[i]);
        }
        arr[0] = temp;

        // kaydırılmış array'i yazdır
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//todo anlamadim
}
