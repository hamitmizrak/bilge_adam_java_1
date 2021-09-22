
package com.bilgeadam.a009.conditions;

import java.util.Scanner;

/*
 * klavyeden girilen sayıyı Asal olup olmadığını bulan algoritma
 * Asal olup olmadığını:
 * Kendisine ve 1 bölünüyorsa asal sayıdır.
 * 15 = 1 15 3 5 = asal sayı değildir
 * 5 = 1 5 = asal sayıdır.
 * validaiton:
 * sıfır(0) küçük giremezsin.
 * 2= en küçük asal ve tek çift sayıdır.
 */
public class Examples_015_AsalSayi {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		boolean karar = false;
		while (true) {
			System.out.println("Lütfen bir sayı giriniz.");
			sayi = klavye.nextInt();
			if (sayi <= 1) {
				System.out.println("sıfır veya bir veya sıfırdan küçük sayı giremezsinz");
			} else if (sayi == 2) {
				System.out.println("2 sayısı En küçük asal ve çift sayıdır.");
			} else {
				// asal olup olmadığını: 1 sayının kendisinden
				for (int i = 2; i < sayi; i++) {
					if (sayi % i == 0) {
						karar = true;
					}
				}
				if (karar) {
					System.out.println("asal sayı değildir");
				} else {
					System.out.println("Asal sayıdır");
				}
				
			}
		}
	}
	
}
