package com.damlaerismis;

import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {

		// ****kullanıcının girdiği sayının pozitif, negatif veya sıfır olduğunu bulan
		// bir
		// kod yazalım.

//		Scanner input = new Scanner(System.in);
//		System.out.println("lütfen bir tamsayı giriniz: ");
//		int x = input.nextInt();

//		if (x > 0) {
//			System.out.println("girilen sayı pozitiftir");
//		} else if (x == 0) {
//			System.out.println("girilen sayı nötrdür");
//		} else if (x < 0) {
//			System.out.println("girilen sayı negatiftir");
//		}
//		if (x > 5) {
//			System.out.println("Girdiğiniz sayı 5'ten büyüktür. ");
//		}
//
//		System.out.println("Hoşçakalın");
//*********************************************************************************************************		
		// ****Girilen bir sayının 10'un katı olup olmadığını veren program.

//		Scanner input = new Scanner(System.in);
//		System.out.println("lütfen bir tamsayı giriniz: ");
//		int x = input.nextInt();

//		if (x%10==0) {
//			System.out.println("Girdiğiniz sayı 10'a kalansız bölünür.");
//		}
////	else if (x%10!=0)
//		else {
//			System.err.println("Girdiğiniz sayı 10'a kalansız bölünmez!");
//		}

//**********************************************************************************************************		
		// *****otomobil yaşına göre vergi dilimi hesaplama
		// 0-5 : en yüksek
		// 5-10: orta vergi dilimi
		// 10 - : en düşük vergi dilimi

//		Scanner input = new Scanner(System.in);
//		System.out.println("lütfen bir tamsayı giriniz: ");
//		int x = input.nextInt();
//		if (x<0) {
//			System.out.println("Lütfen geçerli bir sayı giriniz.");
//		}
//		
//		if (x>=0 && x<=5) {
//			System.out.println("En yüksek vergi dilimindesiniz!");
//		}
//		else if (x>5 && x<=10) {
//			System.out.println("Orta vergi dilimindesiniz!");
//		}
//		else if (x>10){
//			System.out.println("En düşük vergi dilimindesiniz.");
//		}

//*****************************************************************************************************

		// *****
		// x kullanıcının girdiği işlem olsun.
		// 1: "toplama",2: "çıkarma",3: "çarpma", 4:"bölme", else : "yanlış seçim"

//		Scanner input = new Scanner(System.in);
//		System.out.println("lütfen bir tamsayı giriniz: ");
//		int x = input.nextInt();
//		
//		if(x==1) {
//			System.out.println("toplama");
//		}
//		else if (x==2) {
//			System.out.println("çıkarma");
//		}
//		else if (x==3) {
//			System.out.println("çarpma");
//		}
//		else if (x==4) {
//			System.out.println("bölme");
//		}
//		else {
//			System.out.println("yanlış seçim");
//		}

//*******************************************************************************************************
		// *****yukarıdaki problemi çözüyor.
		// switch yaz ctrl+space bas, switchcase statement seç.

//		Scanner input = new Scanner(System.in);
//		System.out.println("lütfen bir tamsayı giriniz: ");
//		int x = input.nextInt();
//		switch (x) {
//		case 1:
//			System.out.println("toplama işlemi");
//			break;
//		case 2:
//			System.out.println("çıkarma işlemi");
//			break;
//		case 3: 
//			System.out.println("çarpma işlemi");
//			break;
//		case 4: 
//			System.out.println("bölme işlemi");
//			break;
//		default:
//			System.out.println("yanlış seçim");
//			break;
//		}

//********************************************************************************************************		

		// *****kullanıcının girdiği sayıya göre ilgili mevsimi ekrana yazdırın.
		// java 14 sonrası için geçerli.
		// 8 ve 9da yok.
		// sürümü değiştirince "Multi-constant case labels supported from Java 14
		// onwards only" uyarısı verdi
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen bir tamsayı giriniz: ");
		int x = input.nextInt();
		switch (x) {
		case 12, 1, 2:
			System.out.println("kış");
			break;
		case 3, 4, 5:
			System.out.println("ilkbahar");
			break;
		case 6, 7, 8:
			System.out.println("yaz");
			break;
		case 9, 10, 11:
			System.out.println("ilkbahar");
			break;
		default:
			break;
		}
//*******************************************************************************************************
		
		
		
		
	}

}
