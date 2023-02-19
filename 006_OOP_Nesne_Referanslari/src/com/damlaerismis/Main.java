package com.damlaerismis;

public class Main {

	public static void main(String[] args) {

		Kutu kutu1 = new Kutu();
		kutu1.hacim = 50;
		kutu1.kutununGidecegiYer = "ankara";
		

		Kutu kutu2 = new Kutu();
		kutu2.hacim = 75;
		kutu2.kutununGidecegiYer = "izmir";

		Kutu kutu3 = new Kutu();
		kutu3.hacim = 82;
		kutu3.kutununGidecegiYer ="istanbul";
		
		//bu 3 nesneyi bir arrayede tutmak istiyorum:
		int[] diziInt = new int [3];
		diziInt[0] =44;
		System.out.println("diziInt[0] : " + diziInt[0]);
		System.out.println();
		
		
		
		Kutu[] dizi = new Kutu[3];
		
		//dizi[0].hacim =90;  ==> hata verir. çünkü dizinin sıfırncı elemanını oluşturmadık/atamadık.
		dizi[0] = kutu1;
		dizi[0].hacim =90;  //==> şimdi hata vermez.
		System.out.println(dizi[0].hacim);
		
		dizi[1] = new Kutu();
		dizi[1].hacim = 120;
		dizi[1].kutununGidecegiYer = "bursa";
		System.out.println(dizi[1].hacim);
		
		if(dizi[1] == null) {
			System.out.println("dizini 2. index'li elemanı null");
		}
		
		//dizi[2].hacim =500; hata verir. çünkü diznin ikinci elemanı şu anda null.
		
		dizi[2] =kutu2;
		dizi[2].hacim =500;
		System.out.println(dizi[2].hacim);
		
		
		System.out.println("\ndizi içinde döngü: ");
		for(int i=0;i<dizi.length;i++) {
			System.out.println(dizi[i].hacim);
		}
		//yukardaki döngünün for each'li hali:
		System.out.println("\ndizi içinde döngü(for each): ");
		for (Kutu kutu : dizi) {
			System.out.println("hacim: " + kutu.hacim + " adres: " + kutu.kutununGidecegiYer);
		}
		
		
		
		
		
		
		
		

	}

}
