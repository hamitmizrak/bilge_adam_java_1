package com.bilgeadam.a022.collections.stream.examples;

import java.util.Arrays;

// Java 8
// @FunctionalInterface
// Stream()
// Method referances ::
public class WhatISStream {
	// Stream() Akistir.
	// kodlarimizi daha az yazmak �ok u�ra�mamakt�r
	// IO: InputStream() OuttputStream() ile Stream() karistirmayin
	
	public static void iterativeArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Mara�" };
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
	}
	
	// Stream ancak collectiondan kulaniyoruz bunun icin diziyi liste cevirmemiz
	// lazim
	public static void streamArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Mara�" };
		Arrays.asList(dizi).stream().forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		System.out.println("iterative For");
		iterativeArray();
		System.out.println("\n********************************");
		System.out.println("Stream For");
		streamArray();
	}
	
}
