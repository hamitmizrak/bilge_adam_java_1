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
// 145
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
	
	// sayı 1
	public int sayi1() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 1.sayıyı  giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	// sayı 2
	public int sayi2() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 2. sayıyı  giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	// 2 sayı arasıdaki en büyüğü bulan
	public void buyuk() {
		int sayi1 = sayi1();
		int sayi2 = sayi2();
		
		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " büyüktür");
		} else {
			System.out.println(sayi1 + " küçüktür");
		}
	}
	
	// 2 sayı arasıdaki en küçüğü bulan
	public void kucuk() {
		int sayi1 = sayi1();
		int sayi2 = sayi2();
		
		if (sayi1 < sayi2) {
			System.out.println(sayi1 + " küçüktür");
		} else {
			System.out.println(sayi1 + " büyüktür");
		}
	}
	
	// çift sayı tek sayı
	public void tekCift() {
		int sayi1 = sayi1();
		if (sayi1 % 2 == 0) {
			System.out.println("çift sayıdır");
		} else {
			System.out.println("Sayı tektir");
			
		}
	}
	
	// Kullanıcı tarafından girilen kelimenin içindeki a harflerini sayan algoritma
	// 1-) dış dünyada bir şeyler gönderecek miyim ?
	// 2-) dış dünyadan metoda birşeyler geliyor mu ?
	
	// abc
	public String scannerVocabulary() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		return kelime;
	}
	
	public void vowelLetter(String cemil) {
		int count = 0;
		for (int i = 0; i < cemil.length(); i++) {
			if (cemil.charAt(i) == 'a') {
				count++;
			}
		}
		
		System.out.println("a sayısı: " + count);
	}
	// Java By pass value mi ? java by pass referances mi dir?
	// örneklerini vererek açıklayalım ?
	
	// Köklerini bulan aolgoritma f(x) diskriminant örneği ?
	
	// kullanıcının girmiş olduğu a,b,c ve x için Fonksiyon hesaplaması yapa
	// f(x)=ax^2+bx+c Math ?
	// f(x) diskriminant örneği ?
	
	public static void functionExam(int a, int b, int c, int x) {
		double result = a * Math.pow(x, 2) + b * x + c;
		System.out.println(result);
	}
	
	public static int sayi11() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("sayıyı giriniz");
		int value = klavye.nextInt();
		return value;
	}
	
	public static void sukru() {
		int a = sayi11();
		int b = sayi11();
		int c = sayi11();
		int x = sayi11();
		System.out.println(functionExam2(a, b, c, x));
	}
	
	public static double functionExam2(int a, int b, int c, int x) {
		double result = a * Math.pow(x, 2) + b * x + c;
		return result;
	}
	
	// 15 ekim
	public static void main(String[] args) {
		sukru();
	}
	
}
