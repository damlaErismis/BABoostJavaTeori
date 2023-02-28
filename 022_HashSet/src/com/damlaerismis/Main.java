package com.damlaerismis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	/* 
	 * HashSetler JAVA'da elemanlara random olarak çok hızlı bir şekilde kullanılan veri yapılarıdır.
	 * Hızlı olmasının nedeni, elemanlara erişilirken hash kodlarının kullanılmasıdır.
	 * Hash code sayesinde herhangi bir input elemanı unique olarak tanımlanabilir.
	 * ÖNEMLİ !
	 * HashSet aynı elemanı barındırmaz.
	 */
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Kuş");
		hashSet.add("Kedi");
		hashSet.add("Köpek");
		hashSet.add("Kuş"); //aynı elemandan 2 tane olamaz!

		for(String s : hashSet) {
			System.out.println(s);  // elemanları random (kendi hashlik mekanizmasına göre) sıraya koydu.
		}

		System.out.println("\n************************");
		
		// ARRAYLIST 'den farkı!!
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Kuş");
		arrayList.add("Kedi");
		arrayList.add("Kopek");
		arrayList.add("Kuş"); // aynı elemanı 2 defa yazabiliyo
		System.out.println("ArrayList: ");
		for(String s : arrayList) {
			System.out.println(s);
		}
		/*
		 * Aşağıdaki ifadeyi içinde milyonlarca kayıt olan bir ArrayLis'de yaparsak 
		 * HashSet'e göre çok daha uzun süre alabilir.
		 * HashSet'te ise çok kısa sürede aradığınız değere ulaşabilirsiniz.
		 */
		if(hashSet.contains("Kuş"))
			System.out.println("Kuş, hashSet içinde mevcut.");
		else
			System.out.println("Kuş, hashSet içinde mevcut değil.");
		
		//HashSet'ler arası fark bulma:
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("Kaplan");
		hashSet2.add("Kedi");
		hashSet2.add("Aslan");
		
		//Fark 2 adımda bulunur:
		//1. adım:
		HashSet<String> fark = new HashSet<>(hashSet2); // hashSet2 nin fark isminde bir kopyasını önce oluşturdum.
		
		//2. adım:
		fark.removeAll(hashSet); //fark isimli hashSet'den ilk hashSet'imin aynı olan elemanlarını çıkardım. Geriye farklı olanlar kaldı.
		
		System.out.println(fark);
		
		

		
		
	}

}
