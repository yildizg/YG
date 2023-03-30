package taskcevaplari.task10;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Carpim tablosu olusturmak icin bir sayi giriniz");
		int s = scan.nextInt();
		
		
		int i = 1;
		while(i<=10) {
			System.out.println(s + "x" + i + "=" + s*i);
			i++;
			
		}scan.close();
	}

}
