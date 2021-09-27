package com.bilgeadam.a013.arrays;

// aynı türdeki verileri bir yerde tutmak için kullanıyoruz.
// eleman sayısı bellidir.
public class Ders_001_Single_Array {
	
	public static void main(String[] args) {
		
		// tek boyutlu ve 5 elemanlı dizi oluşturdum.
		// diziler sıfırıncı(0) indisten başlar
		// dizilerde for döngüsünde lenght kullanalım.
		// 5-1=4
		int[] dizi = new int[7]; // 7-1=6
		
		dizi[0] = 44;
		dizi[4] = 11;
		dizi[3] = 45;
		dizi[5] = 55;
		dizi[6] = 66;
		// dizi[8] = 88;
		
		// iterative döngüsü
		// debug
		// length() ==> String
		// length ==> Diziler
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		// forEach döngüsü
		
	}
}
