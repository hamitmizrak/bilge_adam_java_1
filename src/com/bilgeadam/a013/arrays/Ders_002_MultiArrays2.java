package com.bilgeadam.a013.arrays;

import java.util.Scanner;

public class Ders_002_MultiArrays2 {
	
	public void arrayStar() {
		// 1.soru
		// kullanıcı tarafından satır ve sutun girilecek
		// kullanıcıdan bir simge alacağız ve simgeyi ekranda gösterecek
		// 2 2
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		String simge = "";
		
		System.out.println("Lütfen bir simge giriniz");
		simge = klavye.nextLine();
		
		System.out.println("Lütfen satır sayısını giriniz");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz");
		sutun = klavye.nextInt();
		
		String[][] matrix = new String[satir][sutun];
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = "*";
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// + +
		// + +
	}
	
	public void arrayNumber() {
	}
	
	public static void main(String[] args) {
		
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
		
	}
}
