package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz");
		String s = scan.next();
		char [] c = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i]=s.charAt(i);
			
			
		}
		for (int i = c.length-1; i >=0 ; i--) {
			System.out.print(c[i]);
		}
		System.out.println();
		int [] numArr = {1,2,3,4,5,6,7};
		for (int i = 0; i < numArr.length/2; i++) {
			int temp= numArr[i];
			numArr[i]=numArr[numArr.length-1-i];
			numArr[numArr.length-1-i]=temp;
			
		}
		System.out.println(Arrays.toString(numArr));
 		
	}

}
