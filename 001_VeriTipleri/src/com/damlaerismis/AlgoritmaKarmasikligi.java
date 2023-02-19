package com.damlaerismis;

public class AlgoritmaKarmasikligi {

	public static void main(String[] args) {
		
		int islemAdedi =100000;
		//1. Algoritmanın çalışma süresi hesaplanıyor:
//		long startTime = System.currentTimeMillis();
//		String metin = "hello";
//		for (int i=0;i<islemAdedi;i++) {
//			metin = metin + i;
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("işlem süresi :" + (endTime-startTime) + " milisaniye.");
	
		//2. Algoritmanın çalışma süresi hesaplanıyor:
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		for (int i=0;i<islemAdedi;i++) {
			sb.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("işlem süresi :" + (endTime-startTime) + " milisaniye.");
	
	}

}
