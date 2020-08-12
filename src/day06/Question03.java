package day06;

import java.util.Scanner;

public class Question03 {
	
	public static void main (String[] args) {
		int sa=scan("Saat");
		int dk=scan("Dakika");
		System.out.println("toplam saniye= " + time(sa,dk) );
		
	}
	public static int scan (String a) {
		System.out.println(a + " giriniz: ");
		Scanner scan = new Scanner(System.in);
		int  b = scan.nextInt();
		return b;

}
	public static int time (int sa,int dk) {
		
		int sn = sa*3600 + dk*60;
		return sn;
		
		
	}
		
	
}
