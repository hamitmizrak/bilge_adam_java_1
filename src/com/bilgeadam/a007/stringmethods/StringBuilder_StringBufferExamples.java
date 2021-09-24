package com.bilgeadam.a007.stringmethods;

// synchronized nedir ?
// +(artı) operant Not:+ kadar döngü olacak ile StringBuilder arasındaki fark
// StringBuilder nedir?
// StringBuffer arasındaki farklar nelerdir ?

// split
// StringTokenizer

// manuel compiler
// gitHub clone ?
public class StringBuilder_StringBufferExamples {
	public static void main(String[] args) {
		// StringBuilder builder = new StringBuilder();
		// builder.append("Hamit").append("Mızrak").append("JavaSE").append(44);
		// String birlestir = builder.toString();
		// System.out.println(birlestir);
		
		StringBuffer builder = new StringBuffer();
		builder.append("Hamit").append("Mızrak").append("JavaSE").append(44);
		String birlestir = builder.toString();
		System.out.println(birlestir);
		
		// ikisi arasındaki farklara bakalım.
		
		// StringBuilder StringBuffer
		// Not Thread-safe Thread Safe
		// faster slower
		// Java5 Java1
		// güvensiz güvenli
		// non-synchronized synchronized
		
	}
}
