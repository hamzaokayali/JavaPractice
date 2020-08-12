package day10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array04 {

	public static void main(String[] args) {
		/*      "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
        "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
        "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
        "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
        "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
        "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
        "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
        "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
        "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
        "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
​
 */		
		Scanner scan = new Scanner(System.in);
	//	System.out.println("Bir Plaka Numarası giriniz: ");
	//	int pl =scan.nextInt();
		
		int plaka = Byte.valueOf(JOptionPane.showInputDialog("Lütfen Plaka Numarası Giriniz"));
		
		String [] il = {"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara",
		        "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis",
		        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
		        "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir",
		        "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta",
		        "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
		        "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
		        "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize",
		        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
		        "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
		        "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan",
		        "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		
		JOptionPane.showMessageDialog(null , il[plaka] );
	//	System.out.println("Girdiğiniz Plakaya Ait il :" + il[pl-1]);
		
		
		

	}

}
