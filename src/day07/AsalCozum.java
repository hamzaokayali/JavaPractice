package day07;

import java.util.Scanner;

public class AsalCozum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int a = scan.nextInt();
		if (asal(a))
			System.out.println("say� asald�r");
		else
			System.out.println("say� asal de�ildir.");
		

	}
	public static boolean  asal (int a) {
		int count =0;
		
		for (int i=1;i<=a;i++) {
			if (a%1==0) {
				count++;
			}
		}
		if (count==2) 
			return true;
		else 
			return false;
		
	}

}
