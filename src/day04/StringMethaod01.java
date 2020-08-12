package day04;

import java.util.Scanner;

public class StringMethaod01 {

	public static void main(String[] args) {
	//indexOf() karakterin yerini belirler
		String str ="istanbullu";
		System.out.println(str.indexOf('u'));  // 'u' harfi 6. s�rada oldu�unu g�sterir
	
	//Last.�ndexOf arad���m�z karakterin son g�r�n�m indexini verir
		System.out.println(str.lastIndexOf('l'));
		
	//lengt() stringin uzunlu�unu verir
		Scanner scan =new Scanner(System.in);
		//System.out.println("isim soyisim giriniz");
		//String isim=scan.nextLine();
		String isim="deneme";
		System.out.println(isim.charAt(isim.length()-1)+isim.substring(1, isim.length()-1)+isim.charAt(0));
		
	//contains() String i�ersinde aranan karakter var ise true tok ise false d�ner
		System.out.println(str.contains("is"));
		System.out.println(str.contains("e"));
		
	//isEmpty i�erisinde karakter yok ise true verir
		String s1="";
			System.out.println(s1.isEmpty());
		String s2=" ";
			System.out.println(s2.isEmpty());

			//trim() string ba��nda ve sonndaki bo�luklar� siler
		String s3=" denememe  ";
			System.out.println(s3.trim());

	//startsWith()istenilen harf ile ba�lay�p ba�lamad���n� kontrol eder boolean geri d�nd�r�r
		System.out.println(str.startsWith("istan"));
			
	//endsWith() istenilen harf ile bitip bitmedi�ini kontrol eder boolean geri d�nd�r�r.
		System.out.println(str.endsWith("u"));
		
	//subString() methodu stringin belli bir k�sm�n� almam�z� sa�lar 
		
		System.out.println(str.substring(5));    //5 dahil kalan�
		System.out.println(str.substring(5, 7)); //5 dahil 7 hari�
		
	//concat() iki stringi birle�tirir
		String s4 = "unkara";
		
		System.out.println(str.concat(s4).concat(s3));
		
	//replace() Stringte istenilen karakterin ba�ka bir karakter ile de�i�tirilmesini sa�lar
		System.out.println(str.replace('i', '�')); 
		System.out.println(str.replaceFirst("u", "P"));
	
	//valueOf() rakamlar ile olu�turulan stringleri say�ya d�n��t�tr
		String s5="456456";
		String s6 = "262626";
		int a=45646;
		Integer.valueOf(s5);
		String.valueOf(a);
		
		System.out.println(s5+s6);
		System.out.println(Integer.valueOf(s5)+Integer.valueOf(s6));
		
		
		
	
		
		
		
	}

}
