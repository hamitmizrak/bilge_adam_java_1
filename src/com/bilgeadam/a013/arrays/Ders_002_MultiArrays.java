package com.bilgeadam.a013.arrays;

public class Ders_002_MultiArrays {
	
	public static void main(String[] args) {
		// multi array
		// 2=satır 3=sutun
		short[][] matrix = new short[3][3];
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[0][2] = 2;
		
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[1][2] = 5;
		
		// satır 0 1=2 kere 0 1 2=3 ==> 2*3=6
		for (int i = 0; i < 3; i++) {// satır
			for (int j = 0; j < 3; j++) {// sutun
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
