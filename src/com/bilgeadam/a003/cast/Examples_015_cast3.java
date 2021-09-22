
package com.bilgeadam.a003.cast;

import java.util.Scanner;

// null ==>
// sıfır oluşturulmuş bir şey var ama içinde değeri sıfır

// boxing - unboxing nedir?
public class Examples_015_cast3 {
	
	public static void main(String[] args) {
		// boxing ==> primitive Wrapper benzetiyoruz
		// unboxing ==> Wrapper bir yapıyı primitive benzetiyoruz
		
		// kullanıcıdan almış olduğumuz byte türündeki primitive sayıyı Boxing yapan
		// algoritma ?
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz -128<=x<=127");
		
		// boxing = primitive olan bir türü wrapper classa benzetir.
		byte primitiveNumber = klavye.nextByte();
		Byte wrapperNumber = primitiveNumber;
		System.out.println("Wrapper: " + wrapperNumber);
		
		// unboxing = wrapper classı primitive çevirir.
		Byte wrapperSayi = new Byte((byte) 44);
		long primitiveSayi = wrapperSayi; // unboxing
	}
	
}
