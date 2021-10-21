package com.bilgeadam.clientserver.object.oneway.twoway;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TwoWay2_Client_chat_CleanCodes {
	public static void main(String[] args) throws Exception {
		
		try() {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Socket socket = new Socket("127.0.0.1", 3000);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
		
		System.out.println("Client : Lütfen mesaj yazýnýz");
		// receiveMessage:mesaj almak sendMessage:mesaj gönder
		String receiveMessage, sendMessage;
		while (true) {
			sendMessage = bufferedReader.readLine(); // keyboard reading
			printWriter.println(sendMessage); // sending to server
			printWriter.flush(); // flush the data
			if ((receiveMessage = bufferedReader2.readLine()) != null) // receive from server
			{
				System.out.println("SERVER: " + receiveMessage); // displaying at DOS prompt
			}
			
		}
		
	}
}