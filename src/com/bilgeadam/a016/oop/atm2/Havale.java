package com.bilgeadam.a016.oop.atm2;

// özellikler
// Parametresiz constructor
// Parametreli constructor
// toString
// Method
// Getter and setter
public class Havale extends CommonProperty {
	
	// özellikler
	// Shift+alt+R
	private String havaleSerial;
	private String havaleAmount;
	
	// Parametresiz constructor
	public Havale() {
	}
	
	// Parametreli constructor
	public Havale(String id, String havaleSerial, String havaleAmount) {
		super(id);
		this.havaleSerial = havaleSerial;
		this.havaleAmount = havaleAmount;
	}
	
	// toString
	@Override
	public String toString() {
		return "Eft" + ",ID: " + getId() + "eftName=" + havaleSerial + ", havaleAmount=" + havaleAmount + ", date="
				+ getDate();
	}
	
	// getter and setter
	public String getEftName() {
		return havaleSerial;
	}
	
	public void setEftName(String eftName) {
		this.havaleSerial = eftName;
	}
	
	public String getHavaleAmount() {
		return havaleAmount;
	}
	
	public void setHavaleAmount(String havaleAmount) {
		this.havaleAmount = havaleAmount;
	}
	
}
