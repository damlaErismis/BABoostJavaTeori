package com.damlaerismis.ornek2;

import java.util.Objects;

/*
 * eğer bir sınıfı HashSet ile kullanacaksanız hash setin doğrıu çalışması için equal() ve hashCode() metodlarını impelement etmeniz gerekir
 */
public class Kisi {

	private int id;
	private String ad;

	public Kisi(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int hashCode() {
		return Objects.hash(id);  //ad 'ı sildik sadece id'ye bakıyoruz şimdi.
	}
	public boolean equals(Object obj) {
		if(this == obj) //aynı nesneyse true dön
			return true;
		if(obj == null) // null ise false
			return false;
		if(getClass() != obj.getClass()) //Kisi class tipinde değilse gelen nesne
			return false;
		
		Kisi other = (Kisi) obj; //alt sınıftan üst sınıfa cast etme
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Kisi [id=" + id + ", ad=" + ad + "]";
	}
	
	

}
