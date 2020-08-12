package day06;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {


		ters(scan());
		

	}
	public static String scan () {
		System.out.println("kelime giriniz: ");
		Scanner scan = new Scanner(System.in);
		String  b = scan.next();
		return b;
	}
	
	public static void ters(String a) {
		
		for (int i=0;i<=a.length()-1;i++) {
			
			System.out.println(a.charAt(i));
			
			
		}
		
		
	}
}
