package com.bilgeadam.a022.collections.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_Sorted {
	public static void main(String[] args) {
		
		// sorted: küçükten büyüðe sýralama
		// collect: gunun sonuda verileri paketle liste olarak göster (Yemegi
		// muhurledim)
		List<String> listem = Arrays.asList("malatya", "nevþehir", "elazýð", "bitlis").stream().sorted()
				.collect(Collectors.toList());
		
		listem.forEach(System.out::println);
		System.out.println();
		System.out.println();
		Arrays.asList("malatya", "nevþehir", "elazýð", "bitlis").stream().sorted().collect(Collectors.toList())
				.forEach(System.out::println);
		String[] kelime = { "malatya", "nevþehir", "elazýð", "bitlis" };
		Arrays.asList(kelime).stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
	}
}
