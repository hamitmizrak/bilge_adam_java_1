package com.bilgeadam.a012.date.person;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bilgeadam.a014.classs.exceptionhandling.KendiExcepitonOlusturmak;

// wilcard
// The method differenceBetweenDates(Class<?>) in the type PersonMain is not
public class PersonMain {
	// Eğer kullanıcı sayı girmezse ikinci döngüde altsatıra geçsin diye oluşturuldu
	private static int count = 0;
	private static Scanner klavye = new Scanner(System.in);
	
	// hangi onjeyi gönderirsem onu alsın
	public static void differenceBetweenDates(Object object) {
		if (object instanceof Male) {
			Male male = (Male) object;
			Period different = Period.between(male.getNowDate(), male.getRetiredDate());
			System.out.println("Emekliliğize kalan süre: " + different.getYears() + " yıl: " + different.getMonths()
					+ " Ay: " + different.getDays() + " Gün ");
		} else if (object instanceof Lady) {
			Lady lady = (Lady) object;
			Period different = Period.between(lady.getNowDate(), lady.getRetiredDate());
			System.out.println("Emekliliğize kalan süre: " + different.getYears() + " yıl: " + different.getMonths()
					+ " Ay: " + different.getDays() + " Gün ");
		}
		
		personMaleInformation();
	}
	
	// Erkek metodu
	public static void personMaleInformation() {
		try {
			Person person = new Person();
			System.out.println("Lütfen adınızı giriniz.");
			if (count != 0) {
				klavye.nextLine();
			}
			
			person.setPersonName(klavye.nextLine());
			System.out.println("Lütfen soyadınızı giriniz.");
			person.setPersonSurname(klavye.nextLine());
			
			int yearBirth = 0, monthBirth = 0, dayBirth = 0;
			System.out.println("Lütfen doğum yılınızı");
			yearBirth = klavye.nextInt();
			
			System.out.println("Lütfen doğum ay");
			monthBirth = klavye.nextInt();
			System.out.println("Lütfen doğum gün");
			dayBirth = klavye.nextInt();
			
			klavye.nextLine();
			System.out.println("Lütfen cinsiyetini giriniz Erkek Bayan");
			person.setPersonGender(klavye.nextLine());
			
			// EGender.Erkek.toString()
			// EGender.Erkek.name();
			if (person.getPersonGender().equals(EGender.Erkek.toString())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(yearBirth + 65, monthBirth, dayBirth));
				person.setNowDate(LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DAY_OF_MONTH)));
				Male male = new Male(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "güç", "güç2");
				differenceBetweenDates(male);
			} else if (person.getPersonGender().equals(EGender.Bayan.name())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(yearBirth + 60, monthBirth, dayBirth));
				person.setNowDate(LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DAY_OF_MONTH)));
				Lady lady = new Lady(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "güzellik", "güzellik");
				differenceBetweenDates(lady);
			}
			// InputMismatchException:eğer sayı girilmezse
		} catch (InputMismatchException e) {
			System.out.println("\nLütfen sayı giriniz\n");
			++count;
			
			personMaleInformation();
		} catch (NullPointerException e) {
			System.out.println("Boş değer giriniz");
			personMaleInformation();
		} finally {
			klavye.close();
		}
		
		// yıl ay gün
		
	}
	
	public static void main(String[] args) throws ParseException, KendiExcepitonOlusturmak {
		// mainMethod();
		personMaleInformation();
		throw new KendiExcepitonOlusturmak("hatam");
		
	}
	
}
