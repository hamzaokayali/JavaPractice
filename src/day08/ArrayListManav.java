package day08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListManav {
	static List<String> urunListesi = new ArrayList<>();
	static List<Double> fiyatlar = new ArrayList<>();
	
	public static void main(String[] args) {
		List<String> urunListesi = new ArrayList<>();
		List<Double> fiyatlar = new ArrayList<>();
		urunListesi.add("Domates - 0");
		urunListesi.add("Biber - 1");
		urunListesi.add("Erik - 2");
		urunListesi.add("Elma - 3");
		
		fiyatlar.add(2.0);
		fiyatlar.add(2.50);
		fiyatlar.add(2.30);
		fiyatlar.add(2.80);
		for (int i = 0; i < fiyatlar.size(); i++) {
			System.out.println(urunListesi.indexOf(i)+" "+fiyatlar.indexOf(i));	
		}
		
	}
	public static int urunSec() {
		System.out.println("1: Elma \n2: Armut ");
		
		
		return 0;
		
	}

}
