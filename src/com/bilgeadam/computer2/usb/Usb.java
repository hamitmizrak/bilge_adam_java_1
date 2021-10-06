package com.bilgeadam.computer2.usb;

import com.bilgeadam.computer2.CommonProperty;

public class Usb extends CommonProperty {
	// nesne değişkenleri
	private String speed = "";
	private String version = "";
	
	// parametresiz constructor
	public Usb() {
		
	}
	
	// parametreli constructor
	public Usb(String model, String year, String speed, String version) {
		super(model, year);
		this.speed = speed;
		this.version = version;
	}
	
	// toString
	@Override
	public String toString() {
		return "Usb [speed=" + speed + ", version=" + version + ", 	model" + getModel() + ", year=" + getYear() + "]";
	}
	
	// super
	@Override
	public void deneme2() {
		System.out.println("");
		
	}
	
	// getter and setter
	public String getSpeed() {
		return speed;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
}
