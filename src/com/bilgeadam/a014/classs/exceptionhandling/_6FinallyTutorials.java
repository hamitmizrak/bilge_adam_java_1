package com.bilgeadam.a014.classs.exceptionhandling;

// try catch throw throws finally
public class _6FinallyTutorials {
	
	public static void main(String[] args) {
		
		// try with resources
		try {
			int a = 3 / 0;
			// System.out.println("kapatılacak: db.close(); ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// kesin kapatılacak olan bileşenleri buraya alırız
			System.out.println("kapatılacak: db.close(); ");
			// socket .close()
		}
	}
	
}
