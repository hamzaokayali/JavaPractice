package day05;

import java.util.Scanner;

public class StringMethod01 {

	public static void main(String[] args) {
		
		String hmail =scan();
		String gmail = hmail.replace("@hotmail", "@gmail");
		System.out.println(gmail);
		
		

	}
	public static String scan () {
		System.out.println("E-mail adresini giriniz: ");
		Scanner scan = new Scanner(System.in);
		String  a = scan.nextLine();
		return a.toLowerCase();
		
				
	}
	

}
