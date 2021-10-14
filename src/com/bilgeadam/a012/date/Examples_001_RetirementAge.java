package com.bilgeadam.a012.date;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// serileştirme
// try catch
// composition
// date
// abstraction: interface+abstract
// inheritance
// polymorphism

// lambda
// stream()
// IO

// 2.Örnek
// Genel
// Çalışma Hayatım EDevlet
// Kullanıcıdan Adı soyad doğum tarihi cinsiyet B - E ( Gün/ay/Yıl girsin)
// Bunun içinden yılı alsın
// Erkeklerde 65 yaş
// bayanlarda 60 yaş

// Emekliliğine kalan süresiniz?

// methodları
// Class Emeklilik : ID, Adı Soyadı ,Doğum tarihi
// try catch
// static
// enum B - E
// date

// composition
// abstraction
// inheritance
// lombok kütüphanesi
// calendar

public class Examples_001_RetirementAge {
	public List<Person> deneme() {
		String name, surname, gender;
		Date dateOfBirth;
		name = "asd";
		surname = "sd";
		gender = "E";
		dateOfBirth = null;
		
		Person person = new Person(1, name, surname, dateOfBirth);
		List<Person> listem = new ArrayList<Person>();
		listem.add(new Person(1, name, surname, dateOfBirth));
		return listem;
	}
	
}
