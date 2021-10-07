package com.bilgeadam.ornek.atm2;

public class Login {
	
	// özellikler
	private String userName;
	private String userPassword;
	private String userEmailAddress;
	
	// parametresiz constructor
	public Login() {
	}
	
	// parametreli constructor
	// shift+Alt+S
	public Login(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	// parametreli constructor overloading
	public Login(String userName, String userPassword, String userEmailAddress) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmailAddress = userEmailAddress;
	}
	
	// toString
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", userPassword=" + userPassword + ", userEmailAddress="
				+ userEmailAddress + "]";
	}
	
	// getter and setter
	// Shift+Alt+S
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserEmailAddress() {
		return userEmailAddress;
	}
	
	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}
	
}
