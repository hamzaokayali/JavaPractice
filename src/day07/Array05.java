package day07;

public class Array05 {

	public static void main(String[] args) {
		
		int arr[] = {12,54,53,23,11};
		System.out.println(enBuyukBul(arr));
		

	}
	public static int enBuyukBul(int [] arr) {
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
