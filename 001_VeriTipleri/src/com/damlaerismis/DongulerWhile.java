package com.damlaerismis;
import java.util.Scanner;
public class DongulerWhile {

	public static void main(String[] args) {
//if gibi bir koşul var en başta
//bu koşul sağlanırsa döngü döner
//****************************************************************************************************		
		
//		while (koşul) {
//			//kodlar
//		}
//****************************************************************************************************		
//for döngüsünden farkı:
//koşul içindeki kod parçasında koşulun devam edip etmemesi durumunu değiştirebilirsiniz
//****************************************************************************************************			
//		int sayi =1;
//		while(sayi<5) {
//			System.out.println(sayi);
//			sayi++;
//		}
//****************************************************************************************************		
	//döngünün devam edip etmeme durumu döngü içindeki kod metninde belirlenecekse veya değişecekse
	//while veya do while kullanın
	//yoksa döngünüz belirli sayıda dönecekse for kullanın

//****************************************************************************************************		
		//****kullanıcı sıfıra basana kadar kullanıcının girdiği sayının karesini ekrana yazan program
//		int rakam=1;
//		Scanner input = new Scanner(System.in);
//		
//		while(rakam!=0) {
//			System.out.println(rakam + " ın karesi: " + rakam*rakam);
//			rakam = input.nextInt();
//		}
		//bu daha doğru bir program:
//		int rakam =0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("lütfen bir sayı giriniz: ");
//		while((rakam=input.nextInt())!=0) {
//			System.out.println(rakam + " ın karesi: " + rakam*rakam);
//		}
//		System.err.println("çıkış");
	
//****************************************************************************************************			
	
		//do while döngüsü:
		//do-while içindeki kısım en az 1 kere mutlaka çalışır
		//daha sonra koşula göre çalışır.
		/*
		  do {
			//koldar...
		} while (condition);
		 */
		
//		int sayac =0;
//		do {
//			System.out.println(sayac);
//			sayac++;
//		} while (sayac<5);
		
		
		//****kullanıcı sıfıra basana kadar kullanıcının girdiği sayının karesini ekrana yazan program
		//yukarıdaki soruyu do while ile yapınız.
		int rakam =1;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("lütfen bir sayı giriniz");
			rakam = input.nextInt();
			System.out.println(rakam + " ın karesi: " + rakam*rakam);
			
		} while (rakam!=0);
		System.out.println("çıkış");
	}

}
