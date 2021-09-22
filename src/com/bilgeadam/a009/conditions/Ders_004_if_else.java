package com.bilgeadam.a009.conditions;

public class Ders_004_if_else {
	public static void main(String[] args) {
		// if else
		int sayi = 9;
		
		if (sayi == 1)
			System.out.println("sayı 1");
		else
			System.out.println("sayı 1 değildir");
		
		// ternary operatör
		String result = (sayi == 1) ? "sayı 1" : "sayı 1 değildir";
		System.out.println(result);
		
	}
}
