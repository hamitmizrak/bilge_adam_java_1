
package com.bilgeadam.a001.operator;

import java.util.Scanner;

/*
 * 1=pazartesi
 * 2=
 * 3=
 * 4=
 * 5=
 * 6=
 * 7=pazar
 */
public class Examples_007_HaftaninGunleri {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen 1-7 arasında  sayı olarak giriniz");
		int gun = klavye.nextInt();
		
		if (gun > 0) {
			switch (gun) {
				case 7:
					System.out.println("Pazar");
					break;
				case 1:
					System.out.println("Pazartesi");
					break;
				case 2:
					System.out.println("salı");
					break;
				case 3:
					System.out.println("çarşamba");
					break;
				case 4:
					System.out.println("perşembe");
					break;
				case 5:
					System.out.println("cuma");
					break;
				case 6:
					System.out.println("cumartesi");
					break;
				
				default:
					System.out.println("Lütfen belirtilen aralıkta sayı giriniz");
					break;
			}
		} else {
			System.out.println("Lütfen sıfırdan büyük sayı giriniz");
		}
		klavye.close();
		
	}
	
}
