package com.damlaerismis;

public class Dikdortgen {

	
	public int kisaKenar;    // =10;
	public int uzunKenar;    // =20;  hiçbir değeri atamazsak sıfır yazar.
	
	
	//farklı dikdörtgenler farklı farklı alanlar hesaplayacağı için alanHesapla metodu static olmaz. !!!
	//her nesneye özgü farklı bir değer döndürdüğü için.
	
	public int alanHesapla () {
		return (kisaKenar*uzunKenar);
	}
	
	
	
}
