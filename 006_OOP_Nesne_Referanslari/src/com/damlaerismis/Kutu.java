package com.damlaerismis;

public class Kutu {

	public int hacim;  //=0
	public String kutununAdi;
	public String sahibininAdi;
	public String kutununGidecegiYer;
	
	
	public void degistir(int sayi) {
		hacim =sayi;
	}
	
	
	public void degistir2(int sayi) {
		int sonuc = sayi *sayi;
		sayi = sonuc;
	}
	
	public  int degistir3(int sayi) {
		int sonuc = sayi *sayi;
		sayi = sonuc;
		return sayi;
	}
	
	public static void main(String[] args) {
		
		Kutu kutu1 = new Kutu();
		kutu1.hacim =20;
		System.out.println(kutu1.hacim);
		kutu1.degistir(30);
		System.out.println(kutu1.hacim);
		
		int s =5;
		kutu1.degistir2(s);
		System.out.println(s);
		// System.out.println(sonuc); ==> bunu yazamaz çünkü sonuc değişkeni local bir değişken. 
		//bu metodun içinde başka metoda ait değişkeni bulamaz.
		
		// void return eden metodları system.out.println() içine yazamazsın.
		System.out.println(" degistir3: " + kutu1.degistir3(3));
		
		Kutu kutu2;
		
		kutu2 = kutu1;
		kutu2.degistir(40);
		System.out.println(kutu1.hacim);
		System.out.println(kutu2.hacim);
		
		
		Kutu kutu3;
		kutu3 =kutu2;
		System.out.println(kutu3.hacim);
		
		
		kutu3 = new Kutu();  //yeni nesne oluştururken ilk değeri vermediğimiz zaman 0 yazar.
		System.out.println(kutu3.hacim);
		
		
		
		
	}

}
