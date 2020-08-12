package day06;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		
		System.out.println("Cümlenizdeki kelime sayýsý: " + kelimeSayisi(scan()));
		
		

	}
	public static String scan () {
		System.out.println("Cümlenizi giriniz: ");
		Scanner scan = new Scanner(System.in);
		String  a = scan.nextLine();
		return a;}

	
	public static int kelimeSayisi(String str) {
		int sayac=0;
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)==' ') {
				sayac++;
				
			}
		}
		sayac++;
		return sayac;
		
	}
	
}
	
