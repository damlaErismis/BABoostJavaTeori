package com.damlaerismis;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorOrnek {

	public static void main(String[] args) {

		/*
		 * ListIterator kullanımı:
		 * 
		 * next() : ileri previous(): geri hasNext(): ileride eleman varmı?
		 * hasPrevious(): geride elaman varmı? true ya da false
		 */

		List<String> list = new ArrayList<>();
		list.add("damla");
		list.add("derya");
		list.add("nil");
		System.out.println(list);

		// Listeyi baştan sona gezmek için:
		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Listeyi sondan başa doğru gezme:
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
