package day11;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("bir kelime giriniz");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		System.out.println("bir kelime giriniz");
		String s2 = scan.nextLine();
		
		System.out.println(isAnagram(s1,s2));
		
	}
public static boolean isAnagram(String str1,String str2) {
	int num=0;
	for (int i=0;i<str1.length();i++) {
		for (int j=0;j<str1.length();j++) {
			if(str1.charAt(i)==str2.charAt(j))
				num++;
					
		}
	}
	if (num==str1.length())
		return true;
	else 
		return false;
		
	
}
	
	
}
