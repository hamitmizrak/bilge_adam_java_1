package com.bilgeadam.a023.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

// 1.SORU
// public static final String PATH="";
// 1.adým static bir path yapalým deðeri C:\\bilgeadam\\dosya.txt
// 2.adým Kullanýcý tarafýndan Birþeyler yazýp oluþturduðumuz dosya içisine
// yazalým
// 3.adým dosya içerisindeki yazýlarý okuyalým.
// 4.adým dosya içerisindeki bütün a harflerini e yapalým

// 2.SORU
// 2.adým c:sürücüsünü altýnda kullanýcý tarafýndan "dizin" adýndan File ile
// java tarafýndan dizin oluþturalým

// 3.adým c:\\dizin altýna kullanýcý tarafýndan "bilgeadam.txt" dosya
// oluþturalým bilgeadam.txt dosyasý oluþturalým

// Seçenekli bir þekilde
// 0-Çýkýþ
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya özellikleri
// 6.1 Dosya mý
// bu dizin mi ? dosya mý?
// yazýlabilrinir mi ? okunabilinir mi çalýþabilinir mi?

// URL URI araþtýrmak ödevi

public class IOExamples {
	public static void deneme() {
		try {
			String path = "C:\\bilgeadam\\dosya.txt";
			File file = new File(path);
			System.out.println("çalýþabilir miyim : " + file.canExecute());
			System.out.println("okuyabilir miyim : " + file.canRead());
			System.out.println("yazabir miyim : " + file.canWrite());
			System.out.println("////////////////////////////");
			System.out.println("dosya gizli mi? " + file.isHidden());
			System.out.println("dizin mi? " + file.isDirectory());
			System.out.println("dosya mi? " + file.isFile()); // dosya.txt
			
			if (file.createNewFile()) {
				System.out.println("Dosya yok ");
			} else {
				System.out.println("Dosya var");
			}
			
			// silmek
			if (file.exists()) {
				file.delete();
				System.out.println("Dosya Silindi");
			} else {
				System.out.println("Dosya Silinmedi");
			}
			
			System.out.println("path:" + file.toPath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// Dosyaya birþeyler yazmak
	public static void fileWriterTryWithResources() {
		String adi = FilePath.FILE_PATH;
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePath.FILE_PATH, true))) {
			String value = "";
			Scanner klavye = new Scanner(System.in);
			System.out.println("Lütfen birþeyler yazýnýz");
			bufferedWriter.write(klavye.nextLine());
			bufferedWriter.flush();
			System.out.println("Yazýldý");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileWriterTryWithResourcesManuel(String str) {
		String adi = FilePath.FILE_PATH;
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePath.FILE_PATH, true))) {
			String value = "";
			bufferedWriter.write(str);
			bufferedWriter.flush();
			System.out.println("Yazýldý");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String fileReaderTryWithResources() {
		String satir = "", toplamOkunanSatir = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath.FILE_PATH))) {
			while ((satir = bufferedReader.readLine()) != null) {
				toplamOkunanSatir += satir + " \n";
			}
			System.out.println(toplamOkunanSatir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return toplamOkunanSatir;
	}
	
	public static String changeLetter(String value) {
		String newValue = "";
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == 'a' || value.charAt(i) == 'A') {
				newValue = value.replace("a", "e").replace("A", "e");
			}
		}
		System.out.println("ilk hali: " + value);
		System.out.println("deðiþmiþ hali: " + newValue);
		
		return newValue;
	}
	
	public static void main(String[] args) {
		// fileWriterTryWithResources();
		// fileReaderTryWithResources();
		// String str = fileReaderTryWithResources();
		// changeLetter(str);
		// fileWriterTryWithResourcesManuel(changeLetter(str));
		
		deneme();
	}
	
}
