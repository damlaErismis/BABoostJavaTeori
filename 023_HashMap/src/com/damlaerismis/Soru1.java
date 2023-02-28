package com.damlaerismis;

import java.util.HashMap;

//sınav sorusu
public class Soru1 {

	public static void harfSayisiniBul(String metin) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < metin.length(); i++) {
			char karakter = metin.charAt(i);
			if (hashMap.containsKey(karakter)) {
				hashMap.put(karakter, hashMap.get(karakter) + 1);
			} else
				hashMap.put(karakter, 1);
		}
		for (char karakter : hashMap.keySet()) {
			System.out.println(karakter + " : " + hashMap.get(karakter));
		}
	}

	public static void enCokTekrarEdenHarfiBul(String metin) {
		// İpucu : HashMap kullanabilirsiniz.
		// İpucu => Key : Karakter    ->     Value : Karaketrin tekrar sayısını (count) tutabilirsiniz.
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char encokTekrarEdenKarakter = 0;
		int max = 0;
		
		for (int i=0;i<metin.length();i++) 
		{
			char ch = metin.charAt(i);
			
			if (hashMap.containsKey(ch))   // Karakter hasMap'te mevcut ise bu kod bloğuna girer.
			{
				int tekrarSayisi = hashMap.get(ch)+1;
				
				if (tekrarSayisi > max) 
				{
					encokTekrarEdenKarakter = ch;
					max = tekrarSayisi;
				}
				
				hashMap.put(ch, hashMap.get(ch)+1);
			} 
			else  // Karakter hashMap'te mevcut dğeilse bu kod bloğuna girer
			{
				hashMap.put(ch, 1);				
			}
		}
		
		System.out.println(hashMap);
		System.out.println("En cok tekrar eden karakter : " + encokTekrarEdenKarakter + "  tekrar sayısı: " + max);
	}

	public static void main(String[] args) {

		// Static bir method yazın.
		// Bir string içindeki karakterlerin sayısını bulan ve ekrana yazdıran bir
		// method yazınız.

		String metin = "Hello"; // H:1 e:1 l:2 o:1
		Soru1.harfSayisiniBul(metin);

		// en çok tekrar eden harfi bulunuz ve tekrar sayısını yazdırınız.
		Soru1.enCokTekrarEdenHarfiBul(metin);
	}

}
