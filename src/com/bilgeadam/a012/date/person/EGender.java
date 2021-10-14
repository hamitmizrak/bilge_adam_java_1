package com.bilgeadam.a012.date.person;

public enum EGender {
	Bayan(1, "bayan"), Erkek(2, "erkek");
	
	private final int id;
	private final String gender;
	
	private EGender(int id, String gender) {
		this.id = id;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public String getGender() {
		return gender;
	}
	
}
