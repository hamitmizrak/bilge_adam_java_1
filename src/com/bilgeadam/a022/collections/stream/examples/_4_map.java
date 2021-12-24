package com.bilgeadam.a022.collections.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// stream(): akisin basladigi yerdir
// sorted(): siralama
// collect(): muhurluyor
// forEach(): Ekrana listeli gostermek
// filter(): verilerden istediklerimi almak kullaniyoruz

// filterde Lmabda expression kullaniyoruz.
// () = parametre
// -> ok yini
// {}

// Java 10 var deiiikeni

// map: her bir elemani teker teker dolaiarak iilem yapar

public class _4_map {
	
	// Student bir classim olsun datasetlerimiz ekliyelim
	// Verilerin iieriiinde H ile baialayan kai tane Hamit
	// olan verilerden sadece 3 tanesini bana versin
	public static void main(String[] args) {
		List<Student> listem = new ArrayList<Student>();
		listem.add(new Student("Hamit", "Mizrak"));
		listem.add(new Student("Hamit", "Mizrak"));
		listem.add(new Student("Hamit", "Mizrak"));
		listem.add(new Student("Hamit1", "Mizrak"));
		listem.add(new Student("Hamit2", "Mizrak"));
		listem.add(new Student("Hamit3", "Mizrak"));
		listem.add(new Student("Hamit4", "Mizrak"));
		
		List<String> listem2 = listem.stream().map(Student::getAdi).filter(tp -> tp.startsWith("Hamit")).limit(55)
				.collect(Collectors.toList());
		listem2.forEach(System.out::println);
		
	}
	
}
