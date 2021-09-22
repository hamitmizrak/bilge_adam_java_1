package com.bilgeadam.a006.string;

public class StringLesson {
	
	public static void main(String[] args) {
		
		String kelime = "java Servlet jsp Jsf Spring";
		// System.out.println(kelime);
		// System.out.println("simge sayısı: " + kelime.length());
		// System.out.println(kelime.toUpperCase());
		// System.out.println(kelime.toLowerCase());
		// String kelime2 = kelime.replace('ı', 'i');
		// // System.out.println(kelime);
		// System.out.println(kelime2);
		// System.out.println(kelime);
		// System.out.println(kelime.concat(" -sonradan ekledim").concat(" 44"));
		// System.out.println(kelime.substring(3));
		
		// System.out.println(kelime.substring(0, 2).concat("***"));
		// System.out.println("Simge sayısı "+kelime.length());
		// System.out.println("başındaki ve sonundaki boşlukları
		// al"+kelime.trim().length());
		
		// System.out.println("ile mi başlıyor "+kelime.startsWith("H"));
		// System.out.println("ile mi bitiyor "+kelime.endsWith(" "));
		
		// System.out.println(kelime.isEmpty()); // dolu=false
		
		// if (!kelime.isEmpty()) {
		// System.out.println("dolu");
		// } else {
		// System.out.println("boş");
		// }
		
		// String cumle = "Jsp".toLowerCase();
		// System.out.println(kelime.indexOf(cumle));
		// System.out.println(kelime.charAt(0));
		// java Servlet jsp Jsf Spring
		System.out.println(kelime.contains("java Servlet jsp Jsf Spring"));
		System.out.println(kelime.contains("Java Servlet jsp Jsf Spring"));
		System.out.println(kelime.contains("Servlet"));
		
	}
	
}
