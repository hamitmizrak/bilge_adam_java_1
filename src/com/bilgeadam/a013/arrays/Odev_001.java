package com.bilgeadam.a013.arrays;

import java.util.Scanner;

// 1.soru
// kullanıcı tarafından satır ve sutun girilecek
// kullanıcıdan bir simge alacağız ve simgeyi ekranda gösterecek
// 2 2
public class Odev_001 {
	public static void arrayStar() {
		
		Scanner klavye = new Scanner(System.in);
		int satir, sutun;
		String simge = "";
		System.out.println("Lütfen bir simge giriniz");
		simge = klavye.nextLine();
		
		System.out.println("Lütfen satır sayısını giriniz");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz");
		sutun = klavye.nextInt();
		
		klavye.nextLine();
		
		String[][] matrix = new String[satir][sutun];
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = simge;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// + +
		// + +
	}
	
	public static void main(String[] args) {
		
		arrayStar();
		
	}
}
