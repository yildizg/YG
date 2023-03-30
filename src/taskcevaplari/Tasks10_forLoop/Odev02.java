package taskcevaplari.Tasks10_forLoop;

public class Odev02 {

    public static void main(String[] args) {

            /*
            0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.
            */
            //Kodu aşağıya yazınız.

        int i;
        for (i=1;i<100;i++) {

            if (i % 5 == 0 && i%4 == 0 )

                System.out.print(i+" ");
        }




    }
}
