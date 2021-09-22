
package com.bilgeadam.a003.cast;

import java.util.Scanner;

// kullanıcıdan alınan String sayı verisinin Karesinin karekök hesaplayan
// algoritma yapalım ?
public class Examples_015_cast1 {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		String userNumber = klavye.nextLine();
		// int castNumber = Integer.valueOf(userNumber);
		int castNumber = Integer.parseInt(userNumber);
		// System.out.println(castNumber * 2);
		System.out.println(Math.sqrt(Math.pow(castNumber, 2)));
		
	}
	
}
