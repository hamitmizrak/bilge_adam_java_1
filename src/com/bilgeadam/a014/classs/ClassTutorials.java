package com.bilgeadam.a014.classs;

// object:özellikleri
// class: class+class+class ....
// paketler
// Pascla Case: ClassTutorials

// global scope
// local scope
// nesne değişkeni
// class değişkeni

// access modifier:
// public : bonkör her taraftan erişim sağlıyor.
// private: sadece o classta çalışır. getter and setter

// getter and setter
// constructor ==> parametreli,parametresiz
// toString

// inheritance
// polymorphism
// @Override
// Overloading
// final

public class ClassTutorials {
	
	// telefon markası
	// class değişkeni static varsa
	public static String telephoneTrade;
	private double telephonePrice; // nesne değişkeni
	private String telephoneColor;
	private boolean isProduction;
	private int yearOfProduction;
	
	// getter and setter
	// getter: verileri getirmek
	public double getTelephonePrice() {
		return telephonePrice;
	}
	
	// setter: yazmak : camel Case
	// this: global değişkenlere erişim sağlamak için kullanıyoruz
	// v.i.p ==> set
	public void setTelephonePrice(double abc) {
		telephonePrice = abc;
	}
	// Shift+Alt+S
	
	public String getTelephoneColor() {
		return telephoneColor;
	}
	
	public void setTelephoneColor(String telephoneColor) {
		this.telephoneColor = telephoneColor;
	}
	
	public boolean isProduction() {
		return isProduction;
	}
	
	public void setProduction(boolean isProduction) {
		this.isProduction = isProduction;
	}
	
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
	// login sayfası olsun.
	// kullanıcıdan alığımız bilgiler ışığında yapalım.
	// adi
	// soyadi
	// email
	// telefon numarasını 2 şekilde yapalım.,
	// method ile yapalım ==> loginMethod
	// class ile yapalım ==> loginClass
	
}
