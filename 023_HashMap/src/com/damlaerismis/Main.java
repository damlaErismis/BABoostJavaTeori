package com.damlaerismis;

import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {

		
		/*
		 * HashMap'ler key-value (anahtar-değer çiftleri) olarak tutulur.
		 * Key --> Value
		 * HashMap de içindeki elemanları sıralı tutmaz (ArrayList ve LinkedList'in aksine)
		 * HashMap içindeki elemanları hashleyerek random bir sırada tutar.
		 * 
		 * HashMap'ler List'lere göre random access (rastgele erişimde) tıpkı HashSet'ler gibi hızlıdırlar.
		 */
		
		//HashMap<Key, Value>
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Opel");
		hashMap.put(20, "Audi");
		hashMap.put(30, "VW");
		hashMap.put(40, "BMW");
		hashMap.put(50, "Renault");
		System.out.println(hashMap);
		
		//aynı key'e sahip başka bir kayıt eklemeye kalkarsanız üzerine yazma yapar !
		hashMap.put(40, "Fiat");
		System.out.println("\n"+hashMap);
		
		System.out.println(hashMap.get(20));
		System.out.println(hashMap.get(40));
		System.out.println(hashMap.get(70));
		
		if(hashMap.containsKey(40)) {
			System.out.println("Mevcut.");
		}else {
			System.out.println("Mevcut değil.");
		}

		// HASHMAP İÇERİĞİNİ BASTIRMAK
		//
		//. 1 YOL:
		//HashMap'i Set'e dönüştürür ve loop ederiz.
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar: " + entry.getKey() + "  Değer: " + entry.getValue());
		}
		System.out.println();
		
		//2. yol:
		for(Integer key : hashMap.keySet()) {
			System.out.println("Key: " + key + " Value: " + hashMap.get(key));
		}
		
		if(hashMap.containsKey(20)) {
			System.out.println("Mevcut.");
		}else {
			System.out.println("Mevcut değil.");
		}
		
		//containsValue
		if(hashMap.containsValue("Renault"))
			System.out.println("renault değeri hashMap içinde mevcut");
		else
			System.out.println("renault değeri hashMap içinde mevcut değil !");

		
	}

}
