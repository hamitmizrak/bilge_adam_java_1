
package com.bilgeadam.examples;

// C=(F-32)*(5/9) F=132 kaç Derece ?

// VKİ:kilo/boy^2

// JVM
// JRE
// Byte code
// compiler /interpreter
// heap memory / stack memory nedir ? arasındaki farklar

public class Examples_006_vki {
	
	public static void main(String[] args) {
		double boy = 181, kilo = 86, vki = 0.0;
		vki = kilo / boy * boy;
		System.out.println("Vücut Kitle index: " + vki);
		
	}
	
}
