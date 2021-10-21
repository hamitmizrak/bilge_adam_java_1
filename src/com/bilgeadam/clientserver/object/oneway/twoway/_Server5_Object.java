package com.bilgeadam.clientserver.object.oneway.twoway;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// gelen istekleri yerine getirendir.
public class _Server5_Object {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			ServerSocket serverSocket = new ServerSocket(5555);
			System.out.println("Server çalýþmaya hazýr");
			
			Socket socket = serverSocket.accept();
			System.out.println("Baðlantý: " + socket);
			
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			
			ArrayList<StudentObject> list = (ArrayList<StudentObject>) objectInputStream.readObject();
			
			// stream()
			list.forEach((temp) -> System.out.println(temp.getId() + " " + temp.getStudentName()));
			
			serverSocket.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
