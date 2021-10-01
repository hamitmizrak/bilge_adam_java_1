package com.bilgeadam.genel.tekrar;

import java.util.StringTokenizer;

public class Tekrar_1 {
	
	public static void deneme() {
		System.out.println("Merhabalar");
	}
	
	public static void main(String[] args) {
		
		// String
		String kelime = "Java Eğitimi";
		System.out.println(kelime.trim().length());
		System.out.println(kelime.substring(1));
		System.out.println(kelime.substring(0, 5));
		System.out.println("\n\rdeneme");
		
		StringBuilder builder = new StringBuilder();
		builder.append("asd");
		
		StringTokenizer stringTokenizer = new StringTokenizer(kelime, " ");
		// parçalama
		// stringTokenizer
		// split()
		// subString()
		
		// Math
		// Math.floor =aşağı yuvarlama 5.9 ==> 5
		// Math.ceil =yukarı yuvarla 5.1 ==>6
		// Math.round() =hem aşağı hem yukarı 5.4
		
		// cast
		// fL
		// float f1 = 14.55f;
		// long l1 = 54164646L;
		
		int sayi1 = 4;
		Integer sayi2 = sayi1; // boxing
		
		// özel döngü
		// int [] dizi= {4,5,6,7,8,9};
		// for(Object temp :dizi ) {
		// System.out.println(temp);
		// }
		// 1 2 3 4 5 6 7 8 9
		// break; return; continue;
		// for (int i = 1; i < 10; i++) {
		// if (i == 6 ) {
		// continue;
		// }
		// System.out.print(i + " ");
		// }
		
	}
}
