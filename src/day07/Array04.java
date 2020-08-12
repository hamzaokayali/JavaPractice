package day07;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		int arr[] = {5,6,4,5,6,7,8,9,10};
   
		System.out.println(Arrays.toString(tekrarBul(arr)));
	}
	public static int [] tekrarBul(int [] arr) {
		int k =0;
		
		int arr1[] = {0,0,0,0,0,0,0,0,0} ;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					arr1[k]=arr[i];
					k++;
				}
					
			}
		}
		
		
		return arr1;
	}

}
