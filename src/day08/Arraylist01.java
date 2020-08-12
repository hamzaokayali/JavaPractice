package day08;


import java.util.ArrayList;
import java.util.List;

public class Arraylist01 {

	public static void main(String[] args) {
		
		String [] str = {"salý","cuma","pazar","persembe","pers"} ;
		
		System.out.println(dortHarf(str));
		
		
	}
	public static List<String> dortHarf(String [] arr) {
		List <String> l1=new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()==4)
				l1.add(arr[i]);
		}
		
		return l1;
		
	}
}
