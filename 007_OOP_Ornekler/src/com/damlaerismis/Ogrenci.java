package com.damlaerismis;

public class Ogrenci {

	public int ogrenciNo;
	public String ad;
	public String soyad;
	public IletisimBilgileri iletisimBilgileri;
	
	
	
	
	// sağ tık >> source >> generate to string

	@Override
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + ", ad=" + ad + ", soyad=" + soyad + ", iletisimBilgileri="
				+ iletisimBilgileri + "]";
	}
	
	
	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.ogrenciNo = 16;
		ogrenci1.ad = "damla";
		ogrenci1.soyad = "erişmiş";
		ogrenci1.iletisimBilgileri = new IletisimBilgileri();
		ogrenci1.iletisimBilgileri.tel = 5554443322L;  //long type old için L koyduk.
		ogrenci1.iletisimBilgileri.adres ="ıhlamur sk. no:5 çankaya ankara";
		System.out.println(ogrenci1.toString());
		
		//toString() kullanımı: syso içine nesneyi yazarsak,  syso otomatik olarak nesnenin toString() metodunu çağırır.
		System.out.println(ogrenci1);
		
		
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.ogrenciNo = 163;
		ogrenci2.ad = "derya";
		ogrenci2.soyad = "paksoy";
		ogrenci2.iletisimBilgileri = new IletisimBilgileri();
		ogrenci2.iletisimBilgileri.tel = 5504403020L;  //long type old için L koyduk.
		ogrenci2.iletisimBilgileri.adres ="sinpaş aquacity merkezefendi denizli";
		System.out.println(ogrenci2.toString());
		
		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.ogrenciNo = 101;
		ogrenci3.ad = "erdem";
		ogrenci3.soyad = "baktır";
		ogrenci3.iletisimBilgileri = new IletisimBilgileri();
		ogrenci3.iletisimBilgileri.tel = 5551254322L;  //long type old için L koyduk.
		ogrenci3.iletisimBilgileri.adres ="kuzgun cd. no:5 çankaya ankara";
		System.out.println(ogrenci3.toString());
		
		System.out.println();
		
		
		//soru:
		//ogrenci nesnelerinden oluşan bir dizi oluşturun
		//diziye sırasıyla ogrenci1, ogrenci2, ogrenci3 ü içerik olarak atayın
		//for each dongusu ile dizinin tüm elemanlarını yazdırın
		
		System.out.println("\n Öğrenci Listesi: ");
		Ogrenci[] dizi = new Ogrenci[3];
		dizi[0] = ogrenci1;
		dizi[1] = ogrenci2;
		dizi[2] = ogrenci3;
		
		
		for (Ogrenci ogrenci : dizi) {
			System.out.println(ogrenci.toString());
		}
		
		//alternatif:  (toString() metodunu çağırmadan:)
//		for (Ogrenci ogrenci : dizi) {
//			System.out.println("Ogrenci [ogrenciNo=" + ogrenci.ogrenciNo + ", ad=" + ogrenci.ad + ", soyad=" + ogrenci.soyad + ", iletisimBilgileri="
//					+ ogrenci.iletisimBilgileri + "]");
//		}
//		
		
	}




	
	
}
