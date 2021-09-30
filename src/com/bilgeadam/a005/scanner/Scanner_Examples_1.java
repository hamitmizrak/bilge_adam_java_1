package com.bilgeadam.a005.scanner;

import java.util.Scanner;

public class Scanner_Examples_1 {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int number1, number2;
		String name;
		
		System.out.println("Lütfen bir sayı giriniz");
		number1 = klavye.nextInt();
		
		System.out.println("Lütfen ikinci sayı giriniz");
		number2 = klavye.nextInt();
		
		klavye.nextLine();
		
		System.out.println("Lütfen adınızı giriniz");
		name = klavye.nextLine();
		
		System.out.println("sayı1: " + number1 + " sayı2: " + number2 + " adınız: " + name);
	}
}
