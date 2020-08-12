package day06;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {

		String str = scan();
		char  chr = scanchr();
		System.out.println(chr + " harfi "+ tekrarSayisi(str,chr) +" tane vardýr.");
		
	}
	public static String scan () {
		System.out.println("Kelime giriniz: ");
		Scanner scan = new Scanner(System.in);
		String  b = scan.nextLine();
		return b;
	}
	public static char scanchr () {
		System.out.println("Karakter giriniz: ");
		Scanner scan = new Scanner(System.in);
		char  b = scan.next().charAt(0);
		return b;}
	
	public static int tekrarSayisi(String str , char chr ) {
		int sayac = 0;
		for (int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==chr) {
				sayac++;
			}
		
			
		}
		return sayac;
		
		
	}
}
