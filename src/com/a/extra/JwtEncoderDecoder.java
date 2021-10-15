package com.a.extra;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class JwtEncoderDecoder {
	// encode:þifreleyici
	public static String encoderMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen yazý giriniz");
		String value = klavye.nextLine();
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		System.out.println("þifrelenmiþ veri: " + toPassword);
		return toPassword;
	}
	
	// decode: þifre çözücü
	public static String decoderMethod(String value) {
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value));
		System.out.println("þifre çözümü: " + sifreCoz);
		return sifreCoz;
	}
	
	public static void main(String[] args) {
		//
		// monad
		decoderMethod(encoderMethod());
	}
}
