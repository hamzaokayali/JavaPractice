package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kaç tane sayý girmek istersiniz; ");
		int adet=scan.nextInt();
		System.out.println(Arrays.toString(arraySýrala(arrayScan(adet))));
		
	}
	public static int [] arrayScan(int a) {
		
		Scanner scan=new Scanner(System.in);
		
		int [] arr = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println(i+1+" sayýyý giriniz;");
		arr[i]=scan.nextInt();	
			
		}
		return arr;
		
	}
	
	public static int [] arraySýrala(int [] arr) {
		
		Arrays.sort(arr);
		
	return arr;	
	}

}
