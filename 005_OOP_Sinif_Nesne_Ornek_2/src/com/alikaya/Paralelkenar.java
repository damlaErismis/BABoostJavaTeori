package com.alikaya;

public class Paralelkenar {

	// access modifiers (erişim belirleyici) for member variables(üye değişkenler):
	// public : tüm paketlerden erişilebilir ve kullanılabilir.
	// protected: sadece aynı paket içindeki sınıflardan erişim olabilir, farklı paketlerden erişilemez.
	// private : sadece bulunduğu sınıf içinden erişilebilir.
	// default (boş bırakmak) : hiçbir şey yazmazsanız protected gibi davranır.
	int kenarKisa;
	int kenarUzun;  //ali bunlara int dedi geçti, public int demedi.
	
	private String isim;
	
	private String getIsim() {
		return isim;
	}
	
	
	
	public static void main(String[] args) {
		Paralelkenar paralelKenar = new Paralelkenar();
		paralelKenar.isim ="benim paralelkenarım";
		System.out.println(paralelKenar.getIsim());
	}
	
	
}
