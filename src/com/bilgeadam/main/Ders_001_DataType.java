package com.bilgeadam.main;

public class Ders_001_DataType {

	public static void main(String[] args) {

		// tamsayılar: b<s<i<l
		// byte < short < int <long
		// virgüllü sayı: float,double
		// boolean true,false
		// char

		// tamsayılarda: defaultta int
		// virgüllü sayılarda: defaultta double

		// cast: fL

		// tam sayı
		int degiskenAdi0 = 144444;
		System.out.println(degiskenAdi0);

		long degiskenAdi = 14444444444L;
		System.out.println(degiskenAdi);

		// virgullu sayılar
		float virgulluSayi = 14.44f;
		System.out.println(virgulluSayi);

		double virgulluSayi2 = 14.44;
		System.out.println(virgulluSayi2);

		// boolean
		boolean b1 = false;
		b1 = 4 > 1;
		b1 = -1 < 9;
		System.out.println(b1);
		// escape character ==> \

		// char
		char c1 = '\u4585'; // 䖅
		System.out.println(c1);

	}

}
