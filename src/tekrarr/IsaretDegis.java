package tekrarr;

public class IsaretDegis {
     /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
*/
     public static void main(String[] args) {
          int []arr={ 1,2,-3,4,-5,-6};
          for (int i = 0; i <arr.length ; i++) {
               System.out.print(arr[i]*-1 + " ");

          }

     }
}
