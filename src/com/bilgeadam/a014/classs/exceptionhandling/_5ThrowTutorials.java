package com.bilgeadam.a014.classs.exceptionhandling;

// pascal case
// throw: bazen projelerimizde isteyerek istisna oluştururuz ki o istisna
// durumunda kalsın devam etmesin

// try catch throw throws finally
public class _5ThrowTutorials {
	
	public static void main(String[] args) {
		System.out.println("Hata meydana gelsin");
		/*
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 */
		
		throw new ArrayIndexOutOfBoundsException("Burada istisna meydana geldi");
		// System.out.println("Program devam ediyor...");
	}
	
}
