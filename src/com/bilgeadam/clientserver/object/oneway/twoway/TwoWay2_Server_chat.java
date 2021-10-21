package com.bilgeadam.clientserver.object.oneway.twoway;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TwoWay2_Server_chat {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(3000);
		
		System.out.println("Chat için Server hazýr...");
		Socket socket = serverSocket.accept();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		InputStream inputStream = socket.getInputStream();
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
		
		String receiveMessage, sendMessage;
		while (true) {
			if ((receiveMessage = receiveRead.readLine()) != null) {
				System.out.println("CLÝENT: " + receiveMessage);
			}
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			printWriter.flush();
		}
	}
}