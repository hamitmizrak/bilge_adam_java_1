package com.bilgeadam.a023.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BilgeAdamFileWriterReader {
	// metot yazdýðýnýz çalýþmazsa
	// linux: /
	// windows: \
	public static void fileWriterNotTryWithResources() {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		String path = "C:\\bilgeadam\\HamitMizrak2.txt";
		try {
			// çok önemli bir özelliði sonra göstereceðim.
			// öncekini siliyor ekliyor
			// Önceki kalsýn yenileri eklesin
			// defaultta: false biz true yapmalýyýz.
			fileWriter = new FileWriter(path, false);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("yeni satir");
			bufferedWriter.flush();
			
			System.out.println("Dosyalar yazýldý");
			// çok önemli compiler ederken bunu zaten göreceðiz.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// try with resources : Close yazmaya çalýþýyor
	public static void fileWriterTryWithResources() {
		String path = "C:\\bilgeadam\\HamitMizrak.txt";
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
			bufferedWriter.write("yeni satir");
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//
	public static void fileReaderTryWithResources() {
		String path = "C:\\bilgeadam\\HamitMizrak.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			String toplamSatirlar = "";
			String satir = ""; // satýrdaki verileri
			while ((satir = bufferedReader.readLine()) != null) {
				toplamSatirlar = toplamSatirlar + satir + "\n";
			}
			System.out.println(toplamSatirlar);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		fileWriterNotTryWithResources();
		// fileReaderTryWithResources();
	}
	
}
