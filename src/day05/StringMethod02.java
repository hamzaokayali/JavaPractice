package day05;

import java.util.Scanner;

public class StringMethod02 {

	public static void main(String[] args) {
		
		String name = scan();
		String name2 = scan();
		if (name.length()%2==0) {
			System.out.println(name.substring(0,(name.length()/2)) + name2+ name.substring(name.length()/2));
			
		}
		else {
			System.out.println("eklanmiyor");
			
		}
		


	}
	public static String scan () {
		System.out.println("Ýsim giriniz: ");
		Scanner scan = new Scanner(System.in);
		String  a = scan.nextLine();
		return a.toLowerCase();
		
				
	}

}
