package day07;

public class Array03 {

	public static void main(String[] args) {
		
		int arr []= {20,30,40,25,-15,55};
		System.out.println(ortalama(arr));
		

	}
	public static int ortalama(int [] arr) {
		 int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		sum=sum / arr.length;
		
		
		return sum;
	}

}
