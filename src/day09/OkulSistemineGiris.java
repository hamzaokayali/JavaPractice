package day09;

public class OkulSistemineGiris {

	public static void main(String[] args) {
		/*
	     * ��retmen, ��renci ve okul genel bilgilerinden olu�an JAVA program� yaz�n�z.
	     *
	     * 1. Ad�m : Okulun sabit bilgilerini i�erisine ekleyece�imiz SabitBilgiler adl� bir class olu�tural�m
	     *           Buradaki verileri public static final olarak tutal�m.
	     *           MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	     *
	     * 2. Ad�m : Ogretmen adl� bir class olu�tural�m.
	     *           Bu classta ��retmenin ad�, bran�� ve telefon numaralar�n� tutal�m.
	     *           String isim, brans, telefon ;
	     *
	     *           i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ��retmenlerin bilgilerini yazd�ral�m
	     *
	     * 3. Ad�m : Ogrenci adl� bir class olu�tural�m.
	     *           Bu classta ogrencinin ad�, okulnumaras� bulunsun.
	     *           String isim;
	     *           int ogrenciNo;
	     *
	     *           i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ogrencilerin bilgilerini yazd�ral�m
	     *
	     * 4. Ad�m : Ogretmenler adl� class olu�tural�m.
	     *           Bu classta t�m ��retmenleri tutual�m.
	     *           ��erisine List<Ogretmen> ogrentmenListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	     *           Bu class'�n i�ine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni ��retmen ekleyebilelim.
	     *
	     * 5. Ad�m : Ogrenciler adl� class olu�tural�m.
	     *           Bu classta t�m ��renciler tutual�m.
	     *           ��erisine List<Ogrenci> ogrenciListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	     *           Bu class'�n i�ine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni ��renci ekleyebilelim.
	     *
	     *
	     * */
		SabitBilgiler sb = new SabitBilgiler();
		
		System.out.println("****Okulumuza Ho�geldiniz****" );
		System.out.println("Okul �smi : " + sb.OKULISMI);
		System.out.println("Tel no : " + sb.TEL);
		System.out.println("Adres : "+ sb.Adres);
		System.out.println("Web Site :" + sb.WEBSITESI);
		System.out.println("Teknik :" + sb.TEKN�K_DESTEK);
		System.out.println(SabitBilgiler.Adres);
		
		System.out.println("\n  ��retmen olu�tural�m \n   ");
		
		Ogretmen ogretmen1 = new Ogretmen();
		ogretmen1.setIsim("Suleyman");
		ogretmen1.setBrans("Java");
		ogretmen1.setTelefon("1324567489");
				
		Ogretmen ogretmen2 = new Ogretmen("Hamza", "Selenyum" , "56465465");
		
		System.out.println(ogretmen1.toString());
		System.out.println(ogretmen2.toString());
		
		Ogrenci ogrenci1 = new Ogrenci("Ali","101","121212");
		System.out.println(ogrenci1.toString());
		
		System.out.println("\n   ogretmenler olu�turma   \n");
		
		Ogretmenler ogretmenler = new Ogretmenler();
		ogretmenler.ogretmenEkle(ogretmen1);
		ogretmenler.ogretmenEkle(ogretmen2);
		System.out.println(ogretmenler.toString());
		
		Ogrenciler ogrenciler = new Ogrenciler();
		ogrenciler.ogrenciEkle(ogrenci1);
		System.out.println(ogrenciler.toString());
		
		

	}

}
