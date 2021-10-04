package com.bilgeadam.a014.classs;

import java.util.Scanner;

public class LoginClass {
	
	// özellikler
	private String adi;
	private String soyadi;
	private String email;
	private String telefon;
	
	// constructor:yapıcı metotlardır.
	// constructor: classımızda instance oluşturursak (new)
	// return sevmezler
	// class ismiyle aynıdır.
	// overloading yapabiliriz.
	// biz eğer constructor oluşturmazsak java arka planda kendisi oluşturur.
	// constructor: public olmalıdır. eğer private olursak instance oluşturamayız.
	
	// parametresiz constructor.
	// Ctrl+space
	// default olarak birşeyler yazmak istersek kulalnabiliriz.
	public LoginClass() {
		this.adi = "adınızı girmediniz";
		this.soyadi = "soyadınızı girmediniz";
		this.email = "email girmediniz";
		this.telefon = "telefon girmediniz";
	}
	
	// parametreli constructor
	public LoginClass(String adi, String soyadi, String tel, String email) {
		telefon = tel;
		this.email = email;
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	// adı ve soyadı
	// Overloading
	public LoginClass(String adi, String soyadi) {
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	// getter setter
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefon() {
		return telefon;
	}
	
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	// class metodu
	public void loginClassOrnegi() {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen adınızı giriniz");
		this.adi = klavye.nextLine();
		
		System.out.println("Lütfen soyadınız giriniz");
		this.soyadi = klavye.nextLine();
		
		System.out.println("Lütfen email giriniz");
		this.email = klavye.nextLine();
		
		System.out.println("Lütfen telefon giriniz");
		telefon = klavye.nextLine();
		System.out.println("adınız: " + adi + " soyadınız: " + soyadi + " email: " + email + " telefon: " + telefon);
		
	}
	
	@Override
	public String toString() {
		return "adi=" + adi + ", soyadi=" + soyadi + ", email=" + email + ", telefon=" + telefon;
	}
	
	// toString: Shift+Alt+S
	
}
