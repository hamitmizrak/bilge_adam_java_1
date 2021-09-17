
package com.bilgeadam.examples;

import java.util.Scanner;

// Kullanıcı manuel olarak 5 tane sayı girsin ve bu sayıların ortlamasını bulsun
public class Examples_008_OrtalamaHesası2 {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2, sayi3, sayi4, sayi5, toplam = 0;
		System.out.println("1. sayıyı giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("2. sayıyı giriniz");
		sayi2 = klavye.nextInt();
		System.out.println("3. sayıyı giriniz");
		sayi3 = klavye.nextInt();
		System.out.println("4. sayıyı giriniz");
		sayi4 = klavye.nextInt();
		System.out.println("5. sayıyı giriniz");
		sayi5 = klavye.nextInt();
		toplam = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5;
		System.out.println("ortalama: " + toplam);
		
	}
	
}
