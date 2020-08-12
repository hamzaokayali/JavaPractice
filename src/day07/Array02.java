package day07;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		int arr [] = {1,2,-3,4,-5,-6};
	
		System.out.println(Arrays.toString(arr));
		
		tersi(arr);
		
		System.out.println(Arrays.toString(arr));
			

	}
	public static int[] tersi(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]*-1;
		} 
		/*for (int i : arr) {
			i*=-1;
			System.out.println(i);
		}*/
		
		return arr;
		
	}

}
