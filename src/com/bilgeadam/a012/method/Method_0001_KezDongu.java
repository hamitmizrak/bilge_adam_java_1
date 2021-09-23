package com.bilgeadam.a012.method;

import java.util.Scanner;

// kullanıcı tarafından girilen sayıya kadar ekranda gösteren metot
// 8 0 1 2 3 4 5 6 7 8
public class Method_0001_KezDongu {
	
	public static void result() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen sınır sayısını giriniz");
		int number = klavye.nextInt();
		for (int i = 0; i <= number; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		result();
	}
	
}
