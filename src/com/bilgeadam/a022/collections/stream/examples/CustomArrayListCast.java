package com.bilgeadam.a022.collections.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayListCast {
	// Array'i List'e �evirdim.
	public static void main(String[] args) {
		System.out.println("Array'i Liste  �evirdim");
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Mara�" };
		List<String> list = arrayToList(dizi);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n**************************");
		
		System.out.println("List'i Array'e  �evirdim");
		List<String> list2 = new ArrayList<String>();
		list2.add("Malatya");
		list2.add("Sivas");
		list2.add("Edirne");
		list2.add("Mara�");
		
		String[] dizi2 = listToArray(list2);
		for (String temp : dizi2) {
			System.out.print(temp + " ");
		}
		System.out.println("\n+++++++++++");
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		
	}
	
	// List'i Array'e cevirmek
	private static String[] listToArray(List<String> list2) {
		String[] inArray = new String[list2.size()];
		return list2.toArray(inArray);
	}
	
	// arrayi listeye çevirmek
	private static List<String> arrayToList(String[] dizi) {
		List<String> list = new ArrayList<String>();
		return Arrays.asList(dizi);
	}
}
