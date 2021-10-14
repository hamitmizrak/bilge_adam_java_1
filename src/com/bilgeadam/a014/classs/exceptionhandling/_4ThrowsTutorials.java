package com.bilgeadam.a014.classs.exceptionhandling;

import java.io.IOException;

public class _4ThrowsTutorials {
	
	// mimarisini:
	// bu metottta meydana gelebilecek istisna durumlarını belirteyim sonrasında bu
	// metotu kullanan kişiler kullansın.
	
	// IOS Android C# Java Python
	public static void deneme() throws IOException, ArithmeticException, NullPointerException, Exception {
		int sayi = 0 / 3;
		System.out.println(sayi);
		System.out.println("Program devam ediyor 2222 ");
	}
	
	// try catch throws throw
	public static void deneme5() {
		try {
			deneme();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
