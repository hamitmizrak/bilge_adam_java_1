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
public class _Server_Sayi {
	
	public static void main(String[] args) {
		
		// 65536
		int port = 7777;
		
		// Cliennten gelen String yapý
		String clientValue;
		
		// String bir yapýyý tam sayýya çevirmek "25" Math.sqrt(25)
		int stringToInteger;
		
		System.out.println("Server hazýr ");
		// veri alacagim
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			// toUpperCase length
			// String'ten int'e çevirsin
			stringToInteger = Integer.valueOf(clientValue);
			System.out.println(stringToInteger + " sayýsýnýn Karekökü: " + Math.sqrt(stringToInteger));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
