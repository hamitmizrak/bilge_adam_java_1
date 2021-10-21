package com.bilgeadam.clientserver.object.oneway.twoway;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.util.ArrayList;

// gelen istekleri yerine getirendir.
public class _Server5_Object_CleanCodes {
	
	public static void main(String[] args) throws ClassNotFoundException {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new ServerSocket(5555).accept().getInputStream())) {
			
			System.out.println("Server çalýþmaya hazýr");
			
			ArrayList<StudentObject> list = (ArrayList<StudentObject>) objectInputStream.readObject();
			
			// stream()
			list.forEach((temp) -> System.out.println(temp.getId() + " " + temp.getStudentName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
