package com.bilgeadam.a006.string;

import java.util.Scanner;

import com.bilgeadam.util.SabitVeri;

public class StringLesson2Login {
	
	// sonsuz döngü içinde
	// Klavyeden girilen email ve şifreyi sistemden kontrol edecek
	// şifre ve mail doğruysa admin sayfasına yönlendiriliyorsunuz.
	// şifre ve mail yanlışsa 4 kere yanlış hakkımız kartınız bloke oldu
	// müşteri hizmetlerini arayınız 444 555 99622
	
	// equals equalsIgnoreCase trim() replace()
	// Kullanıcının şifresini mask(maskaleme)
	
	// döngü kullanalım.
	
	// mask : ***
	// String kelime = "bilge adam";
	// String kelime2 = "BIlgE ADam";
	//
	// if (kelime.equals(kelime2)) {
	// System.out.println("aynı kelimeleri girdiniz");
	// } else {
	// System.out.println("farklı kelimeler");
	// }
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Scanner klavye2 = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		
		// static
		String dbEmail = SabitVeri.DB_EMAIL;
		String dbPassword = SabitVeri.DB_PASSWORD;
		
		// ters için değişkenler
		String value, reverseValue = "";
		
		// kaç tane harf var
		String valueA = "", searchLetter = "";
		int countA = 0;
		
		double number1, number2;
		
		// hakkınız:4
		int attempt = 4, chooise;
		
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
				
				System.out.println("Lütfen 1. sayıyı giriniz");
				number1 = klavye.nextDouble();
				
				System.out.println("Lütfen 2. sayıyı giriniz");
				number2 = klavye.nextDouble();
				
				while (true) {
					System.out.println("1-)toplama\n2-)çıkarma\n3-)Bölme\n4-)Çarpma\n5-)Üslü sayı");
					System.out.println("6-)Ters\n7-)harf sayısı\n8-)değiştirme\n0-)Çıkış");
					System.out.println("lütfen tercihinizi yapınız");
					chooise = klavye.nextInt();
					
					// caDDe:
					switch (chooise) {
						case 1:
							System.out.println("Toplam sonucu: " + (number1 + number2));
							break;
						case 2:
							System.out.println("Çıkarma sonucu: " + (number1 - number2));
							break;
						case 3:
							System.out.println("Bölme sonucu: " + (number1 / number2));
							break;
						case 4:
							System.out.println("Çarpma sonucu: " + (number1 * number2));
							break;
						case 5:
							System.out.println("üslü sayı: " + (Math.pow(number1, number2)));
							break;
						
						case 6:
							System.out.println("Lütfen Bir kelime giriniz");
							value = klavye2.nextLine();
							
							// // abc
							// // cba
							// //son elemana erişmek için: value.length()-1
							// 3 2 1 0 -1
							for (int i = value.length() - 1; i >= 0; i--) {
								// reverseValue = reverseValue + value.charAt(i);
								reverseValue += value.charAt(i);
							}
							System.out.println("Cümlenin ilk hali: " + value);
							System.out.println("Cümlenin son hali: " + reverseValue);
							break;
						// nevşehir
						case 7:
							System.out.println("Lütfen Bir kelime giriniz");
							valueA = klavye2.nextLine();
							
							System.out.println("Lütfen aramak istediğiniz harf giriniz");
							searchLetter = klavye2.nextLine();
							
							// nevşehir
							for (int i = 0; i < valueA.length(); i++) {
								if (valueA.charAt(i) == searchLetter.charAt(0)) {
									countA++;
								} else {
									System.out.println("aradığınız harf yoktur");
								}
							}
							
							// Scanner char String kullanabiliyoruz.
							System.out.println(searchLetter.charAt(0) + " sayısı: " + countA);
							
						case 8:
							System.out.println("Lütfen Bir kelime giriniz");
							String valueChange = klavye2.nextLine().toLowerCase();
							String newValue = "";
							
							// ş
							System.out.println("değiştirmek istediğiniz harfi giriniz");
							String changeLetterOld = klavye2.nextLine();
							
							// s
							System.out.println("değiştirilecek harfi giriniz");
							String changeLetterNew = klavye2.nextLine();
							
							// nevşehir
							for (int i = 0; i < valueChange.length(); i++) {
								if (valueChange.charAt(i) == changeLetterOld.charAt(0)) {
									newValue = valueChange.replace((valueChange.charAt(i)),
											(changeLetterNew.charAt(0)));
								}
							}
							System.out.println("ilk hali: " + valueChange);
							System.out.println("değişmiş hali: " + newValue);
							
							break;
						default:
							System.out.println("Lütfen belirtilen aralıkta sayı giriniz");
							break;
					}
					
				}
				
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
