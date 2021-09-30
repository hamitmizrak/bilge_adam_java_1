package com.bilgeadam.a013.arrays;
// kullanıcı taradından girilen satır ,sutun ,simge bütün satır ve sutunları bu
// simgeye göre dolduracağız.

import java.util.Scanner;

public class Array_Examples_3 {
	public static void starArray() {
		Scanner klavye = new Scanner(System.in);
		String simge;
		int rows, cols, counter = 1;
		String[][] matrix;
		
		System.out.println("Lütfen bir satır sayısını giriniz");
		rows = klavye.nextInt();
		
		System.out.println("Lütfen bir kolon sayısını giriniz");
		cols = klavye.nextInt();
		
		klavye.nextLine();
		
		matrix = new String[rows][cols];
		
		// bütün eleman sayısı
		//
		
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {// sutun
				System.out.println("Lütfen " + counter + ". simgeyi giriniz");
				simge = klavye.nextLine();
				matrix[i][j] = simge;
				counter++;
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) { // satır
			for (int j = 0; j < matrix[i].length; j++) {// sutun
				System.out.print(matrix[i][j]);
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		starArray();
	}
}
