package tekrarr;

public class ElemanKare {/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

    public static void main(String[] args) {
      int []arr=  {2,6,4,5,8,9};

        for (int i:arr) {
            System.out.print( (i*i+" "));

        }
    }
}
