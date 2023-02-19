package com.damlaerismis;

public class SUV {
	
	
	public String marka;	// string nesnensi null olarak initialize edilir.
	public String model;
	public int yil;			// sayısal veri tipleri 0 olarak initialize edilir.
	public int aracKm;
	public String cekisSistemi;
	public Motor motor;	// otomobil sınıfının içinde farklı bir sınıfın nesnesini üye değişken olarak tutuyorum.
	
	public void aracinBilgileri() {
		System.out.println("Marka: " + this.marka + " model: " + this.model + " yıl: "+ this.yil + " aracın km : " + this.aracKm + " çekiş sistemi: " + this.cekisSistemi);
		this.motor.motorBilgileriniYazdir(); 
	}
	
}
