package com.bilgeadam.a008.switchcase;

public class Ders_006_switch_Case {
	public static void main(String[] args) {
		// if else
		int sayi = 9;
		
		if (sayi == 5)
			System.out.println("sayı 5");
		else if (sayi == 3)
			System.out.println("sayı 3");
		else if (sayi == 2)
			System.out.println("sayı 2");
		else if (sayi == 1)
			System.out.println("sayı 1");
		else if (sayi == 7)
			System.out.println("sayı 7");
		else if (sayi == 6) {
			System.out.println("sayı 6 ");
			System.out.println("sayıyı niye bulamadın ?");
		} else {
			System.out.println("9 yoktur");
		}
		
		// caDDe:
		switch (sayi) {
			case 5: {
				System.out.println("sayı 5 ");
			}
			case 3: {
				System.out.println("sayı 3 ");
			}
			case 2: {
				System.out.println("sayı 2 ");
			}
			case 1: {
				System.out.println("sayı 1 ");
			}
			default:
				System.out.println("Farklı bir sayı türü girdiniz");
		}
		
	}
}
