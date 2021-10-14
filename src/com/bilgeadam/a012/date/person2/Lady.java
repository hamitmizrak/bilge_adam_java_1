package com.bilgeadam.a012.date.person2;

import java.io.Serializable;
import java.time.LocalDate;

public class Lady extends Person implements Serializable, IPersonCommon {
	private static final long serialVersionUID = -7499765821859075892L;
	
	// özellikler
	private String persuade; // ikna
	private String beauty;
	
	// parametresiz
	public Lady() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public Lady(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate, String persuade, String beauty) {
		super(personId, personName, personSurname, personGender, retiredDate, nowDate);
		this.persuade = persuade;
		this.beauty = beauty;
	}
	
	// toString
	@Override
	public String toString() {
		return "Lady [persuade=" + persuade + ", beauty=" + beauty + ", getPersonId()=" + getPersonId()
				+ ", getPersonName()=" + getPersonName() + ", getPersonSurname()=" + getPersonSurname()
				+ ", getPersonGender()=" + getPersonGender() + ", getRetiredDate()=" + getRetiredDate()
				+ ", getNowDate()=" + getNowDate() + ", getLogsDate()=" + getLogsDate() + "]";
	}
	
	// method
	
	// getter and setter
	public String getPersuade() {
		return persuade;
	}
	
	public void setPersuade(String persuade) {
		this.persuade = persuade;
	}
	
	public String getBeauty() {
		return beauty;
	}
	
	public void setBeauty(String beauty) {
		this.beauty = beauty;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public void personLive() {
		System.out.println("Bayanlar Yaşar: " + Lady.class);
		
	}
	
	@Override
	public void personEat() {
		System.out.println("Bayanlar Yer: " + Lady.class);
		
	}
	
}
