package com.bilgeadam.a012.date.person2;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
	private static final long serialVersionUID = -5551447999830415212L;
	
	// özellikler
	private long personId;
	private String personName;
	private String personSurname;
	private String personGender; // cinsiyet
	private LocalDate retiredDate; // emeklilik tarihi
	private LocalDate nowDate;
	private String logsDate; // loglama tarihi
	
	// parametresiz constructor
	public Person() {
		this.personId = 0;
	}
	
	// parametreli constructor
	public Person(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate) {
		this.personId = personId;
		this.personName = personName;
		this.personSurname = personSurname;
		this.personGender = personGender;
		this.retiredDate = retiredDate;
		this.nowDate = nowDate;
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personSurname=" + personSurname
				+ ", personGender=" + personGender + ", retiredDate=" + retiredDate + ", nowDate=" + nowDate
				+ ", logsDate=" + logsDate + "]";
	}
	
	// method
	
	// getter and setter
	public long getPersonId() {
		return personId;
	}
	
	public void setPersonId(long personId) {
		this.personId = personId;
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
	
	public String getPersonGender() {
		return personGender;
	}
	
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}
	
	public LocalDate getRetiredDate() {
		return retiredDate;
	}
	
	public void setRetiredDate(LocalDate retiredDate) {
		this.retiredDate = retiredDate;
	}
	
	public LocalDate getNowDate() {
		return nowDate;
	}
	
	public void setNowDate(LocalDate nowDate) {
		this.nowDate = nowDate;
	}
	
	public String getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(String logsDate) {
		this.logsDate = logsDate;
	}
	
}
