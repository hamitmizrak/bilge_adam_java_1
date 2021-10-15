package com.bilgeadam.a022.collections.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// stream(): akýsýn basladigi yerdir
// sorted(): sýralama
// collect(): muhurluyor
// forEach(): Ekrana listeli gostermek
// filter(): verilerden istediklerimi almak kullanýyoruz

// filterde Lmabda expression kullanýyoruz.
// () = parametre
// -> ok yönü
// {}

// Java 10 var deðiþkeni

public class _3_filter {
	
	public static void main(String[] args) {
		
		List<String> orginalList = new ArrayList<String>();
		orginalList.add("malatya");
		orginalList.add("malatya");
		orginalList.add("malatya");
		orginalList.add("nevþehir");
		orginalList.add("malatya");
		orginalList.add("bitlis");
		for (int i = 0; i < orginalList.size(); i++) {
			System.out.println(orginalList.get(i));
		}
		
		System.out.println();
		String search = "malatya";
		// listenin içindeki geçen malatyalarý gösterin
		List<String> listem = orginalList.stream().filter((temp) -> "malatya".equals(temp))
				.collect(Collectors.toList());
		listem.forEach(System.out::println);
		System.out.println(listem.size() + " tane eleman var");
		System.out.println("");
		
		// listenin içindeki geçen malatyalarý olmasýn
		List<String> listem2 = orginalList.stream().filter((Ali) -> "malatya".equals(Ali)).collect(Collectors.toList());
		listem2.forEach(System.out::println);
		System.out.println(+listem2.size() + " tane eleman var");
		
	}
	
}
