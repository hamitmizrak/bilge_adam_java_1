package com.bilgeadam.a022.collections.stream2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _2_sorted {
	// fake data
	static List<Student> fakeList = Arrays.asList(new Student(10, "adi1", "soyadi1"), new Student(2, "adi2", "soyadi2"),
			new Student(3, "adi3", "soyadi3"), new Student(4, "adi4", "soyadi4"), new Student(5, "adi4", "soyadi5"));
	
	public static void main(String[] args) {
		// küçükten büyüğe doğru
		List<Student> realList = fakeList.stream().sorted(Comparator.comparingInt(Student::getStudentId))
				.collect(Collectors.toList());
		realList.forEach(System.out::println);
		System.out.println("************************************************************************************");
		// büyükten küçüğe doğru
		List<Student> realList2 = fakeList.stream().sorted(Comparator.comparingInt(Student::getStudentId).reversed())
				.collect(Collectors.toList());
		realList2.forEach(System.out::println);
		
		System.out.println("************************************************************************************");
		
		List<Student> realList3 = fakeList.stream().sorted(Comparator.comparing(Student::getStudentSurname))
				.collect(Collectors.toList());
		realList3.forEach(System.out::println);
		
	}
}
