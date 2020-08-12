package day09;

public class Ogrenci {
		
		private String isim,no,telefon;
	public Ogrenci(String isim , String no, String telefon) {
		this.isim = isim;
		this.no = no;
		this.telefon = telefon;
		
	}
	public String getIsim() {
		return isim;
	}
	public String getNo() {
		return no;
	}
	public String getTelefon() {
		return telefon;
	}
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", no=" + no + ", telefon=" + telefon + "]";
	}

}
