package com.damlaerismis;

import java.util.Scanner;

public class KullanicidanVeriAlmaScanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // bu satırı ezberle
		System.out.println("lütfen bir sayı giriniz: ");
		int sayi1 = 0;
		sayi1 = input.nextInt();
		System.out.println("girdiğiniz sayı: " + sayi1);

		int sayi2 = sayi1 * sayi1;
		System.out.println("girdiğiniz sayının karesi: " + sayi2);
		int sayi3 = sayi1 * sayi1 * sayi1;
		System.out.println("girdiğiniz sayının küpü: " + sayi3);

	}

}
