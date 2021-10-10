package com.bilgeadam.a016.oop.atm2;

import java.util.Scanner;

import com.bilgeadam.util.SabitVeri;

public class StringExamplses_002 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		
		// static veri çağırdım Ctrl+Mouse left click
		String dbEmail = SabitVeri.DB_EMAIL;
		String dbPassword = SabitVeri.DB_PASSWORD;
		
		// hakkınız:4
		int attempt = 4;
		
		while (attempt >= -1) {
			System.out.println("\nLütfen Kullanıcı email giriniz");
			userEmail = klavye.nextLine().trim();
			System.out.println("\nLütfen Kullanıcı şifrenizi giriniz");
			userPassword = klavye.nextLine().trim();
			
			for (int i = 0; i < userPassword.length(); i++) {
				maskString = maskString + "*";
			}
			System.out.println("Maskelenemiş şifre:" + maskString);
			
			if ((userEmail.equals(dbEmail)) && (userPassword.equals(dbPassword))) {
				System.out.println("Admin sayfasına yönlendiriliyorsunuz");
			} else {
				System.out.println("Email veya şifre yanlış girdiniz");
				System.out.println("kalan hakkınız: " + (attempt - 1));
				
				if (attempt == 1) {
					System.out.println(
							"4 kere yanlış hakkımız kartınız bloke oldu müşteri hizmetlerini arayınız 444 555 99622");
					// System.exit(0);
					break;
				}
				attempt--;
			}
		}
		
	}
	
}
