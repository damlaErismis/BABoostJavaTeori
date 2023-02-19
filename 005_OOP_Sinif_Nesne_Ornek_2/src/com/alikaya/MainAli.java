package com.alikaya;

public class MainAli {

	public static void main(String[] args) {
		
		Paralelkenar paralelKenar1 = new Paralelkenar();
		paralelKenar1.kenarKisa =10;
		paralelKenar1.kenarUzun =10;
		// paralelKenar1.isim = "benim paralelkenarım"; ==> erişilemez çünkü isim değişkeni private.
		
		// paralelKenar1.getIsim(); ==> erişilemez çünkü isim değişkeni private tanımlanmış.
		Ucgen ucgen1 = new Ucgen();
		ucgen1.kenar1 =10;
		ucgen1.kenar2 =15;
		ucgen1.kenar3 =20;
		
		System.out.println("Ucgenin cevresi: "+ucgen1.ucgenCevresi());
		
		Ucgen ucgen2 = new Ucgen();
		ucgen2.kenar1 = 30;
		ucgen2.kenar2 = 40;
		ucgen2.kenar3 = 50;
		System.out.println("üçgenin çevresi: " + ucgen2.ucgenCevresi());
		
		System.out.println("üçgen1 kenarlar => kenar1 : " + ucgen1.kenar1 + " kenar2: " +ucgen1.kenar2 +" kenar3: "+ ucgen1.kenar3 );
		ucgen1.kenarlariUzat(10); //üçgen1 in bütün kenarlarını 10ar cm uzattı.
		System.out.println("üçgen1 kenarlar => kenar1 : " + ucgen1.kenar1 + " kenar2: " +ucgen1.kenar2 +" kenar3: "+ ucgen1.kenar3 );

		
		Daire daire = new Daire();
		daire.yaricap = 10;  //ali daire class'ına erişebildi, çünkü aynı pakette.
		
		// daire.cap = 20; => cap private old için buradan erişilemez. 
		daire.xx =4; // => erişebildi çünkü xx değişkeni protected ve aynı paketten ulaşılabilri.
	}

}
