package com.damlaerismis;

import java.util.Scanner;

public class KullanicidanVeriAlmaScanner2 {

	public static void main(String[] args) {

		// kullanıcıdan metin veritipi alma:

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen adınızı yazın:");
		String isim;
		isim = input.nextLine();

		System.out.println("Lütfen soyadınızı yazın:");
		String soyIsim;
		soyIsim = input.nextLine();

		System.out.println("Lütfen yaşadığınız ili yazınız:");
		String sehir = input.nextLine();
		//DİKKAT!!!!
		// input.nextInt 'ten sonra(herhangi bir sayı alma işleminden sonra)
		// kullanıcıdan string alacaksanız, araya bir boş nextLine() yazın.
		// input.nextLine(); şeklinde

		System.out.println("Lütfen yaşınızı giriniz: ");
		int yas = input.nextInt();
		System.out.println(
				"İsminiz: " + isim + " Soyadınız: " + soyIsim + " Yaşınız: " + yas + " Yaşadığını il: " + sehir);

		
		//String'den int'e çevirmek için ilgili veritipinin Wrapper class'ı kullanılır:
		String yas2="30";
		int yasIntValue=Integer.valueOf(yas2);
		System.out.println(yas2);
	}

}
