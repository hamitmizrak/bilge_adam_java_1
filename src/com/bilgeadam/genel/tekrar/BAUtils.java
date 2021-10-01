package com.bilgeadam.genel.tekrar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BAUtils {
	private static Scanner scan = new Scanner(System.in);
	
	public static void footer() {
		System.out.println("\n\n\tProgram� kullandiginiz icin tesekkurler");
		System.out.println("\t\tTekrar gorusmek uzere");
		closeResources();
	}
	
	public static void header(String title) {
		// ===========
		// ** title **
		// ===========
		int len = title.length();
		StringBuilder row = new StringBuilder("");
		
		for (int i = 0; i < (len + 6); i++) {
			row.append("=");
		}
		
		System.err.println("\n\n\t\t" + row);
		System.err.println("\t\t** " + title.toUpperCase() + " **");
		System.err.println("\t\t" + row + "\n");
	}
	
	public static String readString(String query) {
		showQuery(query);
		String retVal = scan.nextLine();
		return retVal;
	}
	
	private static void showQuery(String query) {
		System.out.print("\t" + query + ": ");
	}
	
	public static int readInt(String query) {
		int retVal = Integer.MIN_VALUE;
		showQuery(query);
		retVal = scan.nextInt();
		scan.nextLine();
		return retVal;
	}
	
	public static int[] readInt(String start, String query, int numElements) {
		showQuery(start + " " + numElements + " " + query + "\n");
		int[] retVal = new int[numElements];
		for (int i = 0; i < numElements; i++) {
			System.out.print((i + 1) + ". de�eri giriniz: ");
			retVal[i] = scan.nextInt();
		}
		scan.nextLine();
		return retVal;
	}
	
	public static double readDouble(String query) {
		double retVal = Double.NEGATIVE_INFINITY;
		showQuery(query);
		retVal = scan.nextDouble();
		scan.nextLine();
		return retVal;
	}
	
	public static void closeResources() {
		scan.close();
	}
	
	public static boolean wantToEnd(String question, String negativeAnswer) {
		boolean retVal = true;
		
		showQuery(question);
		String answer = scan.next();
		
		retVal = answer.equalsIgnoreCase(negativeAnswer);
		scan.nextLine();
		return !retVal;
	}
	
	/*
	 * public static boolean proceeding(String question, String positiveAnswer) {
	 * return readString(question).equalsIgnoreCase(positiveAnswer); }
	 */
	
	// gün ay yıl
	public static String dateAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("dd.MMMM.yyyy"));
	}
	
	/**
	 * long �eklinde belirtilmi� bir zaman bilgisini dd.MMM.yyyy �eklinde ger d�ner
	 * 
	 * @param timestamp zaman bilgisi
	 * @return
	 */
	public static String timeAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
	}
	
	/**
	 * Enlem ve boylam verileri verilmi� bir yer i�in hava kirlili�i bilgilerini
	 * geri d�ner
	 * 
	 * @param lat Enlem bilgisi
	 * @param lon Boylam bilgisi
	 * @return
	 */
	
	public static String getPolutionData(double lat, double lon) {
		String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=" + lat + "&lon=" + lon
				+ "&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Enlem ve boylam verileri verilmi� bir yer i�in g�nl�k hava tahmini bilgisini
	 * geri d�ner
	 * 
	 * @param lat Enlem bilgisi
	 * @param lon Boylam bilgisi
	 * @return
	 */
	public static String getWeatherData(double lat, double lon) {
		String url = "http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon
				+ "&units=metric&lang=tr&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Verilen bilgiler dahilinde 3er saatlik aral�klala yap�lm�� 5 adet hava
	 * tahminini geri d�ner
	 * 
	 * @param ilce Bir �ehrin il�esinin ad�
	 * @param il   �ehir ad�
	 * @param ulke IOS �lke k�sa kodlar�, T�rkiye i�in TR
	 * @return
	 */
	
	public static String getForecastData(String ilce, String il, String ulke) {
		String url = "https://api.openweathermap.org/data/2.5/forecast?&q=" + ilce + "," + il + "," + ulke
				+ "&units=metric&cnt=5&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Verilen bilgiler dahilinde bir il�enin enlem ve boylam bilgilerine ula�mak
	 * i�in kullan�l�r
	 * 
	 * @param ilce Bir �ehrin il�esinin ad�
	 * @param il   �ehir ad�
	 * @param ulke IOS �lke k�sa kodlar�, T�rkiye i�in TR
	 * @return
	 */
	
	// ilce,il,ulke verdigim parametreyle
	public static String getDirectData(String ilce, String il, String ulke) {
		String url = "http://api.openweathermap.org/geo/1.0/direct?q=" + ilce + "," + il + "," + ulke
				+ "&limit=1&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retValue = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retValue += inputLine;
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retValue;
	}
}
