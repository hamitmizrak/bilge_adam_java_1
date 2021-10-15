package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _2_sorted {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("malatya");
		list.add("istanbul");
		
		list.add("ankara");
		list.add("elazýð");
		
		List<String> list2 = list.stream().sorted().collect(Collectors.toList());
		
		list2.forEach(System.out::println);
		
	}
}
