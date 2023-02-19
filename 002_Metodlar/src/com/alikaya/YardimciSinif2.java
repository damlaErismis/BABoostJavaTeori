package com.alikaya;

import com.damlaerismis.Main;

public class YardimciSinif2 {

	public static void main(String[] args) {
		YardimciSinif.hello(); // aynı package'ın içinde import etmeden çağırabildik.

		com.alikaya.YardimciSinif.hello2();

		// YardimciSinif.hello3(); ==> hello3() metodu private tanımladığı için başka
		// Class'tan çağıramaz

		System.out.println(Main.randomNumber());  //çağırabildik, çünkü public. bu public static metodu başka classtan çağırdığımız için
												// classın ismini de önüne yazdık.
	}
}