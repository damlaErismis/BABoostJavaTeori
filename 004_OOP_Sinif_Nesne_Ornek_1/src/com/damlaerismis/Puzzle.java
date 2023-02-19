package com.damlaerismis;

public class Puzzle {

	// static değişken
	public static final String tur = "oyuncak";

	// sınıf üye değişkenleri

	public String ad;
	public String marka;
	public int parcaSayisi;
	public int stokMiktari;

	public  String puzzleBilgileriniGetir() {
	String metin = "Ad: " + ad + " Marka: " + marka + " Parça Sayısı: " + parcaSayisi + " Stok Miktarı: " + stokMiktari;
		return metin;
	}

}
