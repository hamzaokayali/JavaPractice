package day04;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz");
		int s=scan.nextInt();
		
		for (int i=1;i<=10 ; i++) {
			
			System.out.println(i*s);
			
			
		}
		
		scan.close();
	}

}
