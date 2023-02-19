package com.damlerismis;

public class Main {

	public static void main(String[] args) {

		// ilk anahtar nesnemizi oluşturuyoruz.
		Anahtar anahtar1 = new Anahtar();
		anahtar1.renk = "Mavi";
		anahtar1.ad = "Benim anahtarım";
		anahtar1.no = 10;

		System.out.println("ad: " + anahtar1.ad + " renk: " + anahtar1.renk + " no: " + anahtar1.no + " uzunluk: "
				+ anahtar1.uzunluk);

		// 2. bir anahtar nesnesi oluşturalım
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk = "Kırmızı";
		anahtar2.ad = "Kardeşimin anahtarı";
		anahtar2.no = 12;
		System.out.println("ad: " + anahtar2.ad + " renk: " + anahtar2.renk + " no: " + anahtar2.no + " uzunluk: "
				+ anahtar2.uzunluk);

		// 3. bir anahtar nesnesi oluşturalım
		Anahtar anahtar3 = new Anahtar();
		anahtar3.renk = "Yeşil";
		anahtar3.ad = "Deponun anahtarı";
		anahtar3.no = 15;
		System.out.println("ad: " + anahtar3.ad + " renk: " + anahtar3.renk + " no: " + anahtar3.no + " uzunluk: "
				+ anahtar3.uzunluk);

		anahtar2.renk = "Sarı";
		System.out.println("ad: " + anahtar2.ad + " renk: " + anahtar2.renk + " no: " + anahtar2.no + " uzunluk: "
				+ anahtar2.uzunluk);
		
		//static bir metodu kullanırken sınıf adı.metodadı yazılır
		Anahtar.uzunluguEkranaYaz();
		
		//non-static bir metod kullanırken nesneadı.metodadı yazılır
		anahtar1.bilgileriEkranaYaz();
		anahtar2.bilgileriEkranaYaz();
		
		//peki şöyle yazılabilir mi ?
		//Anahtar.bilgileriEkranaYaz(); ==> hata verir, çünkü bilgileriEkranaYaz metodu static olmadığı için sınıf adı ile çağırılamaz
		//nesne adıyla çağrılabilir.
		
		//nesnelerden oluşan diziler
		//
		int[] sayilarDizisi = {2,5,9,12};
		System.out.println(sayilarDizisi[0]);
		for (int i =0;i<sayilarDizisi.length;i++) {
			System.out.println(sayilarDizisi[i]);
		}
		
		Anahtar[] anahtarDizisi = {anahtar1, anahtar2, anahtar3};
		for (int i=0;i<anahtarDizisi.length;i++) {
			System.out.println(anahtarDizisi[i].ad + " " + anahtarDizisi[i].no + " " + anahtarDizisi[i].renk);
		}
		//yukardaki satırı metod kullanarak daha kolay yazabiliriz:
		
		for (int i=0;i<anahtarDizisi.length;i++) {
			anahtarDizisi[i].bilgileriEkranaYaz();
		}
		
		//yukardakileri for eachle yazdıralım
		for(Anahtar anahtar : anahtarDizisi) {
			anahtar.bilgileriEkranaYaz();
		}
	}

}
