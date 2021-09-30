package com.bilgeadam.a013.arrays;

public class Ortanca {
	public static void main(String[] args) {
		int[] dizi = { 1, 2, 3, 4, 5 };
		int orta = (dizi[dizi.length - 1] + dizi[0]) / 2;
		System.out.println(orta);
	}
}
