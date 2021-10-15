package com.bilgeadam.a022.collections.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _5_genel {
	public static void main(String[] args) {
		
		// bu elemanla 5 ekleyin
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5).stream().map(xyz -> xyz + 5).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
	}
}
