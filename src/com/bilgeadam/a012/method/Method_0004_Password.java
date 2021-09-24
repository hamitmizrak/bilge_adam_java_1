package com.bilgeadam.a012.method;

import java.util.Scanner;

// manuel compiler
// GitHub clone
// static
// StringBuilder StringBuffer
// method parametre
// method örneklere devam

// 1-)kullanıcı tarafından kelimeyi girilecek metot yazalım ?
// 2-) kelimeyi tersten yazıdan algoritma
// Bilge
// egliB for () if() charAt()

// 3-)egliB (1 3 5 harfini alalılm) sonuc= elB

// 4-) içerisindeki 'e' sessli harften kaç tane var
// içesindeki 'e' sessli harfini çıkarsın
// lB
//
// 5-)sonuçtan çıkan harfleri alsın farklı metoda verecek ve farklı metotta
// 0<=x<=10 5 bölünebilen sayıları çıkarsın
// lB12346789
public class Method_0004_Password {
	
	// klavyeden girilen kelimeyi alan algoritma
	public static String scannerVocabulary() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz");
		String vocabulary = klavye.nextLine();
		return vocabulary;
	}
	
	// kelimeyi tersten yazıdan algoritma
	public static String reversePassword(String vocabulary) {
		String temp = "";
		for (int i = vocabulary.length() - 1; i >= 0; i--) {
			temp = temp + vocabulary.charAt(i);
		}
		return temp;
	}
	
	// Bilge
	// egliB
	// egliB (1 3 5 harfini alalılm) sonuç;==> elB
	public static String singleLetter(String vocabulary) {
		String temp = "";
		for (int i = 0; i < vocabulary.length(); i++) {
			if (i % 2 == 0) {
				temp += vocabulary.charAt(i);
			}
		}
		return temp;
	}
	
	// kelime içindeki e'leri bulup kaç tane olduğunu ve kelime içindeki e'leri
	// çıkarsın
	
	// elB sonuç==> lB
	// scope
	public static String vowelLetter(String vocabulary) {
		// method için global scope variable
		String temp = "";
		int count = 0;
		for (int i = 0; i < vocabulary.length(); i++) {
			// int sayi; // local scope variable
			if (vocabulary.charAt(i) != 'e') {
				temp += vocabulary.charAt(i);
			} else {
				count++;
			}
		}
		System.out.println("e sayısı: " + count);
		return temp;
	}
	
	// 5-)sonuçtan çıkan harfleri alsın farklı metoda verecek ve farklı metotta
	// 0<=x<=10 5 bölünebilen sayıları çıkarsın
	
	public static String divisibleByNotFive() {
		String temp = "";
		for (int i = 0; i <= 10; i++) {
			if (i % 5 == 0)
				continue;
			else
				temp += i;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		
		// System.out.println(vowelLetter(singleLetter(reversePassword(scannerVocabulary()))));
		// System.out.println(divisibleByNotFive());
		
		// lB
		String value1 = vowelLetter(singleLetter(reversePassword(scannerVocabulary())));
		String value2 = divisibleByNotFive();
		
		// 1-) birleştirme
		String value3 = value1 + value2;
		System.out.println("1.birleşirme:" + value3);
		
		// 2-) birleştirme
		System.out.println("2.birleşirme:" + value1 + value2);
		
		// 3-) birleştirme
		String value4 = value1.concat(value2);
		System.out.println("3.birleşirme:" + value4);
		
		// 4-) birleştirme StringBuilder çok tane veriyi biribirine eklemek için
		// kullanıyoruz.
		StringBuilder builder = new StringBuilder();
		builder.append(value1).append(value2);
		String value5 = builder.toString();
		System.out.println("4.birleşirme:" + value5);
		
		// StringBuilder
		// StringBuffer arqasındaki farklar nelerdir ?
		// synchronized nedir ?
		
		// manuel compiler
		// gitHub clone ?
		// github branch
		// github branchi
		
		// JavaSE
		// GitHub
		// Frondend
		
	}
}