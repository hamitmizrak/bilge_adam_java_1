package com.bilgeadam.main;

public class Ders_005_if_elseif_else {
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
		
		// ternary operatör
		String result = (sayi == 1) ? "sayı 1" : "sayı 1 değildir";
		// System.out.println(result);
		
	}
}
