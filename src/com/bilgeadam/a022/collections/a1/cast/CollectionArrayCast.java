package com.bilgeadam.a022.collections.a1.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionArrayCast {
	// printf ==> Formatter
	// UML diagram
	// jar
	// Collection kýsa hatýrlatma
	// Lambda expression
	// Stream()
	
	// Diziyi Listeye çeviren metot
	public static List<String> arrayToList(String[] array) {
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(array);
		return list;
	}
	
	// Listeyi Diziye çeviren
	public static String[] listToArray(List<String> list) {
		String[] array = new String[list.size()];
		return list.toArray(array);
	}
	
	public static void main(String[] args) {
		// diziyi Liste çeviren
		String[] array = { "dizi1", "dizi2" };
		List<String> list = arrayToList(array);
		list.stream().forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		// Listeyi Diziye çeviren
		List<String> list2 = new ArrayList<String>();
		list2.add("list1");
		list2.add("list2");
		String[] array2 = listToArray(list2);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
	
}
