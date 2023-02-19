package com.damlaerismis;

import com.alikaya.Paralelkenar;
import com.alikaya.Ucgen;

public class Main {

	public static void main(String[] args) {
		
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 7;
		dikdortgen1.uzunKenar = 10;
		
		Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar = 8;
		dikdortgen2.uzunKenar = 15;

		System.out.println("dikdortgen1 nesnesinin alanı: " + dikdortgen1.alanHesapla());
		System.out.println("dikdortgen2 nesnesinin alanı: " + dikdortgen2.alanHesapla());

		dikdortgen2.uzunKenar = 20;  // nesnenin güncel bilgisine göre hesaplar artık.
		System.out.println("dikdortgen2 nesnesinin alanı: " + dikdortgen2.alanHesapla());
		
		Kare kare1 = new Kare();
		kare1.kenar =10;
		System.out.println("kare1 alanı: " + kare1.alanHesapla());
		
		Kare kare2 = new Kare();
		kare2.kenar =20;
		System.out.println("kare2 alan: " + kare2.alanHesapla());
		
		//Ali'nin paralelkenar sınıfını kullanabilir miyim istediğim gbii?
		Paralelkenar paralelKenar1 = new Paralelkenar();
		// paralelKenar1.kenarKisa =30; ==> ali bunlara public demediği için hata verir. otomatik protected olur.
		// paralelKenar1.kenarUzun =30; ==> ali bunlara public demediği için hata verir. otomatik protected olur.
		// paralelKenar1.isim; ==> erişilemez.
		
		
		Ucgen ikizKenarUcgen = new Ucgen();
		ikizKenarUcgen.kenar1 =10;
		ikizKenarUcgen.kenar2 =10;
		ikizKenarUcgen.kenar3 =20;
		
		System.out.println("ikizkenar Ucgenin cevresi: "+ikizKenarUcgen.ucgenCevresi());
		
		//Daire
		//Daire daire = new Daire(); ==> Daire sınıfı başka bir pakette ve protected (package specific) old için 
										//buradan erişilemez.
		
	}

}
