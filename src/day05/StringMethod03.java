package day05;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		String mail = scan();
		if(getEmailDogrulama(mail)) {
			System.out.println("Baþarýlý giriþ");
		};
		
		

	}
	public static String scan () {
		System.out.println("E-mail adresini giriniz: ");
		Scanner scan = new Scanner(System.in);
		String  a = scan.nextLine();
		return a;}
	public static boolean getEmailDogrulama (String email) {
		
		if (email.length()<=5) {
			System.out.println("Hatalý Email 1");
			
		}else if (!email.contains("@")) {
			System.out.println("Hatalý Email 2");
		}else if (!email.contains(".")) {
			System.out.println("Hatalý Email 3");
			
		}else if (email.indexOf('.')-email.indexOf('@')<3) {
			System.out.println("Hatalý Email 4");
		}else if (email.contains(" ")) {
			System.out.println("Hatalý Email 5");
		}else if (email.indexOf('@')<3) {
			System.out.println("Hatalý Email 6");
		}
		else {
		return true;}
		return false;
		
		
	}

}
