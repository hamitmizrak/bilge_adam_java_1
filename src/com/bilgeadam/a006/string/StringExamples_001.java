package com.bilgeadam.a006.string;

import java.util.Scanner;

// kullanıcının girmiş olduğu bir kelimenin;
// eleman sayısını ?
// bütün karakterleri küçük yapsın
// bütün karakterleri büyük yapsın
// başı a ile başlıyorsa evet a ile başlıyor
// sonu a ile bitiyorsa evet a ile bitiyor
// 0 -10 arasındaki bize göstersin sonuna ...
// kelimenin sonuna "Bilge Adam" eklensin
public class StringExamples_001 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		System.out.println("Eleman sayısı: " + kelime.trim().length());
		System.out.println("Büyük : " + kelime.toUpperCase());
		System.out.println("Küçük : " + kelime.toLowerCase());
		
		if (kelime.startsWith("a")) {
			System.out.println("evet a ile başlıyor");
		} else {
			System.out.println("hayır!!!  a ile başlıyor");
		}
		
		// ternary: () ? : ;
		String ends = (kelime.endsWith("a")) ? "evet a ile bitiyor" : "hayır a ile bitiyor";
		System.out.println(ends);
		if (kelime.length() > 10) {
			System.out.println(kelime.substring(0, 10).concat(" ..."));
		}
		
		System.out.println(kelime.concat("Bilge Adam"));
		
	}
}
