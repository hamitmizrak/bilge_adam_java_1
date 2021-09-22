
package com.bilgeadam.a002.datatypes;

import java.util.Scanner;

// Kullanıcıda Girilen pozitif bir sayının Tek mi Çift mi olduğunu bulan
// ve sürekli kullanıcıdan sayı isteyen ve girilen sayılardan eğer kullanıcı -1
// sonsuz döngüden Çıkış olsun
public class Examples_009_TekMiCiftMi {
	// String ,Math ,Örneği
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		// sonsuz döngü
		while (true) {
			System.out.println("\nLütfen bir sayı giriniz");
			int sayi = klavye.nextInt();
			
			if (sayi == -1) {
				System.out.println("Sistemden çıkış sağlanıyor ... ");
				System.exit(0);
			} else {
				if (sayi >= 0) {
					if (sayi % 2 == 0) {
						System.out.println("\nÇift Sayıdır");
					} else {
						System.out.println("Tek Sayıdır");
					}
				} else {
					System.out.println("Negatif sayı girdiniz lütfen pozitif giriniz.");
				}
			}
			
		}
		
	}
	
}
