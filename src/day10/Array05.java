package day10;

import java.util.Scanner;
//"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos",
//"eylul", "ekim", "kasim", "aralik"
//"bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"
//"on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"
//"yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"
//"bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"

public class Array05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("gg.aa.yyyy formatýnda bir tarih giriniz");
		String tarih = scan.next();
		
		int gon = new Integer (tarih.substring(0,1));
		int gbir = new Integer (tarih.substring(1,2));
		int ay = new Integer (tarih.substring(3,5));
		int ybin = new Integer (tarih.substring(6,7));
		int yyuz = new Integer (tarih.substring(7,8));
		int yon = new Integer (tarih.substring(8,9));
		int ybir = new Integer (tarih.substring(9,10));
		
		String birler[] =  {"","bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
		String onlar[] = {"","on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"};
		String yuzler [] = {"","yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"};
		String binler [] = {"","bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"};
		String aylar [] = {"","ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"};
		
		System.out.println("Girilen Tarih Yazý Ýle Yazýmý : "+onlar[gon]+birler[gbir]+" "+aylar[ay]+" "+binler[ybin]+yuzler[yyuz]+onlar[yon]+birler[ybir]);

	}

}
