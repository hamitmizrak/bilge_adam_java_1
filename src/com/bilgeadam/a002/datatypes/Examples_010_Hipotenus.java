
package com.bilgeadam.a002.datatypes;

import java.util.Scanner;

// Hipotenüs: a^2+b^2=c^2
// 3*3+4*4=5*5
public class Examples_010_Hipotenus {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2, sonuc;
		System.out.println("Lütfen 1.sayıyı giriniz");
		sayi1 = Math.abs(klavye.nextInt());
		System.out.println("Lütfen 2.sayıyı giriniz");
		sayi2 = Math.abs(klavye.nextInt());
		sonuc = (int) Math.sqrt(((int) Math.pow(sayi1, 2)) + ((int) Math.pow(sayi2, 2)));
		System.out.println(sayi1 + " " + sayi2 + " hipotenüs: " + sonuc);
		
	}
	
}
