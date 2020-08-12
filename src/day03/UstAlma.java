package day03;

import java.util.Scanner;

public class UstAlma {

	public static void main(String[] args) {
		
		int s=25;
		System.out.println(4+(s--));
		
		for(int i = 1; i<=s ;i++) {
			if(s%i==0) {
				System.out.print(i +" ");
				i++;
			}


		
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ýki sayý giriniz");
		int a =scan.nextInt();
		int b = scan.nextInt();
		int üs =1;
		
		System.out.println("Sonuç "+üs);
		scan.close();
	}

}
	}
