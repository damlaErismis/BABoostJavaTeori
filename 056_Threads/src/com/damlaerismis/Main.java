package com.damlaerismis;

public class Main {

	public static void main(String[] args) {

		System.out.println("Main thread çalışıyor...");
		
		Yazici yaziciThread1 = new Yazici("Yazici Thread-1");
		Yazici yaziciThread2 = new Yazici("Yazici Thread-2");
		
		yaziciThread1.start();  
		yaziciThread2.start();  //kontrol JVM e geçiyor 
		
		
		
		System.out.println("Main thread bitti çıkıyor...");
	}

}
