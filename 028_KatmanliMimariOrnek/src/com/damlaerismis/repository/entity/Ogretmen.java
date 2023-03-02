package com.damlaerismis.repository.entity;

public class Ogretmen {

	private int tcKimlik;
	private String adi;
	private String soyadi;

	public Ogretmen(int tcKimlik, String adi, String soyadi) {
		super();
		this.tcKimlik = tcKimlik;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public int getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(int tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@Override
	public String toString() {
		return "Ogretmen [tcKimlik=" + tcKimlik + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}

}
