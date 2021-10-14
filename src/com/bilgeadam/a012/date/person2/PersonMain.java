package com.bilgeadam.a012.date.person2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class PersonMain {
	// global özellikler
	private static int count = 0;
	private static Scanner klavye = new Scanner(System.in);
	
	// method
	public static void personGenereal() {
		Person person = new Person();
		int birthYear = 0, birthMonth = 0, birthDay = 0;
		try {
			System.out.println("Lütfen adınızı giriniz");
			person.setPersonName(klavye.nextLine());
			
			System.out.println("Lütfen soyadınız giriniz");
			person.setPersonSurname(klavye.nextLine());
			
			System.out.println("Lütfen doğum yılınız giriniz");
			birthYear = klavye.nextInt();
			
			System.out.println("Lütfen doğum ayınız giriniz");
			birthMonth = klavye.nextInt();
			
			System.out.println("Lütfen doğum gününü giriniz");
			birthDay = klavye.nextInt();
			
			// klavye okumasını doğru yapsın diye yazdık
			klavye.nextLine();
			
			for (EGender name : EGender.values()) {
				System.out.println(name);
			}
			
			System.out.println("Lütfen cinsiyetinizi giriniz");
			person.setPersonGender(klavye.nextLine());
			
			// deadLock
			
			if (person.getPersonGender().equals(EGender.Erkek.toString())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(birthYear + 65, birthMonth, birthDay));
				person.setNowDate(LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DAY_OF_MONTH)));
				
				Male male = new Male(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "çok çalışma", "güç");
				differenceBetweenDate(male);
			} else if (person.getPersonGender().equals(EGender.Bayan.name())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(birthYear + 60, birthMonth, birthDay));
				person.setNowDate(LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DAY_OF_MONTH)));
				
				Lady lady = new Lady(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "çok ikna edici", "çok güzeldir");
				differenceBetweenDate(lady);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// diğer metot
	// Bu metotta göndereceğim parametre Lady Lady'e göre Male Male'e göre işlme
	// yapmamız lazım
	
	private static void differenceBetweenDate(Object object) {
		// C.D.I
		// object Male classından mı türetilmiş
		if (object instanceof Male) {
			// casting: Object
			Male male = (Male) object;
			Period different = Period.between(male.getNowDate(), male.getRetiredDate());
			System.out.println("Emekliliğinize kalan süre: " + different.getYears() + " yıl " + different.getMonths()
					+ " ay " + different.getDays() + " gün");
		} else if (object instanceof Lady) {
			// casting: Object
			Lady male = (Lady) object;
			Period different = Period.between(male.getNowDate(), male.getRetiredDate());
			System.out.println("Emekliliğinize kalan süre: " + different.getYears() + " yıl " + different.getMonths()
					+ " ay " + different.getDays() + " gün");
		}
		
	}
	
	public static void main(String[] args) {
		personGenereal();
	}
}
