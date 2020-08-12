package day09;

import java.util.ArrayList;
import java.util.List;

public class Ogretmenler {
		
		List  <Ogretmen> ogretmenList = new ArrayList<>();	
	
	public Ogretmenler() {
		
	}
	public void ogretmenEkle(Ogretmen ogretmen) {
		
		ogretmenList.add(ogretmen);
		
		
	}
	@Override
	public String toString() {
		return "Ogretmenler [ogretmenList=" + ogretmenList + "]";
	}

	
}
