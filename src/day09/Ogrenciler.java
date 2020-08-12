package day09;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {
	List  <Ogrenci> ogrenciList = new ArrayList<>();

	public Ogrenciler() {
			
	}
public void ogrenciEkle(Ogrenci ogrenci) {
		
		ogrenciList.add(ogrenci);
		
		
	}
@Override
public String toString() {
	return "Ogrenciler [ogrenciList=" + ogrenciList + "]";
}

}
