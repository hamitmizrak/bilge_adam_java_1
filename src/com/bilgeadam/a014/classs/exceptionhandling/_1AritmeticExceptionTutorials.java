package com.bilgeadam.a014.classs.exceptionhandling;

public class _1AritmeticExceptionTutorials {
	
	// java by pass value
	// java by pass referances
	public static void sendEmail(Exception e) {
		System.out.println("Mail: " + _1AritmeticExceptionTutorials.class + e);
	}
	
	public static void main(String[] args) {
		// try catch throw throws finally
		
		// bir sayıyı/sıfıra bölmek=tanımsız (sonsuz)
		// istisnamız
		// 100: aritmetikException
		// try with resources
		
		// java.lang
		// object
		// throwable
		// 1-exception 2-error
		try {
			int sayi = 0 / 3;
			System.out.println(sayi);
		} catch (NullPointerException np) {
			sendEmail(np);
		} catch (ArithmeticException ai) {
			sendEmail(ai);
		} catch (Exception e) {
			sendEmail(e);
		}
		
		// 999.satırda
		// 1000
		System.out.println("Program devam ediyor...");
		
	}
}
