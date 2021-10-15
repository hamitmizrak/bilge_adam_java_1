package com.bilgeadam.a022.collections.stream.examples;

import java.util.Arrays;

// Java 8
// @FunctionalInterface
// Stream()
// Method referances ::
public class WhatISStream {
	// Stream() Akýþtýr
	// kodlarýmýzý daha az yazmak çok uðraþmamaktýr
	// IO: InputStream() OuttputStream() ile Stream() karýþtýrmayýn
	
	public static void iterativeArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Maraþ" };
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
	}
	
	// Stream ancak collectiondan kulanýyoruz bunun için diziyi liste çevirmemiz
	// lazým
	public static void streamArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Maraþ" };
		Arrays.asList(dizi).stream().forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		System.out.println("Ýterative For");
		iterativeArray();
		System.out.println("\n********************************");
		System.out.println("Stream For");
		streamArray();
	}
	
}
