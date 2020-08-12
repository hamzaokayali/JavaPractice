package day10;

import java.util.ArrayList;
import java.util.List;

public class ListToArray02 {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		lst.add("Python");
		lst.add("JAVA");
		lst.add("PHP");
		lst.add("Perl");
		lst.add("C#");
		lst.add("C++");
		System.out.println(lst.get(-1));
		
		String [] arr = new String[lst.size()];
		lst.toArray(arr);
		for (String w : arr) {
			System.out.println(w);
		}

	}

}
