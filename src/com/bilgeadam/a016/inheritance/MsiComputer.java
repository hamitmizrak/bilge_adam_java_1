package com.bilgeadam.a016.inheritance;
// ozellikler
// parametresiz constructor
// parametreli constructor
// toString
// method
// getter and setter

// this
// super
// MsiComputer ait özellikler

public class MsiComputer extends Computer {
	
	// ozellikler
	private String msiSensor;
	
	// Shift+Alt+S
	// parametresiz constructor
	
	// this
	// 1-)Global erişim sağlamak
	// 2-)constructurları çağırmak
	
	public MsiComputer() {
		super.setComputerMainCart("asd");
		super.deneme();
	}
	
	static {
		
	}
	
	public void denbeme() {
		
	}
	
	public MsiComputer(String computerName) {
		this("1.parametre", "2.parametre", "3.parametre");
	}
	
	public MsiComputer(String computerName, String computerMainCart) {
		
	}
	
	public MsiComputer(String computerName, String computerMainCart, String param) {
		
	}
	
	// parametreli constructor
	public MsiComputer(String computerName, String computerSerialNumber, String computerMainCart, String msiSensor) {
		// üst atadaki bilgileri almak için kulolandığımız bilgiler
		super(computerName, computerSerialNumber, computerMainCart);
		
		// global değişkenlere erişim
		this.msiSensor = msiSensor;
		
	}
	
	// toString
	@Override
	public String toString() {
		return "MsiComputer [msiSensor=" + msiSensor + ", getComputerName()=" + getComputerName()
				+ ", getComputerSerialNumber()=" + getComputerSerialNumber() + ", getComputerMainCart()="
				+ getComputerMainCart() + "]";
	}
	
	// method
	// Shift+Alt+S
	@Override
	public void deneme() {
		super.deneme();
		System.out.println("Msi computer");
	}
	// getter and setter
	
	public String getMsiSensor() {
		return msiSensor;
	}
	
	public void setMsiSensor(String msiSensor) {
		this.msiSensor = msiSensor;
	}
	
}
