package com.bilgeadam.genel.tekrar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeatherForeCast {
	// statik ve sabit veri
	// Global Sınıf değişkeni
	public static int count = 0;
	
	// il ilçe ulke kodunu alsın
	public static Map<String, Object> getCountyReading() {
		Scanner klavye = new Scanner(System.in);
		String ilce = "", il = "", ulke = "";
		Map<String, Object> mapList = new HashMap<String, Object>();
		
		// System.out.println(count);
		if (count == 0) {
			System.out.println("Lütfen ilceyi giriniz ");
			ilce = klavye.nextLine(); // .toLowerCase();
			System.out.println("Lütfen ili giriniz ");
			il = klavye.nextLine(); // .toLowerCase();
			System.out.println("Lütfen ülke kodunu giriniz ");
			ulke = klavye.nextLine(); // .toLowerCase();
			count++;
		}
		mapList.put("ilce", ilce);
		mapList.put("il", il);
		mapList.put("ulke", ulke);
		return mapList;
	}
	
	// tekrarsız döngü il,ilçe,ülke
	public static Map<String, Object> nonRepeatValue() {
		Map<String, Object> list = getCountyReading();
		return list;
	}
	
	// enlem boylam
	public static String[] getLatitudeLongitude(Map<String, Object> list) {
		// enlem,boylam
		String latit, longi;
		String value = BAUtils.getDirectData((String) list.get("ilce"), (String) list.get("il"),
				(String) list.get("ulke"));
		// System.out.println(value);
		latit = getAllLatitude(value, "lat");
		// System.out.println("Enlem : " + latit);
		
		longi = getAllLatitude(value, "lon");
		// System.out.println("Boylam : " + longi);
		
		// dizi[0]=enlem
		// dizi[1]=boylam
		String[] array = { latit, longi };
		return array;
		
	}
	
	// enlem lat lon
	public static String getAllLatitude(String valueAll, String latLon) {
		int first, end;
		String find = "";
		if (valueAll.contains(latLon)) {
			first = valueAll.indexOf(latLon) + 5;
			end = first + 7;
			find = valueAll.substring(first, end);
		}
		return find;
	}
	
	// Günlük hava raporu
	public static void dailyWeatherReport(String[] dizi) {
		String report = BAUtils.getWeatherData(Double.valueOf(dizi[0]), Double.valueOf(dizi[1]));
		System.out.println("Günlük hava raporu: " + report);
	}
	
	// Hava kirlilik raporu
	public static void dailyWeatherPolution(String[] dizi) {
		String report = BAUtils.getPolutionData(Double.valueOf(dizi[0]), Double.valueOf(dizi[1]));
		System.out.println("Hava kirlilik raporu: " + report);
	}
	
	// 15 saatlik hava raporu
	public static void fifteenHoursWeather(Map<String, Object> list) {
		Map<String, Object> mapList = list;
		// for (Object temp : mapList.values()) {
		// System.out.println(temp);
		// }
		String report = BAUtils.getForecastData((String) mapList.get("ilce"), (String) mapList.get("il"),
				(String) mapList.get("ulke"));
		System.out.println("15 saatlik hava raporu: " + report);
	}
	
	public static void main(String[] args) {
		getLatitudeLongitude(getCountyReading());
		dailyWeatherReport(getLatitudeLongitude(nonRepeatValue()));
		dailyWeatherPolution(getLatitudeLongitude(nonRepeatValue()));
		fifteenHoursWeather(nonRepeatValue());
		
		// sonsuz döngü switch case
		// Kullanıcıya soru soralım
		// 1 enlem boylam
		// 2 Günlük hava raporu
		// 3 Hava kirlilik raporu
		// 4 15 saatlik hava raporu
		// 5 çıkış
		
	}
	
}
