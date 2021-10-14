package com.bilgeadam.a014.classs.exceptionhandling;

public class _2ArrayIndexOfOutBoundsExcepitonTutorials {
	public static void main(String[] args) {
		// 0 1 2 3 4
		int[] dizi = new int[5];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
		}
		
		// forEach
		for (int temp : dizi) {
			System.out.print(dizi[temp] + " ");
		}
		System.out.println("");
		try {
			// olmayan dizinin elemanına erişmeye çalışıyorsunuz
			System.out.println(dizi[5]);
		} catch (ArrayIndexOutOfBoundsException aib) {
			aib.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program devam ediyor 2222 ");
		
	}
}
