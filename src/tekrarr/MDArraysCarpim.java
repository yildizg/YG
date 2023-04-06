package tekrarr;

public class MDArraysCarpim {
    public static void main(String[] args) {
        //task-> MDarr  tum elemalarının çarpımını print eden code create edinz
        int [][] arrMD={ {1,2,3 }, { 9,8} };

        int carpim=1;
        for (int[] ints : arrMD) {
            for (int anInt : ints) {
                carpim *= anInt;

            }

        }
        System.out.println("carpim = " + carpim);



        // task->  Mdarr'deki son elemanların çarpımını print eden code create ediniz
        int carpimi=1;
        int[][] MDarr = {{1, 2, 3}, {4, 5, 6,8}, {7, 8, 9, 0,2,3,2}};
        for (int i = 0; i <MDarr.length ; i++) {
            for (int j = 0; j <MDarr[i].length ; j++) {
                carpimi*=MDarr[i][j];

            }

        }
        System.out.println("carpimi = " + carpimi);

       // todo anlamadim alttaki hocanin cozumu ustteki benim


        int carpima=1;
        int[][] MDarr1 = {{1, 2, 3}, {4, 5, 6,8}, {7, 8, 9, 0,2,3,2}};

        for (int i = 0; i < MDarr1.length; i++) {

            carpima*=   MDarr1[i][MDarr1[i].length - 1];//her dairenin son elemani al

            System.out.println("MDarr1[i][MDarr1[i].length - 1] = " + MDarr1[i][MDarr1[i].length - 1]);

        }
        System.out.println("carpima = " + carpima);

        //3 u nasil aliriz
        System.out.println("MDarr[0][2] = " + MDarr[0][2]);//3
        System.out.println("MDarr1[0][MDarr1.length-1] = " + MDarr1[0][MDarr1.length - 1]);///3


    }
}
