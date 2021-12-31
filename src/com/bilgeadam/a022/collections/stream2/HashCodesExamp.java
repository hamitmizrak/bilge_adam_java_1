package com.bilgeadam.a022.collections.stream2;

public class HashCodesExamp {
	
	public static void main(String[] args) {
		String[] dizi = { "Balıkesir", "Van", "Sivas", "Ankara" };
		System.out.println(dizi.hashCode());
		HashCodesExamp each = new HashCodesExamp();
		int uniqueClass = each.hashCode();
		System.out.println(uniqueClass);
		int db = 1175962212;
		if (uniqueClass == db) {
			System.out.println("Evet aynı class");
		} else {
			System.out.println("Hayır");
		}
		
	}
	
}
