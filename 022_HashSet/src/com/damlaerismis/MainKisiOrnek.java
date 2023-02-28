package com.damlaerismis;

import java.util.HashSet;

public class MainKisiOrnek {

	public static void main(String[] args) {

		Kisi k1 = new Kisi(1, "Ali");
		Kisi k2 = new Kisi(2, "Veli");
		Kisi k3 = new Kisi(3, "Çağrı");
		
		HashSet<Kisi> hashSetKisi = new HashSet<Kisi>();
		hashSetKisi.add(k1);
		hashSetKisi.add(k2);
		hashSetKisi.add(k3);
		
		for(Kisi k : hashSetKisi) {
			System.out.println(k);
		}
		
		//Ali'yi tekrar ekleyip yazdırmaya çalışalım:
		// Ekleyemez!!
		System.out.println("\n * * * * \n");
		Kisi k4 = new Kisi(1, "Ali");
		hashSetKisi.add(k4);
		
		for(Kisi k : hashSetKisi) {
			System.out.println(k);
		}
		
		// contain test:
		Kisi k5 = new Kisi(3, "Çağrı"); //id ve ad aynı kalmadığı sürece false der. id'yi 5 yap false der.
		System.out.println(hashSetKisi.contains(k5));
		
	}

}
