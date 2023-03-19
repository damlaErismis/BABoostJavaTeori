package com.damlaerismis;

public class Main {

	//GENERIC METHODS:
	public static <E> void myGenericMethod(E[] array) { //staticten sonraki <E> yazmazsak ide hata verir
		
		// Bu method array'in içindeki şekillerin toplam alanını hesaplasın..
		int toplam =0;
		for(E obj : array ) {
			Sekil objSekil = (Sekil) obj;
			if(objSekil != null) {
				toplam += objSekil.alanHesapla();
			}
		}
		System.out.println("Array'in toplam alanı: " + toplam);
	}
	
	
	public static void main(String[] args) {

		GeometricAlan<DikUcgen, Kare> alan1 = new GeometricAlan<DikUcgen, Kare>(new DikUcgen(10, 10), new Kare(5));
		System.out.println("alan1 alanı: " + alan1.geometricSeklinAlaniniHesapla());
		
		GeometricAlan<Dikdortgen, DikUcgen> alan2 = new GeometricAlan<Dikdortgen, DikUcgen>(new Dikdortgen(8, 5), new DikUcgen(4, 12));
		System.out.println("alan2 alanı: " + alan2.geometricSeklinAlaniniHesapla());
		
		GeometricAlan<Kare, Kare> alan3 = new GeometricAlan<Kare, Kare>(new Kare(7), new Kare(3));
		System.out.println("alan3 alanı: " + alan3.geometricSeklinAlaniniHesapla());
		
		GeometricAlan<Circle, Kare> alan4 = new GeometricAlan<Circle, Kare>(new Circle(10), new Kare(5));
		System.out.println("alan4 alanı: " + alan4.geometricSeklinAlaniniHesapla());
		
		//içinde 3 tane kare nesnesi olan bir kare array'i oluşturalım:
		Kare[] kareArray = new Kare[3];
		kareArray[0] = new Kare(3);
		kareArray[1] = new Kare(4);
		kareArray[2] = new Kare(5); //=> kareArray --> {Kare nesnesi(kenarı:3), Kare nesnesi(kenarı:4), Kare nesnesi(kenarı:5)}
		myGenericMethod(kareArray);
		
		Dikdortgen[] darr = new Dikdortgen[3];  // {null, null, null}
		darr[0] = new Dikdortgen(3, 4);
		darr[1] = new Dikdortgen(4, 5);
		darr[2] = new Dikdortgen(5, 7);
		
		System.out.println("\n-------------\n");
		
		/*soru:
		içinde 1 dikdörtgen, 1 kare, 1 diküçgen nesneleri olan bir array
		oluşturun. myGenericMethod'a bu arrayi parametre olarak gönderin ve 
		bu farklı nesnelerin toplam alanını ekrana yazdırın.*/
		
		
		Sekil[] sekiller= new Sekil[3];
		sekiller[0]= new Dikdortgen(4, 8);
		sekiller[1]= new Kare(10);
		sekiller[2]= new DikUcgen(3,4);
		myGenericMethod(sekiller);
		
		
		
		
	}

}
