package day07;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in); 
		String arr[]= {"ta�","ka��t","makas"};
		int kul=0 , bil=0;
		for (int i=1;i<=9;i++) {
		System.out.println(" 0 : Ta� \n 1 : Ka��t \n 2 : Makas\n bir se�im yap�n�z ");
		int o1=scan.nextInt();
		int o2=new Random().nextInt(3);
		System.out.println();
		
		if (oyun(arr[o1],arr[o2])==1) {
			System.out.println("Kazand�n�z");
			kul++;	}
		else if (oyun(arr[o1],arr[o2])==2) {
			System.out.println("Bilgisayar Kazand�");
			bil++;	}
		else 
			System.out.println("Berabere");
		
		if(bil>3 || kul>3)
			break;
		  
		}
		System.out.flush();
		if (bil>kul)
			  System.out.println(bil+"-"+kul+"Kaybettiniz");
		  else 
			  System.out.println(kul+"-"+bil+"Kazand�n�z");

	}
	public static int oyun( String a , String b) {
		if (a.equals(b)) {
			return 0;
		}
		else if(a.equals("ta�")) {
			if(b.equals("makas")) {
				return 1;
			}else if (b.equals("ka��t")) {
				return 2;
			}
		}else if(a.equals("makas")) {
			if(b.equals("ta�")) {
				return 2;
			}else if (b.equals("ka��t")) {
				return 1;
			}
		}else if(a.equals("ka��t")) {
			if(b.equals("makas")) {
				return 2;
			}else if (b.equals("ta�")) {
				return 1;
			}
		}else
			
		return 0;
		return 0;
		
		
		
	}

}
