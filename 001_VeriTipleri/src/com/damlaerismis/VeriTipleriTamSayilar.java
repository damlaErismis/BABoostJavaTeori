package com.damlaerismis;

public class VeriTipleriTamSayilar { // PascalCasing: MainProgram, MuhasebeProgrami, KomutaKontrolSistemi, ...

	public static void main(String[] args) {

		System.out.println("Hello Java 1");
		System.out.print("Hello Java 2");
		System.out.println("Hello Java 3");

		System.out.println("Hello" + " Java");

		// Değişken tanımlama ilkel (primitive) veri tipleri
		byte byteValue = 0; // 1 Byte local değişken
		// camelCasing Ör: networkUdpPort, maxTamSayı, maxSayi
		byteValue = 3;
		System.out.println(byteValue); // Bir local değişkenin ilk değer ataması olmaksızın ekrana yazdırılmaz.

		byte maxURLSayisi = 100; // camelCasing'e uygun.

		byte ogrenciSayisi; // Dogru
		// Yanlis Tanimlamalar
		// byte ogrenci Sayisi;
		// byte *ogrenciSayisi;
		// byte öğrenciSayisi;
		// byte 1ogrenciSayisi; ogrenciSayisi1; => Dogru
		byteValue = 1;
		System.out.println(byteValue);

		// 11111111 00000000
		// ^: Sign bit
		// En soldaki bit, sign biti olarak görev yapar.
		// 0 ise pozitif sayı. Ör: 00000001: 1, 00000011: 3, 01111111:127
		// 100000000 : -128, 100000000: -128+10-127, 10000010:-126, 11111111: -1
		// Byte'ın alabileceği değerlerin aralığı : -128 ile 127

		byteValue = 127;

		// SHORT : 2 Byte 10000000 00000000 = -2^15
		// -2^15 ile 2^15-1
		// -32,768 ile 32,767

		short shortValue = 22;
		short Val1 = 30, shortValue2 = 244, shortValue3 = 55;

		// Büyük ilkel veritip = küçük ilkel veritipi diyebiliriz, ancak tersini
		// yapamayız.
		shortValue = byteValue;

		// byteValue = shortValue; => Direkt olarak bu şekilde atama yapamayız, casting
		// gerekiyor...

		byteValue = (byte) shortValue; // (byte) : casting işlemi
		System.out.println("bytevalue=" + byteValue);

		// peki shortvalue 127'den büyük olsaydı ne olurdu?
		shortValue = 129; // 0000 0000 1000 0001 =129 Ama byte için 1000 0001 =-127 anlamı ifade eder.
							// Yanlış işlem yapmış oluruz.
							// dolayısıyla byte'ın alabileceği max değerler dışında kullanmayın.
							// aşağıdaki veri tiplerinden hangisinin ataması hata verir diye soru gelir.
		byteValue = (byte) shortValue;
		System.out.println(byteValue);

		// int : 4 byte
		// -2^31 = -2147483648 ile 2^31-1 = 2147483647 arasında değer alır.
		System.out.println(Integer.MIN_VALUE); // integer : wrapper class'lar
		System.out.println(Integer.MAX_VALUE);
		int intValue = 7;
		int i1, i2, i3;
		i1 = 0;
		i2 = 5;

		intValue = shortValue;
		// shortValue= intValue; yanlış, hata verir.

		// Byte Toplama
		byte b2;
		// b2 = byteValue + byteValue; hata verir neden?
		// çünkü java byteValue + byteValue sonucunu int'e atar.
		b2 = (byte) (byteValue + byteValue);
		System.out.println(b2);

		// aşağıdaki işlemlerin hangisi hatalıdır? sınavda gelir.

		short sh1 = 3;
		short sh2 = 2;
		short sh3;
		// sh3 = sh1 + sh2; //=> hata alırsınız, casting lazım. casting işlemi yaparken
		// de java inisiyatifi bize bırakır.
		// değerleri bizim kontrol etmemiz lazım. Toplam değerin short aralığını
		// geçmemesi lazım.

		sh3 = (short) (sh1 + sh2); // int'e kadar bu tarz ahatalar alırsınız. int'ten itibaren bu tarz hatalar
									// almazsınız.
		System.out.println("sh3:" + sh3);

		int x1 = 33;
		int x2 = 44;
		int x3;
		x3 = x1 + x2;
		System.out.println("x3:" + x3);

		// LONG : 8 Byte
		// -2^63 ile 2^63-1 arasında değer alır.
		System.out.println("\n\nmax long degeri:" + Long.MAX_VALUE);
		System.out.println("\nmin long degeri:" + Long.MIN_VALUE);
		long longValue = 7;
		System.out.println(longValue);

		// long longValue = 9223372036854775807; // java eşitliğin sağ tarafını hep int
		// olarak atıyor.
		// o yüzden "out of range" hatası verdi.
		longValue = 9223372036854775807L; // sayının yanına "L" koyunca hata gitti.

		System.out.println(longValue);

		// şu tarz hatalar da olabilir:

		// long mytimer = 372036854775807 * 2; => hatalı
		// hatayı düzeltmek için L ekleyin
		long mytimer = 372036854775807L * 2;

		// şu tip hatalar da olabilir:
		int carpan = 100000;
		long carpim = carpan * carpan;
		System.out.println("carpim= " + carpim); // 1410065408 sonucunu verdi. yanlış sonuç. neden?
													// Sağ taraftaki int sorunu burada da yaşandı.
		// çözüm:
		// çarpılan sayıların ilkine long tipinde bir sayı eklenirse sağ taraf long
		// olur:
		carpim = 1L * carpan * carpan;
		System.out.println("carpim: " + carpim);

		// long altçizgi kullanımı
		long x = 123_234_221L; // okumayı kolaylaştırmak için altçizgi kullanabiliriz.
		System.out.println("x: " + x);

	}

}
