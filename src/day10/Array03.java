package day10;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] a= new int [5];
		for (int i=0;i<=4;i++) {
			System.out.println("Bir Say� giriniz");
			a[i]=scan.nextInt();			
		}
		int sy=0;
		for (int i=0;i<=4;i++) {
			if (a[i]%2==0)
				sy++;
		
		}
		
		System.out.println("Girilen Say�lardaki �ift Say�s�= " + sy);

	}

}
