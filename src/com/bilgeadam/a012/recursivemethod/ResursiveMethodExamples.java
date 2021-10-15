package com.bilgeadam.a012.recursivemethod;

public class ResursiveMethodExamples {
	// recursive: kendi kendine çaðýran metotlara denir.
	// 5*4*3*2*1
	public static int factoriyel(int sayi) {
		if (sayi == 1)
			return 1;
		else
			return (sayi * factoriyel(sayi - 1));
		// 4*3*2*1
	}
	
	// ilk 5 tane sayý toplamýný
	// iterative method: bilgisayarý yormaz ancakk fazla kod yazarýz
	public static void iterativeSum(int sayi) {
		int toplam = 0;
		for (int i = 0; i <= sayi; i++) {
			toplam += i;
		}
		System.out.println("toplam: " + toplam);
	}
	
	// recursive method: bilgisayarý yorar ancak az kod yazarýz.
	public static int recursiveSum(int sayi) {
		if (sayi > 0) {
			return sayi + recursiveSum(sayi - 1);
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// int result = factoriyel(5);
		// System.out.println(result);
		iterativeSum(5);
		
		int result2 = recursiveSum(5);
		System.out.println("toplam:" + result2);
	}
	
	// araþtýrma
	// fibonacciyi iterative -recursive
	// 1 <=x<=15 arasýdan toplama yapsýn bunu iterative -recursive
	
	// senkron:Görevler sýrayla devam eder.
	// asenkron: ayný anda birden fazla processin çalýþmasýdýr.
	
	// Stream()
	
}
