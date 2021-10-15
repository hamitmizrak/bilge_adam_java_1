package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3_filter {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("malatya");
		list.add("istanbul");
		list.add("ankara");
		list.add("elazýð");
		
		// filter Lambda kullanmak
		// listede malatya olanlarý göster
		List<String> list2 = list.stream().filter((temp) -> "malatya".equals(temp)).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		// listede malatya olmayanlarý göster
		List<String> nonMalatya = list.stream().filter(temp -> !"malatya".equals(temp)).collect(Collectors.toList());
		System.out.println(nonMalatya);
		list.forEach(System.out::println);
		
		// Classta Ahmet ile baþlayan ilk 3 kaydý getirelim
		List<FilterStudent> filterMap = new ArrayList<FilterStudent>();
		filterMap.add(new FilterStudent("Ahmet", "mavi"));
		filterMap.add(new FilterStudent("Ahmet", "sari"));
		filterMap.add(new FilterStudent("Ahmet", "truncu"));
		filterMap.add(new FilterStudent("Ahmet", "eflatun"));
		filterMap.add(new FilterStudent("Ahmet5", "sari"));
		filterMap.add(new FilterStudent("Mehmet", "yesil"));
		filterMap.add(new FilterStudent("Mustafa", "turuncu"));
		
		List<String> mapList = filterMap.stream().map(FilterStudent::getAdi).filter(adi -> adi.startsWith("Ahmet"))
				.limit(3).collect(Collectors.toList());
		mapList.forEach(System.out::println);
		
	}
}
