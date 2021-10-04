package com.bilgeadam.a013.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 2.soru
// kullanıcı tarafından satır ve sutun girilecek (Satır ve sutun aynı olmak
// zorunda)
// random olarak Tek elemanlı sayı girilsin
// 1 2 3 4 5
// ortasında sayı: diagonal
// sayılardan büyük olanı diagonal üstüne gelecek
// sayılardan küçük olanı diagonal alta gelecek
// satırlardan en büyüğü
// satırlardan en küçüğü
// satır toplamı
// satır toplamı

// 3 5 5 5
// 1 3 5 5
// 1 1 3 5
// 1 1 1 3

public class Array_Examples_4 {
	// 8 =lütfen tek sayı giriniz
	// /=lütfen tek sayı giriniz
	public static void arrayNumber() {
		Scanner klavye = new Scanner(System.in);
		String tekSayi;
		char klavyeChar;
		int cevrilmisChar = 0;
		// BAUtils
		
		// döngüyü kullanıcı tek sayı ve simge girmeyene kadar döngü devam etsin
		while (true) {
			System.out.println("\nLütfen tek bir sayı giriniz.");
			tekSayi = klavye.nextLine();
			
			// isDigit için String to char
			klavyeChar = tekSayi.charAt(0);
			
			Random rastgele = new Random();
			
			// cast ==> String to int
			if ((Character.isDigit(klavyeChar))) {
				cevrilmisChar = Integer.parseInt(tekSayi);
				if ((Character.isDigit(klavyeChar)) && (cevrilmisChar % 2 == 1)) {
					int bas, orta, son;
					
					// kullanıcı tek sayı girdiği yer örneğin: 5 elemanlı sayı
					int[] dizi = new int[cevrilmisChar];
					
					// 1 6 9 3 2 5 7
					
					for (int i = 0; i < cevrilmisChar; i++) {
						// 1 ile kullanıcının girdiği sayıya kadar üst indis olacak
						int sayi = rastgele.nextInt(cevrilmisChar) + 1;
						dizi[i] = sayi;
					}
					
					// 1 2 3 5 6 7
					Arrays.sort(dizi);
					
					// forEach
					for (int temp : dizi) {
						System.out.print(temp + " ");
					}
					
					bas = dizi[0];
					son = dizi[dizi.length - 1];
					// (soneleman+ilkeleman)/2
					orta = dizi[(dizi[dizi.length - 1] + dizi[0]) / 2];
					System.out.println("\nbaş: " + bas + " orta: " + orta + " son: " + son);
					int[] value = { bas, orta, son };
					startArray(value);
					break;
				} else {
					System.out.println("\nÇift sayı girdiniz Tek sayı girmediniz. ");
				}
			} else {
				System.out.println("Lütfen simge girmeyiniz");
			}
			
		}
		
	}
	
	public static void startArray(int[] value) {
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		
		System.out.println("Lütfen satır sayısı giriniz");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısı giriniz");
		sutun = klavye.nextInt();
		
		int[][] matrix = new int[satir][sutun];
		
		// üste kalan i<j
		// alta kalan i>j
		// i=j diagonal
		
		// 00 01 02
		// 10 11 12
		// 20 21 22
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i > j) {
					// en küçüğü
					matrix[i][j] = value[0];
					System.out.print(matrix[i][j] + " ");
				} else if (i < j) {
					// en büyüğü
					matrix[i][j] = value[2];
					System.out.print(matrix[i][j] + " ");
				} else if (i == j) {
					// en büyüğü
					matrix[i][j] = value[1];
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		arrayNumber();
	}
	
}
