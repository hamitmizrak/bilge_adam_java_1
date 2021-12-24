package com.bilgeadam.a013.arrays.filter;

import java.util.Arrays;
import java.util.List;

public class MainTest {
	
	public static void main(String[] args) {
		Student student1 = new Student(1, "Ahmet1", "Miraç1");
		Student student2 = new Student(2, "Ahmet2", "Miraç2");
		Student student3 = new Student(3, "Ahmet3", "Miraç3");
		Student student4 = new Student(4, "Ahmet4", "Miraç4");
		
		List<Student> list = Arrays.asList(student1, student2, student3, student4);
		
		for (Student temp : list) {
			if (temp.getId() >= 3) {
				System.out.println(temp);
			}
		}
	}
}
