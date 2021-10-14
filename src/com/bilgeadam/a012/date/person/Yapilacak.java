package com.bilgeadam.a012.date.person;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Yapilacak {
	// .gitignore
	// git merge
	// composition
	// abstraction ,inheritance,polymorphism
	// Date
	// Calendar
	// time
	
	// marketler zinciri
	
	// 2012 yerine 112 gösterir +1900 ekliyorsun
	public static void main(String[] args) {
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy", locale);
		
		Calendar calendar = Calendar.getInstance();
		String str5 = dateFormat.format(calendar.getTime());
		System.out.println("str555: " + str5);
		
		calendar.set(Calendar.YEAR, 2021);
		// calendar.set(1919, 4, 19);
		
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		// System.out.println(calendar.getTime().getTime()); // epoch time
		
		System.out.println();
		int yil = calendar.get(Calendar.YEAR);
		System.out.println("yılım: " + yil);
		int ay = calendar.get(Calendar.MONTH);
		System.out.println("ayim: " + ay);
	}
}
