
package com.bilgeadam.a001.operator;

import java.util.Scanner;

// Java 17 gelen özellikler

// Kullanıcı manuel olarak 5 tane sayı girsin ve bu sayıların ortlamasını bulsun
public class Examples_008_OrtalamaHesası3 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi, toplam = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". sayıyı giriniz");
			sayi = klavye.nextInt();
			toplam = toplam + sayi;
		}
		toplam = (toplam) / 5;
		System.out.println("ortalama: " + toplam);
		klavye.close();
	}
}
