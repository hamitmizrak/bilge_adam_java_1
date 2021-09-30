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
public class Odev_002 {
	
	public static void start(int[] dizi) {
		
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		
		System.out.println("Lütfen satır sayısını giriniz");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz");
		sutun = klavye.nextInt();
		
		int[][] matrix = new int[satir][sutun];
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {
				
				// 00 01 02
				// 10 11 12
				// 20 21 22
				if (i > j) {
					matrix[i][j] = dizi[0];
					System.out.print(matrix[i][j] + " ");
				} else if (i < j) {
					matrix[i][j] = dizi[2];
					System.out.print(matrix[i][j] + " ");
				} else if (i == j) {
					matrix[i][j] = dizi[1];
					System.out.print(matrix[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void arrayNumber() {
		Scanner klavye = new Scanner(System.in);
		int satir, sutun, cevrilmisChar, cevrilmisString;
		String tekSayi;
		char klavyeChar;
		while (true) {
			System.out.println("\nLütfen tek bir sayı giriniz");
			tekSayi = klavye.nextLine();
			
			klavyeChar = tekSayi.charAt(0);
			cevrilmisChar = Integer.parseInt(tekSayi);
			Random rastgele = new Random();
			if ((Character.isDigit(klavyeChar)) && cevrilmisChar % 2 == 1) {
				int bas, orta, son;
				
				int[] dizi = new int[cevrilmisChar];
				for (int i = 0; i < cevrilmisChar; i++) {
					int sayi = rastgele.nextInt(cevrilmisChar) + 1;
					dizi[i] = sayi;
				}
				
				Arrays.sort(dizi);
				for (int temp : dizi) {
					System.out.print(temp + " ");
				}
				
				bas = dizi[0];
				// 1 2 3 4 5 6 7
				// ortanca=(sonterim+ilk terim)/2
				orta = dizi[((dizi[dizi.length - 1] + dizi[0]) / 2) - 1];
				son = dizi[dizi.length - 1];
				System.out.println("\nbaş: " + bas + " orta: " + orta + " son: " + son);
				
				int[] value = { bas, orta, son };
				start(value);
				
				break;
			} else {
				System.out.println("\nSayı veya Tek sayı girmediniz");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		arrayNumber();
	}
}
