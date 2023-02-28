package com.damlaerismis;

import java.util.HashMap;

public class MainOsymOrnek {

	public static void main(String[] args) {

		Ogrenci ogrenci1 = new Ogrenci("Ali", "Kaya", 87, 75, 83);
		Ogrenci ogrenci2 = new Ogrenci("Damla", "Erişmiş", 98, 60, 75);
		Ogrenci ogrenci3 = new Ogrenci("Hasan", "Can", 15, 68, 42);
		Ogrenci ogrenci4 = new Ogrenci("İlber", "Ortaylı", 100, 100, 100);
		
		// key : Integer (TC kimlik no) --> value: Ogrenci sınıfından oluşturulan nesneler
		HashMap<Integer, Ogrenci> hashMap = new HashMap<Integer, Ogrenci>();
		hashMap.put(1145557, ogrenci1);
		hashMap.put(2222222, ogrenci2);
		hashMap.put(1234567, ogrenci3);
		hashMap.put(7654321, ogrenci4);
		
		
		// Sorgu yazıyoruz:
		//
		// 1145557 TC nolu öğrencinin notlarını yazalım:
		Ogrenci sonuc = hashMap.get(1145557);
		System.out.println(sonuc);
		
		sonuc = hashMap.get(7654321);
		System.out.println(sonuc);
	}

}
