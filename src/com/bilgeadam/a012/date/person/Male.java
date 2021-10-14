package com.bilgeadam.a012.date.person;

import java.time.LocalDate;

// erkek: çok çalışmak
// erkek: güç
public class Male extends Person implements IPersonCommon {
	private static final long serialVersionUID = -1690584880784770464L;
	
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
		return "Male [workHard=" + workHard + ", power=" + power + "]";
	}
	
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
		System.out.println(" Erkekler Yaşar" + Male.class);
		
	}
	
	@Override
	public void personEat() {
		System.out.println(" Erkekler Yer" + Male.class);
		
	}
	
}
