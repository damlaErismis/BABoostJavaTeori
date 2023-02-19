package com.damlaerismis;

import java.util.Scanner;

public class StringDetay {

	public static void main(String[] args) {
		
//		String metin ="merhaba nasılsın";
//		Scanner input = new Scanner(System.in);
//		metin = input.nextLine();
//		System.out.println(metin);
//******************************************************************************
		//java stringi böyle tutar:
		//  0    1    2    3    4    5    6    7    8    9      ....  41
		//{'B', 'u', 'g', 'ü', 'n', ' ', 'j', 'a', 'v', 'a', ' ',...,'z'} => bu bir char dizisi/array
		//index dizilimi 0,1,2,3,...
		String metin = "Bugün java ile string konusunu işleyeceğiz";
		String tekharf = "a"; //char[] dizi => { 'a' } => java bunu 1 elemanlı char dizisi olarak tutar
		
		//string en çok kullanılan metodları:
		//length metodu:
		//metin.length() şeklinde kullanılır, metnin uzunluğunun int cinsinden verir.
		
		//örnek:
		int uzunluk = metin.length();
		System.out.println(uzunluk);
		
		//charAt metodu:
		//belirli bir indexteki karakteri döner...
		System.out.println("0. index karakter: " + metin.charAt(0));
		System.out.println("2. index karakter: " + metin.charAt(2));
		
		//peki bu metnin uzunluğu ne?
		System.out.println("0. karakter: " + metin.charAt(41));
		System.out.println("0. karakter: " + metin.charAt(metin.length()-1));
		
		//indexOf metodu:
		//Finds the index
		//
		//örnek:
		//s harfi ilk nerede geçiyor? hangi indexte?
		System.out.println("s harfi ilk nerede geçiyor? : " + metin.indexOf("s"));
		
		System.out.println(metin.charAt(15));
		
		System.out.println("B harfi ilk nerede geçiyor? : " + metin.indexOf("B"));
		System.out.println("b harfi ilk nerede geçiyor? : " + metin.indexOf("b"));
		//aradığınız karakter yoksa -1 döndürür
		
		//birden fazla harf alma
		//java kelimesi ilk nerede geçiyor
		System.out.println("java kelimesi ilk nerede geçiyor? : " + metin.indexOf("java"));
		
		//soru:
		//metin stringin içinde x harfinin kullanılıp kullanılmadığını nasıl buluruz
		if(metin.indexOf("x")== -1) {
			System.out.println("x harfi metin içinde yoktur");
		} else {
			System.out.println("x harfi metin içinde vardır");
		}
		//soru:
		// i harfi ilk nerede geçiyor?
		System.out.println("i harfi ilk nerede geçiyor: " + metin.indexOf("i"));
		System.out.println("i 14. indexten sonra ilk nerede geçiyor: " + metin.indexOf("i", 14));
		
		//soru:
		// i harfi cümlenin yarısından sonra ilk nerede var?
		System.out.println("i harfi cümlenin yarısından sonra ilk nerede var? : " + metin.indexOf("i",(metin.length()/2)));
	
		//***********************************************************************************************
		//
		//substring
		//substring(baslangic index, bitis index) => başlangıç dahil - bitiş dahil değil
		//gets substring of a string
		System.out.println("metnin ilk 5 karakter: " +metin.substring(0,5)); // 0,1,2,3,4. karakterleri alır.
		
		//soru:
		//metindeki java ifadesini substring ile çekin.
		
		System.out.println("metnin içindeki java ifadesi:  " +metin.substring(6,10));
		
		//soru: ne yazar aşğ. prog.?
		String test= "test 1234";
		System.out.println(test.substring(2,7));
		
		
		// 2. kullanım şekli:
		System.out.println(test.substring(5)); //5ten başlayıp sonuna kadar yazıyo.
		
		//************************************************************************************************
		//
		//trim
		// bir stringin başındaki ve sonundaki boşlukları siler
		String cumle = " hello java ";
		System.out.println(cumle);
		cumle = cumle.trim(); //orijinal stringi değiştirmez
		System.out.println(cumle);
		//kullanıcı adı şifre yazan uygulamalarda trim kullanmazsanız sorun yaşayabilirsiniz.
		
		//**********************************************************************************************
		//
		//toUpperCase ve toLowerCase
		//
		//metnin içindeki harflerin caseini değiştirmeye yarar.
		metin = "hello java";
		System.out.println(metin.toLowerCase()); //hello java
		System.out.println(metin.toUpperCase()); //HELLO JAVA
		
		//Alidayi@gmail.com
		//alidayi@gmail.com  => e postalar büyük küçük duyarlı değil ama şifreler öyle.
		
		//sınav soru:
		//aşağıdaki çıktıyı ekrana yazdıran bir döngü yazınız.
		//
		
		int x,y;
        int sayi=1; 
        
        for(y=0; y<7; y++) {
            for (x=0; x <sayi; x++) {
                System.out.print("*");
            }
            System.out.println("");
            sayi++;
        }
		
        //****************************************************************************************
        //
        //valueOf
        //coverts different types of values to String
        int sayi0 = 2233;
        String ss = String.valueOf(sayi0);
        System.out.println(ss);
		
        boolean flag = true;
        ss = String.valueOf(flag);
        System.out.println(ss);
        
        //*****************************************************************************************
        //
        //equals metodu
        // 
//        String uname = "gsungur@test.com"; //DB'de loginname bu şekilde tutuluyor diyelim
//        
//        Scanner input = new Scanner(System.in);
//        System.out.println("lütfen kullanıcı adı girin: ");
//        String userName = input.nextLine();
//        userName = userName.toLowerCase().trim();
        
        //stringleri bu şekilde == ile karşılaştıramayız.!!!!!!!
//        if(userName == uname) {
//        	System.out.println("kullanıcı adı eşleşti.");
//        }else {
//        	System.out.println("eşleşmedi");
//        }
		
//        if (userName.equals(uname)) {
//        	System.out.println("kullanıcı adı eşleşti.");
//        }else {
//        	System.out.println("eşleşmedi");
//        }
	
        //*******************************************************************************************
        //
        // equalsIgnoreCase metodu
        // metin karşılaştrması yaparken büyük harf küçük harf ayrımını dikkate almaz
        
        String isim1 = "Vedat";
        String isim2 = "vedat";
        if (isim1.equalsIgnoreCase(isim2)) { //sadece equals olsaydı eşleşmedi derdi
        	System.out.println("eşleşti.");
        }else {
        	System.out.println("eşleşmedi");
        }
        //********************************************************************************************
        //
        //replace metodu
        String s2 = "Şahin yırtıcı bir kuştur";
        String s3 = s2.replace("Ş", "s");
        System.out.println(s3);
        
        //nerelerde kullanılır?
        // 1. örnek : kira sözleşmesi
        
        String sozlesme = "Ali Kaya Güneş sokak Çankaya mah. adresindeki evini Ayşe Naz'a kiraladı..";
		String yeniSozlesme = sozlesme.replace("Ayşe Naz", "Veli Han");
		System.out.println(yeniSozlesme);
		
		// 2. Kullanım:
		// web url'lerinde türkçe karakterlerde sorun çıkabiliyor...
		// Örn. https://www.isbasvuru.com/alikaya iş başvuru.pdf => Sıkıntı çıkar
		String dosyaAdi = "https://www.isbasvuru.com/alikaya iş başvuru.pdf";
		// Boşluk karakterini - ile değiştirin, türkçe karakterleri ingilizce ile değiştirin...
		dosyaAdi = dosyaAdi.replace(" " , "-").replace("ş", "s");
		System.out.println(dosyaAdi);
		
		//*************
				//
				// contains metodu:
				// Herhangi bir substringin hedef string içinde var olup olmadığını kontrol eder.
				String yeniMetin = "Hava bugün çok yağmurlu";
				System.out.println("ağ kelimesi var mı?" + yeniMetin.contains("ağ"));
				System.out.println("tağ kelimesi var mı?" + yeniMetin.contains("tağ"));
				
				if (yeniMetin.contains("yağmur")) {
					System.out.println("Hava durumunda bugün yağmur görünmüyor!");
				}else {
					System.out.println("Bugün yağmur yok");
				}
				
				
				//***************
				//
				// startsWith
				String ad = "Ali Kaya";
				System.out.println(ad.startsWith("A")); // => True
				System.out.println(ad.startsWith("Ali")); // => True
				System.out.println(ad.startsWith("li")); // => False
				String kontrol = "Al";
				System.out.println(ad.startsWith(kontrol)); // => True
				
				
				// split
				//
				// verilen ifadeye göre metni böler. [] : dizi/array simgesi
				String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";                 //  0       1       2        3        4
				String[] isimler = liste.split(","); // String dizisi yapar: { "Ali", "Burcu", "Ayşe", "Zeynep", "Kaan" }
				System.out.println(isimler[0]);
				System.out.println(isimler[2]);
				System.out.println(isimler[isimler.length-1]);

				
//				System.out.println();
//				for (int i=0;i<isimler.length;i++) {
//					System.out.println(isimler[i]);
//				}
				
				
				// Örnek:
				// Öğrencilerin listesi String olarak tutuluyor olsun. Ben bunları ayrıştırmak istiyorum:
				String ogrencilerStr = "Ali Kaya,123;Veli Öz,222;Zeynep Naz,342";
				String[] ogrenciler = ogrencilerStr.split(";"); // ogrenciler = { "Ali Kaya,123", "Veli Öz,222", "Zeynep Naz,342"}
				System.out.println(ogrenciler[0]);
				System.out.println(ogrenciler[1]);
				System.out.println(ogrenciler[ogrenciler.length - 1]);
				
				
				// Peki ilk öğrencinin okul numarasını ekrana yazalım:
				// System.out.println(ogrenciler[0].split(",")[1]);  //  { "Ali Kaya", "123" }
				// ogrenciler[0] => "Ali Kaya,123"
				String[] ogrenciBilgileri = ogrenciler[0].split(",");  //  ogrenciBilgileri => { "Ali Kaya", "123"}
				System.out.println(ogrenciBilgileri[0]);
				System.out.println(ogrenciBilgileri[1]);
				
				// Veli'nin okul numarasını yazdıralım:
				String[] ogrenciBilgileriVeli = ogrenciler[1].split(",");  // { "Veli Öz", "222"}
				System.out.println(ogrenciBilgileriVeli[1]);
				// int ogrNo = Integer.parseInt(ogrenciBilgileriVeli[1]);
				
				// Veli'nin sadece ismini yazdıralım
				String[] ogrenciBilgileriIsim = ogrenciBilgileriVeli[0].split(" ");  // { "Veli", "Öz" }
				System.out.println(ogrenciBilgileriIsim[0]);
				
				
				//
				// stringbuilder kullanımı
				//
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.append("Merhaba");
				stringBuilder.append(" Dünya");
				stringBuilder.append(" Java");
				System.out.println(stringBuilder);
				
				
//				Scanner sc = new Scanner(System.in);
//				sb.append(sc.nextLine());
//				System.out.println(sb);
				
				
				
				// String karşılaştırma konusu detay:
//				System.out.println("\n************\n");
//				String x = "Ali";
//				String y = "Veli";
//				
//				if (x==y)
//					System.out.println("Eşit");
//				else
//					System.out.println("Eşit değil");
//				
//				String z = "Ali";
//				if (x==z)
//					System.out.println("Eşit");
//				else 
//					System.out.println("Eşit değil");
//				
//				String w = "Ali ".trim();
//				System.out.println(w);
//				if (x==w)
//					System.out.println("w ve x Eşit");
//				else
//					System.out.println("w ve x eşit değil");
//				
				
				// Çok dikkatli olmak lazım
				// String içerik karşılaştırmlarında mutlaka equals metodu kullanılmalıdır.
				// Sınavlarda / Mülakatlarda çok sorulan sorulardan biridir.
//				System.out.println("\n*******\n");
//				if (w.equals(x))
//					System.out.println("eşit");
//				else
//					System.out.println("eşit değil");

        
        
        
	
	
	
	}

}
