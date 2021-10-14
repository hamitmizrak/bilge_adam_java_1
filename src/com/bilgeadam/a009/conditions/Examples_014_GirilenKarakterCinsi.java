
package com.bilgeadam.a009.conditions;

import java.util.Scanner;

public class Examples_014_GirilenKarakterCinsi {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		boolean isResult = true;
		while (isResult) {
			System.out.println("lütfen bir karakter giriniz");
			String simge;
			simge = klavye.nextLine();
			char karakter = simge.charAt(0);
			
			if (Character.isDigit(karakter)) {
				System.out.println("Bu bir sayıdır");
			} else if (Character.isLetter(karakter)) {
				System.out.println("Bu bir harftir");
			} else {
				System.out.println("Özel simgedir.");
			}
		}
		
	}
	
}
