package yg_01notes;

public class Task02 {
    public static void main(String[] args) {
          /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */
        int []arr={2, 36, 66, 55, 88, 99, 44, 55, 66, 44};
//
//        System.out.println("toplaCarp(2,36,66,55,88,99,44,55,66,44) = " +
//                toplaCarp(2, 36, 66, 55, 88, 99, 44, 55, 66, 44));
//
//        System.out.println("toplaCarp2(2, 36, 66, 55, 88, 99, 44, 55, 66, 44) = " +
//                toplaCarp2(2, 36, 66, 55, 88, 99, 44, 55, 66, 44));
//
        System.out.println("toplaCarp2(arr) = " + toplaCarp2(arr));

        System.out.println("toplaCarp(arr) = " + toplaCarp( 2,    arr));
        System.out.println("toplaCarp(arr) = " + toplaCarp( arr[0] ,    arr));//bu da olur ama ilk elemani hem toplar hem carpar


    }

    private static int toplaCarp(int carpilacakSayi, int... toplanacakSayilar) {

        int toplam=0;
        for (int w  :  toplanacakSayilar    ) {//varargs pm leri array oldugu icin loop kullanilabilir
            toplam += w;

        }
        System.out.println("sayilarin toplami varargs ile "+toplam);
        System.out.println("carpilacak sayi "+carpilacakSayi);

        return toplam*carpilacakSayi;

    }
    //advance cozum
    private static int toplaCarp2(int... toplanacakSayilar) {
        int sonuc=0;
        for (int i = 1 ; i <toplanacakSayilar.length ; i++) {
            sonuc += toplanacakSayilar[i];
        }
        sonuc *= toplanacakSayilar[0];
        System.out.println("sayilarin toplami varargs ile "+sonuc);

        return sonuc;

    }
}
