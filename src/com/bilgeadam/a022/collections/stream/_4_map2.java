package com.bilgeadam.a022.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _4_map2 {
	
	public static int kare(int sayi) {
		if (sayi < 0)
			return 0;
		else
			return sayi * kare(sayi - 1);
		
	}
	
	public static void main(String[] args) {
		// map:Stream içerisindeki verilerin her bir elemanýna eriþim saðlamak ve
		// her birleþen içinde ayrý ayrý iþlemler yapmaya yarar.
		
		// verilen sayýlarýn 2 fazlasýný ekleyip küçükten büyüðe sýralayan
		
		// stream()
		List<Integer> isimler = Arrays.asList(5, 2, 7, 1);
		
		List<Integer> kucuttenBuyuge = isimler.stream().map(temp -> temp + 2).distinct().collect(Collectors.toList());
		kucuttenBuyuge.forEach(System.out::println);
		
	}
}
