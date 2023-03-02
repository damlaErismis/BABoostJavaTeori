package com.damlaerismis.controller;

import java.util.Scanner;

import com.damlaerismis.repository.OgrenciRepository;
import com.damlaerismis.repository.entity.Ogrenci;

public class OgrenciController {
	
	
	private OgrenciRepository ogrenciRepository;
	
	public OgrenciController() {
		this.ogrenciRepository = new OgrenciRepository();
	}

	public void ogrenciEkleme() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eklenecek öğrencinin adını giriniz: ");
		String adi = scanner.nextLine();
		
		System.out.println("Eklenecek öğrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		
		System.out.println("Eklenecek öğrencinin no giriniz: ");
		int id = scanner.nextInt();
		
		Ogrenci ogrenci = new Ogrenci(adi, soyadi, id);
		
		this.ogrenciRepository.save(ogrenci);
	}

	public void ogrenciSil() {

		System.out.println("Silenecek öğrencinin no giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		this.ogrenciRepository.delete(id);
		
	}

	public void ogrenciGuncelle() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Güncellenecek öğrencinin adını giriniz: ");
		String adi = scanner.nextLine();
		
		System.out.println("Güncellenecek öğrencinin soyadını giriniz: ");
		String soyadi = scanner.nextLine();
		
		System.out.println("Güncellenecek öğrencinin no giriniz: ");
		int id = scanner.nextInt();
		
		Ogrenci ogrenci = new Ogrenci(adi, soyadi, id);
		this.ogrenciRepository.update(ogrenci);

		
	}

	public void ogrenciBul() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bilgilerini görüntülemek istediğiniz öğrencinin no giriniz: ");
		int id = scanner.nextInt();
		
		Ogrenci ogrenci = this.ogrenciRepository.findById(id);
		System.out.println("\n Bilgilerini görmek istediğiniz öğrenci: ");
		System.out.println(ogrenci);
		
	}

	public void ogrenciListesiniGoster() {

		System.out.println("****************************");
		System.out.println("*                          *");
		System.out.println("*     ÖĞRENCİ LİSTESİ      *");
		System.out.println("*                          *");
		System.out.println("****************************");

		for(Ogrenci ogr: this.ogrenciRepository.findall()) {
			System.out.println(ogr);
		}

		
	}

}
