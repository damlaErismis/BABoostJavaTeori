package com.damlaerismis;

import java.util.Arrays;

public class OtoGaleri {

	private String galeriAdi;
	private Otomobil[] otomobilDizisi;
	private int galeridekiOtomobilSayisi;
	
	
	
	//OtoGaleri constructor
	public OtoGaleri(String galeriAdi, int kapasite) { //==> galerinin kapasitesi
		this.otomobilDizisi = new Otomobil[kapasite];
		this.galeridekiOtomobilSayisi = 0;
		this.setGaleriAdi(galeriAdi); // this.setGaleriAdi = galeriAdi;   böyle de diyebiliridk
		
	}


	public void galeriyeOtomobilEkle(Otomobil otomobil) {
		if (galeridekiOtomobilSayisi< otomobilDizisi.length) {  //galeride boş yer varsa otomobil eklensin
			otomobilDizisi[galeridekiOtomobilSayisi] = otomobil; //galeridekiOtomobilSayisi 0 iken dizinin 0. indeksi olur.
			galeridekiOtomobilSayisi++;							// artırıp 1 olunca 1. indekse ekmeiş olur.
		}else { // galeride yer yoksa ekleme yapılmasın
			System.err.println("Galeri Kapasitesi Ful! Araç Eklenemedi!");
		}
	}
	
	public void galeridekiOtomobilleriListele() {
		System.out.println("\n\n" + this.galeriAdi + " Galerisindeki Otomobiller Listesi: " + "(Kapasite: " + this.otomobilDizisi.length + " )"
				+ "(Galerideki Anlık Otomobil Sayısı: " + this.galeridekiOtomobilSayisi+ " )");
		for(int i =0; i< this.galeridekiOtomobilSayisi;i++) {
			//System.out.println(otomobilDizisi[i].getMarka() + " " + otomobilDizisi[i].getModel());
			System.out.println(otomobilDizisi[i]);  //istersen böyle istersen yukardaki gibi yazdır.
		}
	}
	
	
	public int findCount(String marka) {
		int counter = 0 ;
		for(int i =0; i<galeridekiOtomobilSayisi;i++) {
			if(otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				counter++;
			}
		}
		return counter;
	}
	
//	public Otomobil[] search(String marka) {
//
//		for(int i =0; i< findCount(marka) ; i++) {
//			if(otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
//			System.out.println(otomobilDizisi[i].toString());
//			}
//		}
//		
//		return otomobilDizisi;
//	}
	
	public Otomobil[] search(String marka) {
		int count = findCount(marka); // count: aranan marka otomobil sayısı
		Otomobil[] aramaSonuclari = new Otomobil[count];
		
		int sayac =0; 
		
		for(int i =0; i< galeridekiOtomobilSayisi ; i++) {
			if(otomobilDizisi[i].getMarka().equalsIgnoreCase(marka)) {
				aramaSonuclari[sayac] = otomobilDizisi[i];
				sayac++;
			}
		}
		return aramaSonuclari;
	}
	
	//advance örnek :)
	//dizinin kapaasitesini değiştirerek silme işlemi yapıyoruz
	public void galeridenOtomobilSil(int siraNo) {
		Otomobil[] otomobilDizisiTemp = new Otomobil[otomobilDizisi.length]; //dizinin size'ını da değiştirmek isteyen [otomobilDizisi.length-1] yap
		System.out.println(siraNo + " .indexte bulunan otomobil " + galeriAdi + " galerisinden siliniyor...");
		int j = 0;
		for(int i =0; i<otomobilDizisi.length;i++) {
			if (i != siraNo) {
				otomobilDizisiTemp[j] = otomobilDizisi[i];
				j++;
			}
		}
		this.galeridekiOtomobilSayisi--;
		otomobilDizisi = otomobilDizisiTemp;
	}
	
	
	public String getGaleriAdi() {
		return galeriAdi;
	}


	public void setGaleriAdi(String galeriAdi) {
		this.galeriAdi = galeriAdi;
	}


	public int getGaleridekiOtomobilSayisi() {
		return galeridekiOtomobilSayisi;
	}


	@Override
	public String toString() {
		return "OtoGaleri [otomobilDizisi=" + Arrays.toString(otomobilDizisi) + "]";
	}

	
	
}
