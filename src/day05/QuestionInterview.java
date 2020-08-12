package day05;

import java.util.Scanner;

public class QuestionInterview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bölünen Giriniz");
		int s1 =scan.nextInt();
		System.out.println("Bölen Sayýyý giriniz");
		int s2 = scan.nextInt();
		int sonuc=0;
		double sonuc2=0;
		while (s1>=s2)
		{
			s1-=s2;
			sonuc++;
			
		}
		int kalan = s1*10;
		while(kalan>=s2) {
			kalan-=s2;
			sonuc2+=0.1;
			
		}
		
		double kusurat = sonuc+sonuc2;
		System.out.println(kusurat);
	}

}
