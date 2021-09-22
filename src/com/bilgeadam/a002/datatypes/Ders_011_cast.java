package com.bilgeadam.a002.datatypes;

public class Ders_011_cast {
	public static void main(String[] args) {
		
		System.out.println((4 + 4) + "Merhabalar");
		System.out.println("Java " + " servlet");
		System.out.println(4 + " servlet");
		
		// cast:
		// String "4" 4
		
		// fL
		float f1 = 14.5f;
		long l1 = 55151515L;
		// byte short int long
		
		// küçükten büyüğe
		byte b1 = 127;
		short s1 = b1;
		
		// Büyükten küçüğe
		byte b2 = (byte) l1;
		
		// 1.ADIM
		// String bir yapıyı tam sayıya çevirme
		String sayi1 = "4";
		// valueOf ==>
		// parseInt ==>
		int yeniSayi = Integer.valueOf(sayi1);
		int yeniSayi2 = Integer.parseInt(sayi1);
		
		int sayi2 = 6;
		System.out.println(sayi1 + sayi2);
		System.out.println(yeniSayi + sayi2);
		System.out.println(yeniSayi2 + sayi2);
		
		// 2.ADIM
		// tamsayıyı String çevirmek.
		int sayi5 = 44;
		String sayi6 = String.valueOf(sayi5);
		String sayi8 = Integer.toString(sayi5);
		
		int sayi7 = 16;
		System.out.println(sayi5 + sayi7);
		System.out.println(sayi6 + sayi7);
		
		// kullanıcıdan alınan String sayı verisinin Karesinin karekök hesaplayan
		// algoritma Math
		
	}
}
