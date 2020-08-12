package day09;

public class OkulSistemineGiris {

	public static void main(String[] args) {
		/*
	     * Öðretmen, öðrenci ve okul genel bilgilerinden oluþan JAVA programý yazýnýz.
	     *
	     * 1. Adým : Okulun sabit bilgilerini içerisine ekleyeceðimiz SabitBilgiler adlý bir class oluþturalým
	     *           Buradaki verileri public static final olarak tutalým.
	     *           MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	     *
	     * 2. Adým : Ogretmen adlý bir class oluþturalým.
	     *           Bu classta öðretmenin adý, branþý ve telefon numaralarýný tutalým.
	     *           String isim, brans, telefon ;
	     *
	     *           içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman öðretmenlerin bilgilerini yazdýralým
	     *
	     * 3. Adým : Ogrenci adlý bir class oluþturalým.
	     *           Bu classta ogrencinin adý, okulnumarasý bulunsun.
	     *           String isim;
	     *           int ogrenciNo;
	     *
	     *           içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman ogrencilerin bilgilerini yazdýralým
	     *
	     * 4. Adým : Ogretmenler adlý class oluþturalým.
	     *           Bu classta tüm öðretmenleri tutualým.
	     *           Ýçerisine List<Ogretmen> ogrentmenListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	     *           Bu class'ýn içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öðretmen ekleyebilelim.
	     *
	     * 5. Adým : Ogrenciler adlý class oluþturalým.
	     *           Bu classta tüm öðrenciler tutualým.
	     *           Ýçerisine List<Ogrenci> ogrenciListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	     *           Bu class'ýn içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öðrenci ekleyebilelim.
	     *
	     *
	     * */
		SabitBilgiler sb = new SabitBilgiler();
		
		System.out.println("****Okulumuza Hoþgeldiniz****" );
		System.out.println("Okul Ýsmi : " + sb.OKULISMI);
		System.out.println("Tel no : " + sb.TEL);
		System.out.println("Adres : "+ sb.Adres);
		System.out.println("Web Site :" + sb.WEBSITESI);
		System.out.println("Teknik :" + sb.TEKNÝK_DESTEK);
		System.out.println(SabitBilgiler.Adres);
		
		System.out.println("\n  öðretmen oluþturalým \n   ");
		
		Ogretmen ogretmen1 = new Ogretmen();
		ogretmen1.setIsim("Suleyman");
		ogretmen1.setBrans("Java");
		ogretmen1.setTelefon("1324567489");
				
		Ogretmen ogretmen2 = new Ogretmen("Hamza", "Selenyum" , "56465465");
		
		System.out.println(ogretmen1.toString());
		System.out.println(ogretmen2.toString());
		
		Ogrenci ogrenci1 = new Ogrenci("Ali","101","121212");
		System.out.println(ogrenci1.toString());
		
		System.out.println("\n   ogretmenler oluþturma   \n");
		
		Ogretmenler ogretmenler = new Ogretmenler();
		ogretmenler.ogretmenEkle(ogretmen1);
		ogretmenler.ogretmenEkle(ogretmen2);
		System.out.println(ogretmenler.toString());
		
		Ogrenciler ogrenciler = new Ogrenciler();
		ogrenciler.ogrenciEkle(ogrenci1);
		System.out.println(ogrenciler.toString());
		
		

	}

}
