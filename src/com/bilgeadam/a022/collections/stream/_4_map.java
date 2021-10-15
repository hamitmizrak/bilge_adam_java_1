package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class _4_map {
	
	// ilk 5 sayý toplamýný yapan recursive method
	public static int sum(int sayi) {
		if (sayi > 0) {
			return sayi + sum(sayi - 1);
		} else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		// map:Stream içerisindeki verilerin her bir elemanýna eriþim saðlamak ve
		// her birleþen içinde ayrý ayrý iþlemler yapmaya yarar.
		
		// verilen sayýlarýn karesini alan metho yapalým
		// 1-)psvm
		// 2-)metot
		// 3-)recursive
		int sayi = sum(5);
		System.out.println(sayi + " ");
		
		// stream()
		List<Integer> isimler = new ArrayList<>();
		isimler.add(1);
		isimler.add(2);
		isimler.add(3);
		isimler.add(4);
		isimler.add(5);
		isimler.stream().map((temp) -> temp * temp).forEach(System.out::println);
		
	}
}
