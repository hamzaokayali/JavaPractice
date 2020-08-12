package day06;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		int sum=0;
		int a;
		do {
			a =scan();
			 if(kontrol(a)) {
				 sum+=a;
			 }
			
			
		}while(kontrol(a));
		System.out.println(sum);

	}
	
	public static int scan () {
		System.out.println("Sayý giriniz: ");
		Scanner scan = new Scanner(System.in);
		int  a = scan.nextInt();
		return a;
	}
	
	public static boolean kontrol (int a) {
		if (a!=0) {
			return true;
		}
		
		return false;
		
	}
	
		
}
