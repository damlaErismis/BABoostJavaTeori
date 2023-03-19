package com.damlaerismis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		List<Otomobil> cars = new ArrayList<>();
		cars.add(new Otomobil("Opel","Astra",2011));
		cars.add(new Otomobil("Audi","A4",2021));
		cars.add(new Otomobil("BMW","1.18",2014));
		cars.add(new Otomobil("Renault","Megane",2011));
		
		for(Otomobil oto : cars ) {
			System.out.println(oto);
		}
		
		//Soru: Audi A4 otomobilini index kullanmadan for döngüsü içinde silmeye çalışın:
		System.out.println("\n-------------------------\n");
		ListIterator<Otomobil> listIterator = cars.listIterator();
		while(listIterator.hasNext()) {
			if(listIterator.next().getMarka().equals("Audi")) {
				listIterator.remove();
			}
		}
		for(Otomobil s : cars ) {
			System.out.println(s);
		}
		
		
		// Iteratorların en önemli kullanım alanı döngü içinde gezerken istediğiniz liste elemanını silebilmenizdir.
		// For-loop içinde bunu yapamayız:
		
		/*
		 for (Iterator iterator = cars.iterator(); iterator.hasNext();) {
			Otomobil otomobil = (Otomobil) iterator.next();
			
			if(otomobil.getMarka().equalsIgnoreCase("Audi")&& otomobil.getModel().equalsIgnoreCase("A3")) {
				iterator.remove();
			}
		} 
		*/
		
		//alternatif çözüm:
		System.out.println("\n***************\n");
		for(Iterator<Otomobil> iterator = cars.iterator(); iterator.hasNext();) {
			Otomobil oto = (Otomobil) iterator.next();
			if(oto.getMarka().equalsIgnoreCase("Audi")&& oto.getModel().equalsIgnoreCase("A3")) {
				iterator.remove();
			}
		}System.out.println(cars);
		 
		
	}

}
