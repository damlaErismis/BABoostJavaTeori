package com.damlerismis;


//SINIF : CLASS (TASARIM)
public class Anahtar {
	// Sınıf Değişken
	// static özellikler nesneye özgü değil sınıfa özgüdür (sınıfa ait ortak özellik gibi düşünülebilir)
	//sadece 1 tane tutulur her bir nesne için ayrı bir değer tutulur
	
	public static final int uzunluk = 10;

	// Özellik / üye değişken
	public String renk;
	public int no;
	public String ad;

	
	//static üye metod
	public static void uzunluguEkranaYaz() {
		System.out.println(Anahtar.uzunluk); //	System.out.println(uzunluk);  ==> böyle de yazılabilirdi.
		//static metodlar içinde static olmayan değişkenler kullanılamaz!!
		// System.out.println(renk);  ==> hata verir çünkü renk statik olmayan bir üye özellik/değişken...
	}
	
	//non-static (static olmayan) bir üye metod yazalım:
	public void bilgileriEkranaYaz() {
		System.out.println("no: " + no + " ad: " + ad + " renk: "+ renk);
	}
}