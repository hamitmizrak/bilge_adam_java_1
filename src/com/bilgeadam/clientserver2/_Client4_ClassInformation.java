package com.bilgeadam.clientserver2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.swing.JOptionPane;

// tane sayý
public class _Client4_ClassInformation {
	
	public static int degismeyenPort = 0;
	
	// þifreleme
	public static String encoderSocket() {
		String value = JOptionPane.showInputDialog("Lütfen bir þeyler yazýnýz");
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		return toPassword;
	}
	
	// main
	public static void main(String[] args) {
		String nameSurname;
		SockerInformation information = new SockerInformation();
		
		// veri gönderceðim.
		try (DataOutputStream dataOutputStream = new DataOutputStream(
				new Socket(information.getIpAddress(), information.getPort()).getOutputStream())) {
			
			// þifrelenmiþ data gönder
			nameSurname = encoderSocket();
			dataOutputStream.writeUTF(nameSurname);
		} catch (IOException io) {
			System.out.println("Hata meydana geldi");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
