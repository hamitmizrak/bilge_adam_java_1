package com.bilgeadam.a016.inheritance;

// kalıtım:
// bütün bilgisayardaki ortak özellikler.
// javada extends kaç tane yazabilirsiniz. ?
// single inheritance (1 tane extends yazılır).
public class Computer {
	
	// özellikler
	// encapsulation
	private String computerName = "";
	private String computerSerialNumber = "";
	private String computerMainCart = "";
	
	// parametresiz constructor
	public Computer() {
		
	}
	
	//
	// parametreli constructor
	// Shift+Alt+S
	public Computer(String computerName, String computerSerialNumber, String computerMainCart) {
		this.computerName = computerName;
		this.computerSerialNumber = computerSerialNumber;
		this.computerMainCart = computerMainCart;
	}
	
	// Overloading
	// @Override
	
	// toString
	// Shift+Alt+S
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + ", computerSerialNumber=" + computerSerialNumber
				+ ", computerMainCart=" + computerMainCart + "]";
	}
	
	// method
	public void deneme() {
		System.out.println(this.computerSerialNumber.concat(" .XLS"));
	}
	
	// getter and setter
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getComputerSerialNumber() {
		return computerSerialNumber;
	}
	
	public void setComputerSerialNumber(String computerSerialNumber) {
		this.computerSerialNumber = computerSerialNumber;
	}
	
	public String getComputerMainCart() {
		return computerMainCart;
	}
	
	public void setComputerMainCart(String computerMainCart) {
		this.computerMainCart = computerMainCart;
	}
	
}
