package tekrarr;

public class Ortbuyuk {
    // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan
    // eleman sayısını print eden code creat et
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5};
        int toplam=0;
        double ort=0;
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
           toplam+= arr[i];

        }
        ort=toplam/ arr.length;
        System.out.println("toplam="+toplam);
        System.out.println("ort = " +ort);
        for (int i:arr) {
            if (i>ort)
            count++;
        }
        System.out.println("count = " + count);



        //chatgpt
//
//                int[] arr1 = {4, 5, 7, 2, 8, 9};
//                int n = arr1.length;
//
//                int sum = 0;
//                for (int i = 0; i < n; i++) {
//                    sum += arr[i];
//                }
//
//                double avg = (double) sum / n;
//                int count = 0;
//                for (int i = 0; i < n; i++) {
//                    if (arr[i] > avg) {
//                        count++;
//                    }
//                }
//
//                System.out.println("Ortalama: " + avg);
//                System.out.println("Ortalama'dan büyük olan eleman sayısı: " + count);
            }
        }

