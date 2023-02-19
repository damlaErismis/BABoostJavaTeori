package com.damlaerismis;

public class DiziOrnekleri {

	public static void main(String[] args) {

		// soru:
		int[] dizi = {-4,7,12,78,-32,122,0,9};
		// bu dizinin ortalamasını tam sayı cinsinden bulunuz.
		
		System.out.println(dizi.length);
		int toplam = 0;
		for (int i =0;i<dizi.length;i++) {
			toplam = toplam+dizi[i];
		}
		System.out.println("ortalama: " + (toplam/dizi.length));
	
		//int eşitlerken yuvarlama yapması
		int x = 20;
		int g = x/3;
		int y = 3;
		double v = x/(y*1.0);
		System.out.println(v);
		//küsüratla ilgili java math kütüphanesi kullanımı:
		System.out.println(Math.round(v));
		System.out.println(Math.round(1.4));
		
		
		//dizinin en küçük ve en büyük elemanını bulma problemleri
		//
		// soru:
		// bir dizi içindeki en büyük sayıyı bulunuz..
        
        int enBuyuk = dizi[0];
        for (int i=1;i<dizi.length;i++) {
            if(enBuyuk < dizi[i])
                enBuyuk = dizi[i];
        }
        System.out.print("Dizideki En Büyük Sayı :" + enBuyuk);


        //en küçük sayıyı ve sayının indexini bulunuz.
       
        System.out.println("\n*****************\n");
        
        
        int ek = dizi[0];
        int index = 0;
        for (int i=1;i<dizi.length;i++) {
            if(ek > dizi[i]) {
                ek = dizi[i];
            	index = i;
            }
        }
        System.out.print("Dizideki En Küçük Sayı :" + ek + "indexi: " + index);
        
        System.out.println("\n*****************\n");
	
        
        
        
	
	}

}
