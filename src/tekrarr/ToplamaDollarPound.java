package tekrarr;

import java.util.Arrays;

public class ToplamaDollarPound {
    /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
    String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
    int toplam1=0;
    int toplam2=0;

    public static void main(String[] args) {
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        int toplamD=0;
        int toplamE=0;

        String str1[]=str.trim().split(" ");
        System.out.println(Arrays.toString(str1));
        for (String i:str1) {
          if (i.startsWith("$")){
           toplamD+=Integer.parseInt(i.substring(1));
          } else if (i.startsWith("£")) {
            toplamE+=Integer.parseInt(i.substring(1));

          }
        }

        System.out.println("toplamD = " + toplamD);
        System.out.println("toplamE = " + toplamE);

    }
}
