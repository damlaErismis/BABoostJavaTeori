package com.damlaerismis;

public class VeriTipleriKarakter {

	public static void main(String[] args) {
		
		//char veritipi:
		//1 byte yer kaplar.
		char charValue='A'; //ascıı tablosundaki karşılığı 65 sayısı.
		System.out.println(charValue);
//*******************************************************************************************************		
		//soru:
		char charValue2 = 65; //karakterin ondalık değerini yazdığımızda da A yı yazdı.
		System.out.println(charValue2);
		
		
		//soru:
		char charValue3 = 84; //karakterin ondalık değerini yazdığımızda da T yı yazdı
		System.out.println(charValue3);
//********************************************************************************************************
		
		//string veritipi: 
		//ekrana bir şey yazdırmak için syso("damla erismis") yapıyoruz.
		//metinleri de sayı gibi değişken olarak tutabilmek için string atıyoruz.
		//teorik olarak 2,147,483,647 karakter tutabilir.
		
		String name = "Ali";
		String surname = "Kaya";
		System.out.println(name + " " + surname);
		String nameSurname = name + " " + surname; //==> böyle de yazabiliriz.
		System.out.println(nameSurname);
		
	}

}
