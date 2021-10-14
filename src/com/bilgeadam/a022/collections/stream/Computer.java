package com.bilgeadam.a022.collections.stream;

public class Computer {
	
	// özellikler
	private int id;
	private String computerName;
	
	// parametresiz constructor
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public Computer(int id, String computerName) {
		this.id = id;
		this.computerName = computerName;
	}
	
	public void computerMethod() {
		System.out.println("ID: " + this.id + " Name: " + this.computerName);
	}
	
	// toString
	@Override
	public String toString() {
		return "Computer [id=" + id + ", computerName=" + computerName + "]";
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
}
