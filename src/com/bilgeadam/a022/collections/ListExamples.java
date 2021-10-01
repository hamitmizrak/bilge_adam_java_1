package com.bilgeadam.a022.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
	public static void main(String[] args) {
		// List Set
		// Map
		List<String> iller = new ArrayList<String>();
		iller.add("İstanbul");
		iller.add("Ankara");
		iller.add("Adana");
		iller.add("Sivas");
		
		// iterative
		System.out.println("1.Döngü iterative döngü");
		for (int i = 0; i < iller.size(); i++) {
			System.out.print(i + "." + iller.get(i) + " ");
			
		}
		System.out.println();
		// Recebin sorusu var
		System.out.println("\n2.Döngü Özel Döngü----------------------");
		
		// (özel döngü)
		int count = 0;
		for (String temp : iller) {
			System.out.print(temp + " ");
			count++;
		}
		System.out.println("sayı: " + count);
		System.out.println("\n3.Iterator Döngü----------------------");
		
		Iterator iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
	}
}
