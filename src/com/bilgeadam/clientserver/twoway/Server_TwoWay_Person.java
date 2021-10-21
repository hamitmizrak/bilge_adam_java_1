package com.bilgeadam.clientserver.twoway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// server: gelen istediði yerine getirir
public class Server_TwoWay_Person {
	
	public static void main(String[] args) throws IOException {
		String receiveMessage; // mesaj almak
		String sendMessage;// mesaj göndermek
		
		ServerSocket serverSocket = new ServerSocket(StaticPort.PORT);
		
		System.out.println("Server hazýr...");
		Socket socket = serverSocket.accept();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		InputStream inputStream = socket.getInputStream();
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
		
		while (true) {
			if ((receiveMessage = receiveRead.readLine()) != null) {
				System.out.println("CLIENT: " + receiveMessage);
			}
			
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			printWriter.flush();
		}
	}
}
