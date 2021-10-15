package com.bilgeadam.a022.collections.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LÝSTE:LAV:
// LinkedList : Araya yerleþme ve Silme
// ArrayList : Ekleme veya arama
// Vector

// KÜME: SET: HLT Tekrarsýz verileri
// HashSet: karýþýk verileri ekliyord
// LinkedHashSet:eklediðimiz sýrada görüyoruz
// TreeSet: küçükten büyüye

// Map: HHLT
// <K,V>
// HashMap
// LinkedHashMap
// TreeMap
public class _1_forEach {
	public static void main(String[] args) {
		String[] dizi = { "Adana", "Nevþehir", "Ýstanbul", "Muþ" };
		// Diziyi Liste çevirdik
		List<String> listem_0 = Arrays.asList(dizi);
		//////////////////////////////////////////////
		List<String> listem = Arrays.asList("Adana", "Nevþehir", "Ýstanbul", "Muþ");
		/////////////////////////////////////////////
		List<String> listem2 = new ArrayList<String>();
		listem2.add("Adana");
		listem2.add("Nevþehir");
		listem2.add("Ýstanbul");
		listem2.add("Muþ");
		listem2.stream().forEach(System.out::print);
		System.out.println("\n//////////");
		listem2.forEach(System.out::print);
		
	}
}
