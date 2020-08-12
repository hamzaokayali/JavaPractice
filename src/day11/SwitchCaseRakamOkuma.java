package day11;

import java.util.Scanner;

public class SwitchCaseRakamOkuma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3 Basamaklý bir rsayý giriniz");
		String str = scan.next();
		
	for (int i=0 ; i<str.length();i++) {
		int sayi = new Integer (str.substring(i,i+1));
		
		if (str.length()-i==2 || str.length()-i==5)
			on(sayi);
		else
			sayi(str.length()-i,sayi);
			
		
	}
		

	}

public static void sayi(int str, int say) {
	
	String str1 = null;
	switch (say) {
	case 1 : if (str==0)
				str1= "bir " ; 
			 else
				str1="" 	;
	break;
	case 2 : str1= "iki " ; break;
	case 3 : str1= "üç " ; break;
	case 4 : str1= "dört " ; break;
	case 5 : str1= "beþ " ; break;
	case 6 : str1= "altý " ; break;
	case 7 : str1= "yedi " ; break;
	case 8 : str1= "sekiz " ; break;
	case 9 : str1= "dokuz " ; break;
	
}
	if (str%3==0 )
		str1+="yüz ";
	else if (str==4)
		str1+="bin ";
	
	System.out.print( str1);
		
}
public static void on(int say) {
	String str1=null;
	
	switch (say) {
	case 1 :  str1= "on " ; break;
	case 2 : str1= "yirmi " ; break;
	case 3 : str1= "otuz " ; break;
	case 4 : str1= "kýrk " ; break;
	case 5 : str1= "elli " ; break;
	case 6 : str1= "altmýþ " ; break;
	case 7 : str1= "yetmiþ " ; break;
	case 8 : str1= "seksen " ; break;
	case 9 : str1= "doksan " ; break;
	
}
	System.out.print(str1);
	
	
	
}

	
}
