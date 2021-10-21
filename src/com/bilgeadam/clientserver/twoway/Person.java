package com.bilgeadam.clientserver.twoway;

import java.util.Date;

public class Person {
	// özellikler
	private int id;
	private String personName;
	private String personSurname;
	private Date logsDate;
	
	// parametresiz constructor
	public Person() {
		this.personName = "Mehmet";
		this.personSurname = "Mýzrak";
		this.logsDate = new Date(System.currentTimeMillis());
	}
	
	// parametreli constructor
	public Person(int id, String personName, String personSurname) {
		this.id = id;
		this.personName = personName;
		this.personSurname = personSurname;
		this.logsDate = new Date(System.currentTimeMillis());
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", personSurname=" + personSurname + ", logsDate="
				+ logsDate + "]";
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPersonSurname() {
		return personSurname;
	}
	
	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}
	
	public Date getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(Date logsDate) {
		this.logsDate = logsDate;
	}
	
}
