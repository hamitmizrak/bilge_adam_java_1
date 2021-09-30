package com.bilgeadam.a013.arrays;

//
// Kullanıcı tarafında girilen Tek sayıya kadar ki sayıların diziye atanması ve
// ortancısını bulmak algoritması yazalım?
// 1 2 3 4 5 6 7 8

// 1 2 3 4 5 6 7 8
// (sonterim+ilkterim)/2
// 9/2 =4.5
// 11/2=5.5
// 7/2=3.5

// tamsayı/tamsayı=tamsayı
// tamsayı/virgüllü=virgüllü
public class Array_Examples_1 {
	public static void main(String[] args) {
		// double değerlerimiz nokta koymamız gerekiyor.
		int[] array = { 1, 2, 3, 4, 5 };
		double middleElement = Math.ceil(array.length / 2.0);
		
		System.out.println(middleElement);
		
	}
}
