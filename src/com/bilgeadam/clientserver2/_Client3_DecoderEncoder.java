package com.bilgeadam.clientserver2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.swing.JOptionPane;

// tane sayý
public class _Client3_DecoderEncoder {
	
	// þifreleme
	public static String encoderSocket() {
		String value = JOptionPane.showInputDialog("Lütfen bir þeyler yazýnýz");
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		return toPassword;
	}
	
	// bilgeadam
	// YmlsZ2VhZGFt
	
	// String sifrelenecekVeri = encoderSocket();
	// System.out.println("Þifrelenmiþ data: " + sifrelenecekVeri);
	// String sifreCozuldu = decoderSocket(sifrelenecekVeri);
	
	// ClientServerTuto
	// id ==> int
	// port ==> int
	// ipAddres ==> String
	// logsDate ==> new Date(System.currentTimeMillis());
	
	// main
	public static void main(String[] args) {
		String nameSurname, ipAddress = "localhost";
		int port = 7777;
		
		// veri gönderceðim.
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, port).getOutputStream())) {
			
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
