package com.bilgeadam.a012.date.person2;

import java.io.Serializable;
import java.time.LocalDate;

public class Male extends Person implements Serializable, IPersonCommon {
	private static final long serialVersionUID = -1143082575050463539L;
	
	// özellikler
	private String workHard;
	private String power;
	
	public Male() {
		// TODO Auto-generated constructor stub
	}
	
	public Male(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate, String workHard, String power) {
		super(personId, personName, personSurname, personGender, retiredDate, nowDate);
		this.workHard = workHard;
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "Male [workHard=" + workHard + ", power=" + power + ", getPersonId()=" + getPersonId()
				+ ", getPersonName()=" + getPersonName() + ", getPersonSurname()=" + getPersonSurname()
				+ ", getPersonGender()=" + getPersonGender() + ", getRetiredDate()=" + getRetiredDate()
				+ ", getNowDate()=" + getNowDate() + ", getLogsDate()=" + getLogsDate() + "]";
	}
	
	// Method
	
	// getter and setter
	public String getWorkHard() {
		return workHard;
	}
	
	public void setWorkHard(String workHard) {
		this.workHard = workHard;
	}
	
	public String getPower() {
		return power;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public void personLive() {
		System.out.println("Erkekler Yaşar: " + Lady.class);
		
	}
	
	@Override
	public void personEat() {
		System.out.println("Erkekler Yer: " + Lady.class);
		
	}
	
}
