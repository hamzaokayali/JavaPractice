package day06;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		
		
		System.out.println(ters());

		

	}
	public static int scan () {
		System.out.println("Sayı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int  a = scan.nextInt();
		return a;
		
	}
	
	public static int ters() {
		int a = scan();
		int b =0;
		while (a>0) {
		int temp = a%10; 	
		b=b*10+temp;
		a/=10;	
			
		}
		return b;
		
	}

}
