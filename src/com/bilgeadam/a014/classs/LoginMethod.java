package com.bilgeadam.a014.classs;

import java.util.Scanner;

// login sayfası olsun.
// kullanıcıdan alığımız bilgiler ışığında yapalım.
// adi
// soyadi
// email
// telefon numarasını 2 şekilde yapalım.,
// method ile yapalım ==> loginMethod
// class ile yapalım ==> loginClass
public class LoginMethod {
	
	public void loginMethodOrnegi() {
		Scanner klavye = new Scanner(System.in);
		String adi, soyadi, email, telefon;
		
		System.out.println("Lütfen adınızı giriniz");
		adi = klavye.nextLine();
		
		System.out.println("Lütfen soyadınız giriniz");
		soyadi = klavye.nextLine();
		
		System.out.println("Lütfen email giriniz");
		email = klavye.nextLine();
		
		System.out.println("Lütfen telefon giriniz");
		telefon = klavye.nextLine();
		System.out.println("adınız: " + adi + " soyadınız: " + soyadi + " email: " + email + " telefon: " + telefon);
		
	}
}
