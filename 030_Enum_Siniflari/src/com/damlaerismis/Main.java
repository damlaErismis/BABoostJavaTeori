package com.damlaerismis;

public class Main {
	
	public static void ucusBilgileriniGoster(UcusTipi ucusTipi) {
		System.out.println("Uçuş Tipi : "+ucusTipi.getTip()+" Açıklama : "+ucusTipi.getMetin());
		
	}

	public static void main(String[] args) {
		Main.ucusBilgileriniGoster(UcusTipi.EKONOMIK);
		Main.ucusBilgileriniGoster(UcusTipi.OZEL);
		Main.ucusBilgileriniGoster(UcusTipi.VIP);
	}

}
