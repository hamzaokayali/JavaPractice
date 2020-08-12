package day06;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		System.out.println(toplam(scan()));

	}
	
	
	public static int scan () {
		System.out.println("Sayı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int  a = scan.nextInt();
		return a;
	}
	
	
	public static int toplam (int a) {
		int sum =0;
		while(a>=0) {
			sum+=a;
			a--;
		}
			
		return sum;
	}

}
