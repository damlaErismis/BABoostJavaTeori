package com.damlaerismis;

public class Otomobil {

	public static String ARAC_TIPI = "kara aracı";
	
	//üye özellikler
	//otomobil sınıfından türetilecek her bir nesnenin sahip olabileceği nesneye ait özellikler:
	
	public String marka;	// string nesnensi null olarak initialize edilir.
	public String model;
	public int yil;			// sayısal veri tipleri 0 olarak initialize edilir.
	public int aracKm;
	public Motor motor;	// otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişken olarak tutuyorum.
	
	
	public void aracinBilgileri() {
		System.out.println("Marka: " + marka + " model: " + model + " yıl: "+ yil + " aracın km : " + aracKm + " " + Otomobil.ARAC_TIPI);
		this.motor.motorBilgileriniYazdir(); 
		//Otomobil.ARAC_TIPI dedik çünkü bu özellik static. class'a ait bir özellik.
		//yukardakiyle aynı işi yapar:
		//System.out.println("motor hacmi: " + this.motor.motorHacmi + " saseNo: " + this.motor.saseNo + " yakıt tüketimi: " + this.motor.yakitTuketimi);
		
	}
	
	public void araciSur(int km) {
		System.out.println("araç " + km + " km yol yapıyor...");
		this.aracKm += km;		//değişkenin nesneye ait olduğunu ifade eder "this". yani üye değişkeni.
	}
	
	
	public void aracYilBilgisiDegistir(int yil) {
		this.yil = yil; // yil = yil; diyince ??? ambiguity (kafa karışıklığı). this bunu kurtarır.
	}
	
}
