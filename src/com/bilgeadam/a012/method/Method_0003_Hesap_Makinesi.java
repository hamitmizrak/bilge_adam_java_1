package com.bilgeadam.a012.method;

import java.util.Scanner;

// kullanıcı tarafından girilen 2 sayıyı hesaplama yapsın
// 1.toplama
// 2.çarpma
// 3.çıkarma
// 4.bölme
// 5.kalan

// ödev-1 kullanıcı tarafından girilen iki sayının hesap Makine bulan algoritma
// ödev-2 kullanıcı tarafından girilen iki sayının üslü sayı bulan algoritma
// ödev-3 kullanıcı tarafından girilen bir sayının karekök bulan algoritma
// ödev-4 kullanıcı tarafından girilen 2 sayıyının büyüğü bulan örnek
// ödev-5 kullanıcı tarafından girilen 2 sayıyının küçüğü bulan örnek
// ödev-6 kullanıcı tarafından girilen sayıyını tek mi çift mi
// ödev-7 kullanıcı tarafından kelimeyi tersten yazıdan algoritma ?
// ödev-8 kullanıcı tarafından kelimeyi içerisindeki a harf sayısını bulan alg ?
// ödev-9 kullanıcı tarafından kelimeyi içerisindeki a harfleri e çeviren alg ?
// ödev-10 kullanıcı tarafından girilen bir sayının faktöriyeli bulan örnek
// ödev-11 kullanıcı tarafından girilen bir sayının asal olup olmadığını bulan
// ödev-12 kullanıcı tarafından girilen bir sayının yatay atış örneği bulan
// ödev-12 kullanıcı tarafından girilen bir sayının basamak sayıları bulan alg?
// ödev-13 1-10 arasındaki fibonacci sayıları bulan örnek algoritma
// ödev-14 kullanıcı tarafından girilen bir sayının armstrong olup olmadığını
// bulan örnek algoritma
public class Method_0003_Hesap_Makinesi {
	
	// hesap makinasi metodu
	public void hesapMakinasi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("lütfen 1.sayı giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("lütfen 2.sayı giriniz");
		sayi2 = klavye.nextInt();
		
		System.out.println("toplama" + (sayi1 + sayi2));
		System.out.println("çıkarma " + (sayi1 - sayi2));
		System.out.println("çarpma " + (sayi1 * sayi2));
		System.out.println("bölme: " + (sayi1 / sayi2));
		System.out.println("kalan: " + (sayi1 % sayi2));
	}
	
	// üslü sayı
	public void usluSayi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("lütfen alt  giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("lütfen üst giriniz");
		sayi2 = klavye.nextInt();
		System.out.println(Math.pow(sayi1, sayi2));
	}
	
	// karekök
	public void karekokSayi() {
		Scanner klavye = new Scanner(System.in);
		double sayi1;
		System.out.println("lütfen bir sayı  giriniz");
		sayi1 = klavye.nextInt();
		System.out.println(Math.sqrt(sayi1));
	}
	
	public int sayi1() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 1.sayıyı  giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	public int sayi2() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 2. sayıyı  giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	public void buyuk() {
		int sayi1 = sayi1();
		int sayi2 = sayi2();
		
		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " büyüktür");
		} else {
			System.out.println(sayi1 + " küçüktür");
		}
		
	}
	
}
