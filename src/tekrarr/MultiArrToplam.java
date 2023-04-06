package tekrarr;

public class MultiArrToplam {
    //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
    // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
    // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

    public static void main(String[] args) {


        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int sum = 0;


        for (int i = 0; i < arr1.length && i < arr2.length; i++) { // her iki dizinin boyutu kadar döngüyü sürdür
            int toplam = 0;
            for (int j = 0; j < arr1[i].length && j < arr2[i].length; j++) { // aynı index'e sahip elemanları topla
                toplam += arr1[i][j] + arr2[i][j];
            }
            System.out.println((i+1) + ". index'teki elemanların toplamı: " + toplam);
        }


        System.out.println(sum);
//        1. index'teki elemanların toplamı: 18
//        2. index'teki elemanların toplamı: 15
//        3. index'teki elemanların toplamı: 18
    }
}