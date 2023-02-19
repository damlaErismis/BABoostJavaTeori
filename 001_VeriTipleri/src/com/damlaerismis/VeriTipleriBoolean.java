package com.damlaerismis;

public class VeriTipleriBoolean {

	public static void main(String[] args) {
		
		//bool veritipi:
		//1 bit yer kaplar.
		//açık / kapalı, doğru/yanlış, 1/0
		//boolean'da neler tutulabilir?
		//Ör: bir kullanıcının sistemde aktif olup olmadığını tutabilirsiniz(online/offline durumu).
//		boolean boolDegisken = true; // true veya false olarak sadece iki değerden birini alabilir.
//		System.out.println(boolDegisken);
//		
//		boolean agirMi = false; // initialize - ilk değer verme
//		int agirlik = 70;
//		agirMi = (agirlik>=85); //koşul kullandık
//		System.out.println("Ağır mı: "+agirMi);
//		
//		// ==  !=  <=  >=  <  >
//		boolean durum = (agirlik==50); // parantez kullanmak zorunda değiliz.
//		System.out.println("Durum: " + durum);
//		
//		durum = agirlik!=50; //ağırlık 50 değilse true anlar.
//		System.out.println("Durum: "+ durum);
//		
//		int boy=180;
//		boolean uzunKilolu = (boy >=180 && agirlik >=85);
//		System.out.println("Şahıs uzun ve kilolu mu? : " + uzunKilolu);
//		
//		//soru:
//		char cinsiyet = 'K' ; // 'E' olabilirdi
//		if (uzunKilolu && cinsiyet =='K') {
//			System.out.println("Şahıs kadın, uzun ve kilolu");
//		}
		
//*********************************************************************************************************		
		// if => Ternary kullanımı
		//Örnek:
//		int yas =19;
//		String deger;
//		if(yas >= 18) {
//			deger="Yetişkin";
//		}
//		else {
//			deger = "Yetişkin değil";
//		}
//		System.out.println(deger);
//		//yukarıdaki işlemi Ternary operatörü ile yapıcaz.
//		yas =11;
//		deger = yas>=18 ? "yetişkin" : "yetişkin değil";
//		System.out.println(deger);
//********************************************************************************************************		
		//Microsoft USA 'in mülakatında sorduğu sınav sorusu(SWAP numbers question)
//		int x = -5;
//		int y = 3;
//		
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println("\n\n");
		
//********************************************************************************************************
//		int x =10;
//		int y = 3;
//		int result = x/y;
//		System.out.println(result);
//		int kalan = x%y;
//		System.out.println(kalan);
//		
//		double res = x/y; // eşitliğin sağ tarafı hep int o yüzden küsürat yazmaz böyle.
//		System.out.println("result: " + res);
//		//çözüm1: x,y double olmalı.
//		
//		double xx =10;
//		double yy =3;
//		res =xx/yy;
//		System.out.println(res);
//		
//		//küsüratı azaltalım:
//		String kusurat = String.format("%.3f", res);
//		System.out.println(kusurat);
		
//*********************************************************************************************************
//		int sayisalDeger = 4 ;
//		sayisalDeger = sayisalDeger +1;
//		System.out.println("sayısal değer: "+ sayisalDeger);
//		sayisalDeger++;
//		System.out.println("sayısal değer: "+ sayisalDeger);
//		sayisalDeger +=1;
//		System.out.println("sayısal değer: "+ sayisalDeger);
//		sayisalDeger +=5;
//		System.out.println("sayısal değer: "+ sayisalDeger);
	
		// *=      /=     %= aynı şekilde çalışır.
//********************************************************************************************************		
//		int a =3;
//		int b = a++;  //DİKKAT!! önce atamayı yapar, sonra ++ işlemini yapar
//		System.out.println("a: "+ a+ "b: " +b);
//********************************************************************************************************	
//		int c= 3;
//		int d=++c;
//		System.out.println("c: "+ c+ "d: " +d);
		
//*******************************************************************************************************
//		int a = 3;
//		int b =4;
//		int z=5;
//		int tpl =a++ + ++b + --z;
//		System.out.println(tpl);
//*******************************************************************************************************		
		
		
	}

}
