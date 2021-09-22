package com.bilgeadam.a012method;

// scope
// method
// static sınıf değişkenleri
// overloading
public class Methods {
	
	// 1- voidli parametresiz
	public static void voidliParametresiz() {
		System.out.println("Ben voidli parametresiz metodum");
	}
	
	// 2- voidli parametreli
	public static void voidliParametreli(String adiSoyadi) {
		System.out.println(adiSoyadi);
	}
	
	// overloading : parametre sayıları farklı olan metotlara denir.
	public static void voidliParametreli(String adiSoyadi, String diller) {
		System.out.println(adiSoyadi);
	}
	
	// 3-) voidsiz parametresiz
	public static String voidsizParametresiz() {
		
		return "Malatya";
	}
	// Overloading
	
	// 4-) voidsiz parametreli
	// int =dış dünyaya bir şeyler göndermek için
	// (int sayi1, int sayi2) = dış dünyadan birşeyler almak
	// return geriye dönderir.
	public static int voidsizParametreli(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// overloading
	
	public static void main(String[] args) {
		voidliParametresiz();
		
		voidliParametreli("Hamit Mızrak");
		
		String adi = voidsizParametresiz();
		System.out.println(adi);
		System.out.println(voidsizParametresiz());
		
		int toplam = voidsizParametreli(4, 6); // 4 ve 6 argümandır
		System.out.println(toplam);
	}
}
