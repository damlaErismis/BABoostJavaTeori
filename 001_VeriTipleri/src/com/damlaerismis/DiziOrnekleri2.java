package com.damlaerismis;

import java.util.Scanner;

public class DiziOrnekleri2 {

	public static void main(String[] args) {
		//soru: 
		//kullanıcı bir sayı girsin. bu sayının binary olup olmadığını bulan program.
		
		System.out.println("lütfen bir sayı giriniz.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String temp = String.valueOf(num);
		boolean sayiBinaryMi = true;
		// "10101"
		for(int i =0; i<temp.length();i++) {
			char rakam = temp.charAt(i);
			if (rakam == '1' || rakam == '0') {
				//hiçbir şey yapma
			}else {
				sayiBinaryMi = false;
				break;
			}	
		}
		if (sayiBinaryMi== true) {
			System.out.println("girdiğiniz sayı binary");
		}else {
			System.out.println("girdiğiniz sayi binary değil");
		}
	
		
	
	
	}

}
