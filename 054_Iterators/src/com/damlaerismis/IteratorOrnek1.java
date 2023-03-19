package com.damlaerismis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOrnek1 {

	public static void main(String[] args) {

		// Iterable interface'ini implement eden collection sınıfları istendiğinde bizlere bir
		// iterator sağlamakla "/return etmekle" mükelleftirler.
		
		// Java iterator collection içindeki elemanlar arasında gezinmemize yarar.
		// En önemli özelliklerinden biri de collection elemanlarını remove edebilmeleridir.
		
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(5);
		listInteger.add(12);
		listInteger.add(24);
		
		Iterator<Integer> iterator = listInteger.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		 
	}

}
