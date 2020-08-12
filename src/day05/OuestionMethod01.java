package day05;

import java.util.Scanner;

public class OuestionMethod01 {

	public static void main(String[] args) {
		int s1= scan();
		int s2= scan();
		scan1(s1,s2);
		
	}

	public static int scan () {
		System.out.println("Bir Sayý giriniz: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		return a;
				
	}
	public static void scan1 (int a , int b) {
		System.out.println("Bir Ýþlem giriniz: / * + -");
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		
		switch (c) {
		case '+':toplama( a , b);
				 break;	
		case '-':cýkarma( a , b);
				 break;
		case '*':carpma( a , b);
		 break;
		case '/':bolme( a , b);
		 break;
		default : System.out.println("Hatalý karakter");
		
		}
		
	}
	public static void toplama (int a , int b) {
		System.out.println(a+b);
	}
	public static void cýkarma (int a , int b) {
		System.out.println(a-b);
		
	}
	public static void carpma (int a , int b) {
		System.out.println(a*b);
		
	}
	public static void bolme (int a , int b) {
		System.out.println(a/b);
	}
	
	
   }
