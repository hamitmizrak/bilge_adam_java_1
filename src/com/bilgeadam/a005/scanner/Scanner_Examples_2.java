package com.bilgeadam.a005.scanner;

import java.util.Scanner;

// zar atma oyunu
public class Scanner_Examples_2 {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		// Random
		// Devam etmek için herhangi bir tuşa basınız.
		System.out.println("Devam etmek için herhangi bir tuşa basınız.");
		
		// klavye.next();
		klavye.hasNext();
		System.out.println("Devam ediyorum");
	}
}
