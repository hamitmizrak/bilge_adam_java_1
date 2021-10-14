package com.bilgeadam.a012.date.person;

import java.time.LocalDate;

// bayan: ikna etmek
// bayan: güzellik
public class Lady extends Person implements IPersonCommon {
	private static final long serialVersionUID = 6530158646409364497L;
	
	private String persuade; // ikna
	private String beauty;
	
	public Lady() {
		// TODO Auto-generated constructor stub
	}
	
	public Lady(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate, String persuade, String beauty) {
		super(personId, personName, personSurname, personGender, retiredDate, nowDate);
		this.persuade = persuade;
		this.beauty = beauty;
	}
	
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
		System.out.println(" Bayanlar Yaşar" + Lady.class);
		
	}
	
	@Override
	public void personEat() {
		System.out.println(" Bayanlar Yer" + Lady.class);
		
	}
	
}
