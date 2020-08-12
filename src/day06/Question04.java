package day06;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		double num1=scan("birinci");
		double num2=scan("Ýkinci");
		double num3=scan("Üçüncü");
		enBuyuk(num1,num2,num3);

	}
	public static double scan (String str) {
		System.out.println(str + " sayýyý giriniz: ");
		Scanner scan = new Scanner(System.in);
		double  a = scan.nextDouble();
		return a;
		
	}
	
	public static void enBuyuk(double a, double b, double c) {
		
		double enb=0;
		if (a<b)
			enb=b;
		else
			enb=a;
		if (enb<c)
			enb=c;
		System.out.println("En büyük sayý: " + enb);
		
		
	}

}
