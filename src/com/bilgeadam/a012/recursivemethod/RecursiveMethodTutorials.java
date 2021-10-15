package com.bilgeadam.a012.recursivemethod;

public class RecursiveMethodTutorials {
	
	public static int squareOf(int N) {
		if (N == 0) {
			return 1;
		} else if (N == 1) {
			return N;
		} else {
			return (N * squareOf(N));
		}
	}
	
	// fatöriyel hesabý
	public static int faktoriyel(int sayi) {
		if (sayi == 1) {
			return 1;
		} else {
			return (sayi * faktoriyel(sayi - 1));
		}
	}
	
	// ilk 5 sayý toplamýný yapan recursive method
	public static int sum(int sayi) {
		if (sayi > 0) {
			return sayi + sum(sayi - 1);
		} else {
			return 0;
		}
		
	}
	
	// 0 1 1 2 3 5 8 13 24
	// ilk 4 fibonacci göster
	public static int n1 = 0, n2 = 1, n3 = 0;
	
	public static void fibonacci(int sayi) {
		if (sayi > 0) {
			n3 = n1 + n2;// ilk iki sayý toplamý
			n1 = n2; // n2 veri kaybolmasýn diye
			n2 = n3;
			
			System.out.print(n3 + " ");
			fibonacci(sayi - 1);
		}
	}
	
	// verielen iki sayý arasýndaki toplamýný yapan recursive method
	public static int araToplam(int start, int end) {
		if (end > start) {
			return end + araToplam(start, end - 1);
		} else {
			return end;
		}
	}
	
	public static void main(String[] args) {
		// int son = faktoriyel(4);
		// System.out.println(son);
		
		// int toplam = sum(5);
		// System.out.println(toplam);
		
		// fibonacci(4);
		
		// int result = araToplam(1, 3);
		// System.out.println(result);
		
		int karesi = squareOf(4);
		System.out.println(karesi);
	}
	
}
