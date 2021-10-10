package com.bilgeadam.a016.oop.computer2.maincart;

import com.bilgeadam.a016.oop.computer2.CommonProperty;

public class MainCart extends CommonProperty {
	// Nesne değişkeni
	protected String price;
	
	// parametresiz constructor
	public MainCart() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public MainCart(String model, String year, String price) {
		super(model, year);
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		return "MainCart [price=" + price + ", model=" + getModel() + ", year=" + getYear() + "]";
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public void deneme2() {
		System.out.println("Önceden Gövdesizdin şimdi Gövdelisin");
		
	}
	
	// Lombok libraries
	
	// Date ,Calendar
	// try catch try-with resources finally{}
	// serileştirme
	// IO
	// Nested Class
	
	// clean code / Mimariler
	
	// design pattern
	// jdbc ==> preparementStatement,statement
	
	// builder , Singleton , Factory
	// Hibernate
	
	// Spring
	// Unit test
}
