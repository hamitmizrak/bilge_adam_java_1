package com.bilgeadam.a014.classs.exceptionhandling;

import java.util.Scanner;

public class HamitMizrakException extends Exception {
	private static final long serialVersionUID = 936824622060108991L;
	
	public HamitMizrakException(String errorMessage) {
		super(errorMessage);
	}
	
	public static void main(String[] args) throws HamitMizrakException {
		System.out.println("Kendi istisna durumunu yaptım");
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen pozitif sayı girinz ");
		int sayi = klavye.nextInt();
		
		if (sayi < 0) {
			throw new HamitMizrakException("Number istisnası");
		} else {
			System.out.println("girdiğiniz sayı: " + sayi);
		}
		
		// System.out.println("devam ediyor");
	}
	
}
