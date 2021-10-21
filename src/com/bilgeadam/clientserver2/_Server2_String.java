package com.bilgeadam.clientserver2;

import java.io.DataInputStream;
import java.net.ServerSocket;

// server: hizmet veren clienttan gelen istekleri yerine getiren

// daðýtýk sistemde: að üzerinden çalýþmayý saðlýyor.

// client:veri gonderecegim
// DataOutputStream dataOutputStream = new DataOutputStream(new
// Socket(ipAddress, port).getOutputStream())

// server
// DataInputStream dataInputStream = new DataInputStream(new
// ServerSocket(port).accept().getInputStream())

// önemli not: once serveri çalýþtýrýn sonrasýnda client
public class _Server2_String {
	
	public static void main(String[] args) {
		
		// 65536
		int port = 7777;
		
		// Cliennten gelen String yapý
		String clientValue, smallLetter, bigLetter;
		
		System.out.println("Server hazýr ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			smallLetter = clientValue.toLowerCase();
			bigLetter = clientValue.toUpperCase();
			System.out.println("küçük harf: " + smallLetter);
			System.out.println("büyük harf: " + bigLetter);
			System.out.println("length: " + clientValue.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
