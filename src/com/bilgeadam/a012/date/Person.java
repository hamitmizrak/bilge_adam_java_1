package com.bilgeadam.a012.date;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// enum EGender2 {
// Erkek, Bayan;
// }

// bean class
// serileştirme:veri kaybını olmasını istemiyorsak
// ram belleğin boyutu bitti , Harddisk kullanıyor

// Person Nesnesi: Bayanlar Erkekler
// Bayanlar class
// Erkekler class
// Bayanlar ve Erkeklerin genel ortak özellikleri (inheritance abstract) ID
// logsDate
// interface : Bayanalar ve Erkeklerdeki metotları implements ederek

public class Person implements Serializable {
	
	// Bu classa özgü unique(eşsiz benzersiz bir ID)
	private static final long serialVersionUID = 74825710741368843L;
	
	// özellikler
	private long personId;
	private String personname;
	private String personsurName;
	private String personGender;
	private Date dateOfBirth; // 65. 1 ocak tarih
	private Date logsDate = new Date(System.currentTimeMillis());
	
	// parametresiz constructor
	public Person() {
		this.personId = 0;
		this.personname = "ad girilmedi";
		this.personsurName = "ad girilmedi";
	}
	
	// parametreli constructor
	public Person(long personId, String personname, String personsurName, String personGender, Date dateOfBirth) {
		this.personId = personId;
		this.personname = personname;
		this.personsurName = personsurName;
		this.personGender = personGender;
		this.dateOfBirth = dateOfBirth;
		
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personname=" + personname + ", personsurName=" + personsurName
				+ ", personGender=" + personGender + ", dateOfBirth=" + dateOfBirth + ", logsDate=" + logsDate + "]";
	}
	
	// method
	public static List<Person> personInformation() {
		Scanner klavye = new Scanner(System.in);
		String name, surname, gender, stringToDate;
		Date dateOfBirth;
		
		// eğer global yapıyı localde göstereceksekm bana ilk başlangıç değerini ister
		List<Person> list = null;
		
		try {
			System.out.println("Lütfen adınızı giriniz.");
			name = klavye.nextLine();
			System.out.println("Lütfen soyadınızı giriniz.");
			surname = klavye.nextLine();
			System.out.println("Lütfen cinsiyetinizi giriniz.");
			gender = klavye.nextLine();
			System.out.println("Lütfen doğum yılını giriniz.");
			stringToDate = klavye.nextLine();
			
			// String olan bir yapıyı Date cast ettim
			Locale locale = new Locale("tr", "TR");
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", locale);
			Date date = new Date();
			
			String toDate = simpleDateFormat.format(date);
			System.out.println("yılım:  " + Integer.parseInt(toDate));
			
			Person person = new Person(1, name, surname, gender, null);
			list = new ArrayList<Person>();
			list.add(person);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void dateTimeYear(int year) {
		String gender = "Bayan";
		int simdikiZamandan = 2021 - year;
		
		if (gender.equals("Bayan")) {
			System.out.println(simdikiZamandan);
		} else {
			
		}
	}
	
	// calculate
	public static void personRetirementAgeCalculate(List<Person> list) {
		List<Person> newList = list;
		
		// stream()
		// newList.stream().forEach(System.out::println);
		
		Date date = newList.get(0).dateOfBirth;
		System.out.println(date);
		System.out.println(date.getYear());
		
		///////////////////////////////////////////////////////////////
		// Strem().forEach();
		// list.stream().forEach(System.out::println);
		
		// list.stream().forEach(temp->temp.)
		// System.out.println(newList.get(0).dateOfBirth.getYear());
		// System.out.println(newList.get(0).dateOfBirth.getYear());
		
		// listeden Person nesnesinin özelliklerine erişeceğim.
		
	}
	
	public static void main(String[] args) {
		personRetirementAgeCalculate(personInformation());
	}
	
	// getter and setter
	public long getPersonId() {
		return personId;
	}
	
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	public String getPersonname() {
		return personname;
	}
	
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	
	public String getPersonsurName() {
		return personsurName;
	}
	
	public void setPersonsurName(String personsurName) {
		this.personsurName = personsurName;
	}
	
	public String getPersonGender() {
		return personGender;
	}
	
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	// Tarih gelmiyor
	public Date getLogsDate() {
		return this.logsDate;
	}
	
}
