package com.bilgeadam.clientserver2;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Base64;
import java.util.Base64.Decoder;

public class _Server3_DecoderEncoder {
	
	// þifre çözücü
	public static String decoderSocket(String value) {
		Decoder decoder = Base64.getDecoder();
		String explainPassword = new String(decoder.decode(value));
		return explainPassword;
	}
	
	public static void main(String[] args) {
		int port = 7777;
		String clientValue; // Cliennten gelen String yapý
		System.out.println("Server hazýr ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			// þifrelenmiþ data geldi
			clientValue = dataInputStream.readUTF();
			String explain = decoderSocket(clientValue);
			System.out.println("þifreli: " + clientValue + " Þifrelenmiþ data çözümü: " + explain);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
