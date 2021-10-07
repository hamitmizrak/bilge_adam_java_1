package com.bilgeadam.ornek.atm2;
// özellikler
// Parametresiz constructor
// Parametreli constructor
// toString
// Method
// Getter and setter

import java.util.Date;

public class CommonProperty {
	
	// özellikler
	private String id;
	private Date date;
	
	// Parametresiz constructor
	public CommonProperty() {
		this.date = new Date(System.currentTimeMillis());
	}
	
	// Parametreli constructor
	public CommonProperty(String id) {
		this.id = id;
	}
	
	// toString
	@Override
	public String toString() {
		return "CommonProperty [id=" + id + ", date=" + date + "]";
	}
	
	// Method
	// Getter and setter
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
}
