package com.damlaerismis;

import java.util.Scanner;

public class Diziler {

	public static void main(String[] args) {
		
		
		// tam sayı dizisi: => {1, 7, 12, 39, 55, 88, 91}
		// metin dizisi: => {"ali", "veli", "ayşe", "ahmet"}
		
		// dizi tanımlama: 
		//dizinin cinsi önce yazılır byte, code, short, int, long,... vs. sonra da []
		
		long[] dizi1;
		// Kural: Dizileri initialize etmeden onları kullanamazsınız.
		dizi1 = new long[7]; // Siz bu satırı yazdığınız anda Java arka planda şöyle bir şey oluşturuyor:
							 // { 0, 0, 0, 0, 0, 0, 0 }
		
		System.out.println(dizi1[0]); // UNUTMAYALIM: dizilerin ilk elemanının indeksi sıfırdır.
		System.out.println(dizi1[dizi1.length-1]);
		System.out.println(dizi1.length);
		
		// Dikkat:
		// Dizinin boyutlarını aşan indekslere erişmeye çalışırsanız hata alırsınız, mesela:
		//System.out.println(dizi1[7]); => hata verir çünkü 7 son indeksten büyük.
		
		//Dizilere atama yapmak:
		dizi1[0]=10;
		dizi1[1]=15;
		dizi1[6]=28;   // {10, 15, 0, 0, 0, 0, 28}
		System.out.println(dizi1[1]);
		System.out.println("\n\n");
		
		//dizilerin değerleri okunurken genelde for loop kullanılır.
		for (int i =0;i<7;i++) {
			System.out.println(dizi1[i]);
		}
		
		// yukarıdaki yöntem yerine son değer olarak lengthini kullanın.
		for (int i =0;i<dizi1.length;i++) {
			System.out.println(dizi1[i]);
		}
		
		System.out.println("\n\n");
		//dizi tanımlama 2. yöntem:
		int[] myArray = {1,5,9,24,112};
		System.out.println(myArray[2]);
	
		// dizi tanımlama 3. yöntem:
		int[] arrayInt = new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arrayInt.length;i++) {
			System.out.println(arrayInt[i]);
		}
		
		//soru: 
		//
		int[] myArray1 = {1,5,9,24,112};
		int[] myArray2 = {10,50,90,240,1120};
		myArray1 = myArray2;
		myArray1[0]=999;
		System.out.println(myArray2[0]);
		
		
		//Dizi tanımlama string
		//
		String[] arrayString = new String[] {"ali", "veli", "ayşe", "ahmet"};
		for (int i=0;i<arrayString.length;i++) {
			System.out.println(arrayString[i]);
		}
		
		//böyle de tanımlayabiliriz:
		String[] dizi2 = new String[3];
		dizi2[0]= "papatya";
		dizi2[1]= "gül";
		dizi2[2]= "lale";
		//	dizi2[2]= "orkide"; => hatalı olur
		
		for (int i=0;i<dizi2.length;i++) {
			System.out.println(dizi2[i]);
		}
		
		
		//null konusu:
		//
		String isim;
		// System.out.println(isim); => isim değişkenine initialize atama yapmazsam IDE kırmızıya boyayıp hata veriyor!
				
	
		//örnek:
		String[] dizi3 = new String[3]; // => {null, null, null}
		dizi3[0] ="ali";
		for(int i=0; i<dizi3.length;i++) {
			System.out.println(dizi3[i]);
		}

		//örnek: (runtime(programın çalışma esnasında) sırasında dizi oluşturma)
		//kullanıcıdan bir tam sayı alalım, girilen sayı dizinin boyutu olsun.
		//bu dizinin içeriğini de yine kullanıcı console'dan girerek oluştursun.
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen dizinin boyutunu giriniz: ");
		int diziBoy = scanner.nextInt();
		int[] diziOrnek = new int[diziBoy];
		for (int i =0; i<diziBoy;i++) {
			System.out.println("lütfen dizinin " +i+ ". elemanını giriniz: ");
			diziOrnek[i] = scanner.nextInt();
		}
		//şimdi oluşan diziyi ekrana yazdıralım:
		for(int i=0; i< diziOrnek.length;i++) {
			System.out.println(diziOrnek[i]);
		}
	
		
		
	}

}
