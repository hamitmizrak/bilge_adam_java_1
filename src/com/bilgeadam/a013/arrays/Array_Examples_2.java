package com.bilgeadam.a013.arrays;
// kullanıcı taradından girilen satır ,sutun ,simge bütün satır ve sutunları bu
// simkgeye göre dolduracağız.

import java.util.Scanner;

public class Array_Examples_2 {
	public static void starArray() {
		Scanner klavye = new Scanner(System.in);
		String simge;
		int rows, cols;
		String[][] matrix;
		
		System.out.println("Lütfen bir satır sayısını giriniz");
		rows = klavye.nextInt();
		
		System.out.println("Lütfen bir kolon sayısını giriniz");
		cols = klavye.nextInt();
		
		klavye.nextLine();
		System.out.println("Lütfen bir simge giriniz");
		simge = klavye.nextLine();
		matrix = new String[rows][cols];
		
		// bütün eleman sayısı
		//
		
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {// sutun
				
				matrix[i][j] = simge;
				
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {// sutun
				System.out.println(matrix[i][j]);
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		starArray();
	}
}
