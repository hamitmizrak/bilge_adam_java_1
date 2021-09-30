package com.bilgeadam.a005.scanner;

import java.util.Scanner;

public class Homework_001 {
	public static void main(String[] args) {
		int rows, cols;
		String character;
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen satır sayısını giriniz");
		rows = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz");
		cols = klavye.nextInt();
		
		//eğer alt satırı yazmazsak simgeyi göstermiyecektir.
		//klavye.nextLine();
		
		System.out.println("Lütfen bir simge giriniz");
		character = klavye.nextLine();
		
		System.out.println("sutun: " + rows + " satır: " + cols + " simge: " + character);
		
	}
}
