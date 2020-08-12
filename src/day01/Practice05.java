package day01;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý Soyadýnýzý Giriniz");
		String isim = scan.nextLine();
		System.out.println("boy giriniz");
		int boy = scan.nextInt();
		System.out.println("kilo giriniz");
		int kilo = scan.nextInt();
		System.out.println("hobi giriniz");
		String hobi1 = scan.nextLine();
		String hobi = scan.nextLine();
		System.out.println(isim +"\n"+ boy+"\n" + kilo+"\n" + hobi);
	}

}
