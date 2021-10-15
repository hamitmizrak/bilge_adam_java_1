package com.bilgeadam.a022.collections.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// stream(): akısın basladigi yerdir
// sorted(): sıralama
// collect(): muhurluyor
// forEach(): Ekrana listeli gostermek
// filter(): verilerden istediklerimi almak kullanıyoruz

// filterde Lmabda expression kullanıyoruz.
// () = parametre
// -> ok yönü
// {}

// Java 10 var değişkeni

// map: her bir elemanı teker teker dolaşarak işlem yapar

public class _4_map {
	
	// Student bir classım olsun datasetlerimiz ekliyelim
	// Verilerin içeriğinde H ile başalayan kaç tane Hamit
	// olan verilerden sadece 3 tanesini bana versin
	public static void main(String[] args) {
		List<Student> listem = new ArrayList<Student>();
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit", "Mızrak"));
		listem.add(new Student("Hamit1", "Mızrak"));
		listem.add(new Student("Hamit2", "Mızrak"));
		listem.add(new Student("Hamit3", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		listem.add(new Student("Hamit5", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		listem.add(new Student("Hamit4", "Mızrak"));
		
		List<String> listem2 = listem.stream().map(Student::getAdi).filter(tp -> tp.startsWith("Hamit")).limit(55)
				.collect(Collectors.toList());
		listem2.forEach(System.out::println);
		
	}
	
}
