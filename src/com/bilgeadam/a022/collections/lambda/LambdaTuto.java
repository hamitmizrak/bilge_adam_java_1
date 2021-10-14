package com.bilgeadam.a022.collections.lambda;

@FunctionalInterface
interface IZorunlu1 {
	public void deneme1();
}

@FunctionalInterface
interface IZorunlu2 {
	public void deneme2(String adi);
}

@FunctionalInterface
interface IZorunlu3 {
	public int deneme3(int sayi1, int sayi2);
}

public class LambdaTuto {
	
	public static void main(String[] args) {
		IZorunlu1 zorunlu1 = () -> {
			System.out.println("merhabalar zorunlu 1");
		};
		zorunlu1.deneme1();
		
		System.out.println("///////////////////////////////////");
		
		IZorunlu2 zorunlu2 = (temp) -> {
			System.out.println("merhabalar zorunlu 2 " + temp);
		};
		zorunlu2.deneme2("Hamit");
		
		System.out.println("///////////////////////////////////");
		
		IZorunlu3 zorunlu3 = (temp1, temp2) -> temp1 + temp2;
		zorunlu3.deneme3(5, 6);
		
		System.out.println("///////////////////////////////////");
		IZorunlu3 zorunlu4 = (temp1, temp2) -> {
			System.out.println("merhabalar zorunlu 3 " + (temp1 + temp2));
			return temp1 + temp2;
		};
		
		zorunlu4.deneme3(5, 6);
		
	}
	
}
