package taskcevaplari.task10;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Bir String giriniz");
			String s = scan.nextLine().toLowerCase();
			
			int harfCounter = 0;
			int rakamCounter = 0;
			int digerCounter = 0;
			int k = 0;
			do {
				if(s.length()==0) {
					System.out.println("Sana String gir dedik");
				}
				else if(s.charAt(k)>='a' && s.charAt(k)<='z' ) {
					harfCounter++;
				}
				else if(s.charAt(k)>='0' && s.charAt(k)<='9') {
					rakamCounter++;
				}else {
					digerCounter++;
				}
				
				k++;
			}while(k<s.length());
			System.out.println("Stringde " + harfCounter + " tane harf vardir");
			System.out.println("Stringde " + rakamCounter + " tane rakam vardir");
			System.out.println("Stringde " + digerCounter + " tane harf ve rakam disi karakter vardir");
			scan.close();
	}

}
