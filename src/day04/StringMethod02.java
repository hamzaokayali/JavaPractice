package day04;

import java.util.Scanner;

public class StringMethod02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		String k = scan.next();
		int a =k.length()-1;
		
		
	
		for (int i=0;i <=a;i++) {
			System.out.print(k.charAt(a-i));
			}
	
	} 

	}
