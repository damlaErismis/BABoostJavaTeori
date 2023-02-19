package com.damlaerismis;

public class Kitap {

	// static değişken
	public static final String tur = "Kitap";

	// sınıf üye değişkenleri
	public String ad;
	public int sayfaSayisi;
	public String yazarAdi;
	public int stokMiktari;

	public String kitapBilgileriniGetir() {
		String kitapBilgileri = "Ad: " + ad + " Yazar adı: " + yazarAdi + " Sayfa sayısı: " + sayfaSayisi
				+ " stok miktarı : " + stokMiktari + " tür: " + Kitap.tur;
		return kitapBilgileri;
	}

}
