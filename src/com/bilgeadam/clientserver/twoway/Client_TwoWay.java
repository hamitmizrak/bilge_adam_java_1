package com.bilgeadam.clientserver.twoway;

// io ve .net

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

// client: veri almak hemde veri göndermek
public class Client_TwoWay {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		String receiveMessage; // mesaj almak
		String sendMessage;// mesaj göndermek
		
		// port açýlýmý yapýyoruz.
		Socket socket = new Socket("localhost", StaticPort.PORT);
		
		// Client veri gönderecek
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		// serverdan gelen veriyi almak
		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
		System.out.println("Client: lütfen mesaj yazýnýz");
		
		while (true) {
			// clienttan veri alýmý
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			printWriter.flush(); // tazelenmek
			
			if ((receiveMessage = bufferedReader2.readLine()) != null) {
				System.out.println("SERVER: " + receiveMessage + (" " + new Date(System.currentTimeMillis())));
			}
		}
		
	}
}
