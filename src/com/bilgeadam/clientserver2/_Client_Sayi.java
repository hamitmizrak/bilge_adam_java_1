package com.bilgeadam.clientserver2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

// client demek istemde bulunan demektir.
// request: istek
public class _Client_Sayi {
	
	// main
	public static void main(String[] args) {
		Scanner klavye = null;
		String number;
		
		// DNS IP
		// localhost ==> 127.0.0.1
		String ipAddress = "localhost";
		
		// 65536
		int port = 7777;
		
		// veri gönderceðim.
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, port).getOutputStream())) {
			klavye = new Scanner(System.in);
			// System.out.println("Lütfen bir sayý giriniz");
			// number = klavye.nextLine();
			number = JOptionPane.showInputDialog("Lütfen bir sayý giriniz");
			dataOutputStream.writeUTF(number);
			
		} catch (IOException io) {
			System.out.println("Hata meydana geldi");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
