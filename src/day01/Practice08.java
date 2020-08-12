package day01;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		/* Kullanýcýdan 2 tane sayý alalým ve çarpma ve bölme iþlemi yaptýrýp ekrana yazdýralým
		 * 
		 * 1. Adým : Scanner class'ýndan nesne üretelim.
		 * 2. Adým : Kullanýcýdan 2 tane sayý isteyelim.
		 * 3. Adým : Aldýðýmýz sayýlarý birbiriyle çarpalým ve bölelim.
		 * 4. Adým : Bunu ekrana yazdýralým.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayý Giriniz");
		
		int say1 = scan.nextInt();
		System.out.println("Sayý giriniz");
		int say2 = scan.nextInt();
		int carpim= say1*say2;
		double bolum =  say1/say2;
		
		System.out.println("Çarpým" + carpim);
		System.out.println("bölüm" + bolum);
		scan.close();

	}

}
