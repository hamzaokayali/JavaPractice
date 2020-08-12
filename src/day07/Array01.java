package day07;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		String arr[] = {"clever","meek","nice"};
		System.out.print(Arrays.toString(arr));
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
		for (String w: arr) {
			System.out.print(w + " ");
			
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i].concat("ly");
			//System.out.println(arr[i].concat("ly"));
		}
		
		for (String w: arr) {
			System.out.print(w + " ");
		

	}

}
}
