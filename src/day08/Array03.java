package day08;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		int [] arr= {12,32,34,54,45};
		Scanner scan = new Scanner(System.in); 
		System.out.println("Bir say� giriniz");
		int a = scan.nextInt();
		 		
		 boolean kon= varmi(arr,a);
		
		if (kon)
			System.out.println("arad���n�z say� vard�r");
		else 
			System.out.println("arad���n�z say� yoktur");
		
	}
	public static boolean varmi(int [] arr , int a) {
		boolean kon=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==a) {
				kon=true;
				break;
		}
			
		
	}
		return kon;

}
	}
