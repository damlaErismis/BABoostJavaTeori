package com.damlaerismis.controller;

import java.util.Scanner;

import com.damlaerismis.repository.OgretmenRepository;
import com.damlaerismis.repository.entity.Ogrenci;
import com.damlaerismis.repository.entity.Ogretmen;

public class OgretmenController {
	
	private OgretmenRepository ogretmenRepository;
	public OgretmenController() {
		this.ogretmenRepository = new OgretmenRepository();
	}

	public void ogretmenEkleme() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eklenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		
		System.out.println("Eklenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		
		System.out.println("Eklenecek öğretmenin no giriniz: ");
		int id = scanner.nextInt();
		
		Ogretmen ogretmen = new Ogretmen(id, adi, soyadi);
		
		this.ogretmenRepository.save(ogretmen);
	}

	public void ogretmenSil() {

		System.out.println("Silenecek öğretmenin tc no giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogretmenRepository.delete(id);
	}

	public void ogretmenGuncelle() {

Scanner scanner = new Scanner(System.in);
		
		System.out.println("Güncellenecek öğretmenin adını giriniz: ");
		String adi = scanner.nextLine();
		
		System.out.println("Güncellenecek öğretmenin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		
		System.out.println("Güncellenecek öğretmenin tc no giriniz: ");
		int id = scanner.nextInt();
		
		Ogretmen ogretmen = new Ogretmen(id, adi, soyadi);
		this.ogretmenRepository.update(ogretmen);
		
	}

	public void ogretmenBul() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bilgilerini görüntülemek istediğiniz öğretmenin tc no giriniz: ");
		int id = scanner.nextInt();
		
		Ogretmen ogretmen = this.ogretmenRepository.findById(id);
		System.out.println("\n Bilgilerini görmek istediğiniz öğretmen: ");
		System.out.println(ogretmen);
		
	}

	public void ogretmenListesiniGoster() {

		System.out.println("****************************");
		System.out.println("*                          *");
		System.out.println("*     ÖĞRETMEN LİSTESİ     *");
		System.out.println("*                          *");
		System.out.println("****************************");

		for(Ogretmen ogr: this.ogretmenRepository.findall()) {
			System.out.println(ogr);
		}
	}
	
	

}
