package day06;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		int say = scan();
		basamakSayisi(say);

	}
	public static int scan () {
		System.out.println("Sayý giriniz: ");
		Scanner scan = new Scanner(System.in);
		int  a = scan.nextInt();
		return a;
	}
	public static void basamakSayisi(int a) {
		int b=0;
		while (a>0) {
			int temp = a%10; 	
			b=b+temp;
			a/=10;	
				
			}
		
		System.out.println("Basamaklar toplamý " + b);
		
	}

}
