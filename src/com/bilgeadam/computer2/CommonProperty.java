package com.bilgeadam.computer2;

// genel ortak özellikler Her şeyin atası
abstract public class CommonProperty {
	
	// özellikler
	protected String model;
	protected String year;
	
	// parametresiz
	public CommonProperty() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public CommonProperty(String model, String year) {
		this.model = model;
		this.year = year;
	}
	
	// toString
	@Override
	public String toString() {
		return "CommonProperty [model=" + model + ", year=" + year + "]";
	}
	
	// gövdeli metot
	public void deneme() {
		System.out.println("Merhabalar ben deneme Gövdeli metot");
	}
	
	// gövdesiz metot
	public abstract void deneme2();
	
	// getter and setter
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
}
