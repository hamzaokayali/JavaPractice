package day04;

import java.util.Scanner;

public class StringMethaod01 {

	public static void main(String[] args) {
	//indexOf() karakterin yerini belirler
		String str ="istanbullu";
		System.out.println(str.indexOf('u'));  // 'u' harfi 6. sýrada olduðunu gösterir
	
	//Last.ÝndexOf aradýðýmýz karakterin son görünüm indexini verir
		System.out.println(str.lastIndexOf('l'));
		
	//lengt() stringin uzunluðunu verir
		Scanner scan =new Scanner(System.in);
		//System.out.println("isim soyisim giriniz");
		//String isim=scan.nextLine();
		String isim="deneme";
		System.out.println(isim.charAt(isim.length()-1)+isim.substring(1, isim.length()-1)+isim.charAt(0));
		
	//contains() String içersinde aranan karakter var ise true tok ise false döner
		System.out.println(str.contains("is"));
		System.out.println(str.contains("e"));
		
	//isEmpty içerisinde karakter yok ise true verir
		String s1="";
			System.out.println(s1.isEmpty());
		String s2=" ";
			System.out.println(s2.isEmpty());

			//trim() string baþýnda ve sonndaki boþluklarý siler
		String s3=" denememe  ";
			System.out.println(s3.trim());

	//startsWith()istenilen harf ile baþlayýp baþlamadýðýný kontrol eder boolean geri döndürür
		System.out.println(str.startsWith("istan"));
			
	//endsWith() istenilen harf ile bitip bitmediðini kontrol eder boolean geri döndürür.
		System.out.println(str.endsWith("u"));
		
	//subString() methodu stringin belli bir kýsmýný almamýzý saðlar 
		
		System.out.println(str.substring(5));    //5 dahil kalaný
		System.out.println(str.substring(5, 7)); //5 dahil 7 hariç
		
	//concat() iki stringi birleþtirir
		String s4 = "unkara";
		
		System.out.println(str.concat(s4).concat(s3));
		
	//replace() Stringte istenilen karakterin baþka bir karakter ile deðiþtirilmesini saðlar
		System.out.println(str.replace('i', 'Ý')); 
		System.out.println(str.replaceFirst("u", "P"));
	
	//valueOf() rakamlar ile oluþturulan stringleri sayýya dönüþtütr
		String s5="456456";
		String s6 = "262626";
		int a=45646;
		Integer.valueOf(s5);
		String.valueOf(a);
		
		System.out.println(s5+s6);
		System.out.println(Integer.valueOf(s5)+Integer.valueOf(s6));
		
		
		
	
		
		
		
	}

}
