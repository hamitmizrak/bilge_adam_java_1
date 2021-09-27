package com.bilgeadam.a013.arrays;

import java.util.Random;

public class RandomTuto {
	public static void main(String[] args) {
		// Random = rastgele sayılar veren yapıdır.
		
		// 1-) Math = Random
		// 2-) Class düzeyinden olan
		
		// 1-) Math = Random
		// 1<=X<=5 ==> floor kullanırsam
		// Math static bir classtır.
		double rastgeleSayi = Math.floor(Math.random() * 5 + 1);
		System.out.println(rastgeleSayi);
		
		// Class düzeyinde ==> OOP daha yakındır.
		// java.util
		Random rastgeleClass = new Random();
		// 1<=X<=4
		int rastgeleSayi2 = rastgeleClass.nextInt(9) + 1;
		System.out.println(rastgeleSayi2);
		
	}
}
