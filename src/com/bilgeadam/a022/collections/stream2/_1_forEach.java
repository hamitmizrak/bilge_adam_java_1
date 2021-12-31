package com.bilgeadam.a022.collections.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_forEach {
	
	public static void main(String[] args) {
		
		String[] dizi = { "Balıkesir", "Van", "Sivas", "Ankara" };
		List<String> listem = Arrays.asList(dizi);
		
		// 1-)forEach
		listem.stream().forEach(System.out::print);
		System.out.println("************");
		
		// 2-) sorted() sıralama için kullanıyoruz.
		List<String> listem2 = listem.stream().sorted().collect(Collectors.toList());
		listem2.forEach(System.out::print);
		System.out.println("************");
		
		// 3-) limit sıralama için kullanıyoruz.
		List<String> listem3 = listem.stream().sorted().limit(2).collect(Collectors.toList());
		listem3.forEach(System.out::print);
		System.out.println("************");
		
		String isim = "Van";
		// 4-) limit sıralama için kullanıyoruz.
		List<String> listem4 = listem.stream().filter((Van) -> isim.equals(Van)).collect(Collectors.toList());
		listem4.forEach(System.out::print);
		
	}
	
}
