package com.bilgeadam.clientserver.object.oneway.twoway;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

// istemde buluna
// eðer obje göndereceksem biz veri göndermek için OutputStream
public class _Client5_Object_CleanCodes {
	
	public static void main(String[] args) {
		
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new Socket("localhost", 5555).getOutputStream())) {
			ArrayList<StudentObject> objectList = new ArrayList<StudentObject>();
			objectList.add(new StudentObject(1, "Hamit"));
			objectList.add(new StudentObject(2, "Hamit2"));
			objectList.add(new StudentObject(3, "Hamit3"));
			objectList.add(new StudentObject(4, "Hamit4"));
			objectList.add(new StudentObject(5, "Hamit5"));
			
			objectOutputStream.writeObject(objectList);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
