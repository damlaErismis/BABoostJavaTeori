package com.damlaerismis;

public class Main {

	public static void main(String[] args) {
		Otomobil otomobil1 = new Otomobil();
		otomobil1.marka = "Audi";
		otomobil1.model = "A3";
		otomobil1.yil = 2012;
		otomobil1.aracKm = 0 ;
		otomobil1.motor = new Motor();
		otomobil1.motor.motorHacmi =1400;
		otomobil1.motor.saseNo = "AU2321232";
		otomobil1.motor.yakitTuketimi = 7 ;
		otomobil1.aracinBilgileri();
		System.out.println();

		
		Otomobil otomobil2 = new Otomobil();
		otomobil2.marka = "Opel";
		otomobil2.model = "Astra";
		otomobil2.yil = 2017;
		otomobil2.aracKm = 5000 ;
		otomobil2.motor = new Motor();
		otomobil2.motor.motorHacmi = 1600;
		otomobil2.motor.saseNo = "OP45785";
		otomobil2.motor.yakitTuketimi = 8;
		otomobil2.aracinBilgileri();
		System.out.println();
		
		otomobil1.araciSur(100);
		otomobil1.aracinBilgileri();
		otomobil1.araciSur(200);
		otomobil1.aracinBilgileri();
		
		System.out.println();
		
		otomobil2.araciSur(500);
		otomobil2.aracinBilgileri();
		
		System.out.println();
		System.out.println();
		otomobil2.aracYilBilgisiDegistir(2018);
		otomobil2.aracinBilgileri();
		System.out.println();
		
		SUV jeep = new SUV();
		jeep.aracKm = 20000;
		jeep.marka = "JEEP";
		jeep.model = "Range Rover";
		jeep.yil = 2020;
		jeep.motor = new Motor();
		jeep.motor.motorHacmi = 2000;
		jeep.motor.yakitTuketimi = 14;
		jeep.aracinBilgileri();
		System.out.println();
		
		jeep.motor.yakitTuketimi = 15;
		jeep.aracinBilgileri();
		
		//Motor nesnesi motor sınıfından bağımsız üretmek
		Motor m1 = new Motor();
		m1.motorHacmi =1200;
		m1.saseNo = "GGY5544";
		m1.yakitTuketimi =5;
		m1.motorBilgileriniYazdir();
		System.out.println();
		
		otomobil2.motor = m1;
		otomobil2.aracinBilgileri();
		System.out.println();
		
		Otomobil temp;
		temp = otomobil2;
		temp.motor.motorHacmi = 1100;
		System.out.println(otomobil2.motor.motorHacmi);
		
		System.out.println(m1.motorHacmi);
		
		
		
		
		
	}

}
