package com.damlaerismis;
import java.util.Scanner;
public class DongulerFor {

	public static void main(String[] args) {
		
//		
//			System.out.println("merhaba 0");
//			System.out.println("merhaba 1");
//			System.out.println("merhaba 2");
//			System.out.println("merhaba 3");
			
//*********************************************************************************************************			
		//bir şeyi n kere yazdıracaksam kaç kere saydığımı kontrol edebilmek için bir değişkene ihtiyacım var.
		//o değişken de genelde for döngülerinde i veya j isminde tutulur/kullanılır. size kalmış..
		
		//for loop - for döngüsü
//		for(int i=0;i<4;i++) {
//			System.out.println("merhaba" +i);
//		}
//		System.out.println(i);    for'un codebody'sinin dışında olduğu için hata verir.
//									çünkü i değişkeni yok.
		
//*********************************************************************************************************		
//		
//		for(int i=0;i<4;i++) {
//			System.out.println("merhaba" +i);
//			System.out.println("java");
			
//*********************************************************************************************************			
//			//soru
//			for(int i=0;i<3;i++); {  //burdaki noktalı virgül yüzünden hiçbir işe yaramayan bir döngü olur.
//				System.out.println("merhaba");
//				System.out.println("dünya"); 
//			} //forun altında tek işlem yapılıyosa paranteze gerek yok. iki işlem varken
//			  //parantez yoksa, ilk işlemi döngüye sokar ama ikinci işlemi tek sefer çalıştırır.
//			  //SINAV SORUSU!!!!
		
//*********************************************************************************************************		
		
//			for (int i= 0; i<3 ;i++) 
//				System.out.println("merhaba" + i);
//			
//			System.out.println("dünya");
		
		
//*********************************************************************************************************			
//			int x=5; //x=0 olsaydı ikinciyi yazdırır sadece.iki işlemi{} arasına yazarsak sorun çözülür.
//			if(x>1)
//				System.out.println("1'den büyük");
//			System.out.println("0'dan da büyük");
	
//			int x=5;
//			if(x>1) {
//				System.out.println("1'den büyük");
//			System.out.println("0'dan da büyük");
//			}
			
//*********************************************************************************************************			
//		for (;;) {
//			System.out.println("merhaba");
//			System.out.println("dünya");  //sonsuz döngü
//		}
	
//*********************************************************************************************************
		 //for(int i =0;i<5;i++) aşağıdaki bunun aynısı
		 //aşağıdaki kod çalışır ama tavsşye edilmez.
		
//		int i = 0;
//		for (;i<5;) {
//			System.out.println("hello" + i);
//		}
	
//*********************************************************************************************************	
//		//1den 10a kadar olan sayıların toplamı(10 dahil)
//		
//		int toplam=0; //toplam değişkenini tanımladım ve initialize ettim
//		for (int i=0;i<=10;i++) {
//			toplam = toplam + i;
//		}
//		System.out.println(toplam);
		
//********************************************************************************************************		
		
//		// 1'den 10'a kadar olan tek sayıların toplamını yaz.
//		int toplam = 0;
//		for (int i=0;i<=10;i++) {
//			if(i%2!=0)
//			toplam = toplam + i;
//		}
//		System.out.println(toplam);
		
//*********************************************************************************************************
		
		//ekrana aşağıdaki şekli çizdiren döngü içeren kodu yazınız.
		//****
		//****
		//****
		
//		for (int i=1;i<=12;i++) {
//			System.out.print("* ");
//			if(i%4==0) {
//				System.out.println();
//			}
//		}

//*******************************************************************************************************
		
		//soru
		//aşağıdaki kodu çalıştırınca kaç kere test yazar
		//bu şekilde for döngüsü içinde index'i değiştirmek tavsiye edilmez.
		//eğer kod bloğu içinde index(sayacı) değiştirmeni gerken durumlar oluyorsa
		//while veya do while döngülerini kullanınız.
		
//		for(int i =0;i<11;i++) { //i<=11 olsaydı sonusz kez yazardı, bu şekilde 1 defa yazar.
//			i =10;
//			System.out.println("test");
//		}
//*****************************************************************************************************	
		//srou kullanıcıdan iki tane sayı al
		//başlangıç ve bitiş sayıları arasında 7ye bölünebilen sayıları yazdırın.
	
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("lütfen iki sayı giriniz");
		 x= scanner.nextInt();
		 y= scanner.nextInt();
		 for(int i = x; i<y; i++) {
			 if(i%7==0) {
				 System.out.println(i);
			 }
		 }
		
	}
	

}
