package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ka� tane say� girmek istersiniz; ");
		int adet=scan.nextInt();
		System.out.println(Arrays.toString(arrayS�rala(arrayScan(adet))));
		
	}
	public static int [] arrayScan(int a) {
		
		Scanner scan=new Scanner(System.in);
		
		int [] arr = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println(i+1+" say�y� giriniz;");
		arr[i]=scan.nextInt();	
			
		}
		return arr;
		
	}
	
	public static int [] arrayS�rala(int [] arr) {
		
		Arrays.sort(arr);
		
	return arr;	
	}

}
