package com.bilgeadam.a022.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// String ==> length()
// Array ==> length
// Collection ==> size()

// Akşam yemeğine Ben bugun ne yapsam ?

// metot ve diziler List,Set,Map
// pazartesi salı ...pazar = String[] gun=new String[];
// Ana yemekler ==> kuru fasülye,adana kebab,Pilav v.s
// Sıcak yemek ==> mercimek corbası,domates çorbası
// içecekler ==> su ,soda,
// Yemekten sonra içilecekler ==> çay , kahve olsun
// tatlılar ==> revani , kıbrıs tatlılar v.s

// adanakebab,mercimekcorbası,soda,çay,revani
public class YemekTarifi {
	// Array -collection
	
	// rastgele
	public static int rastgele(int sayi) {
		Random random = new Random();
		int randomSayi = random.nextInt(sayi);
		return randomSayi;
	}
	
	// Hafta 7 gün
	public static String gunler() {
		String[] gun = new String[7];
		gun[0] = "Pazartesi";
		gun[1] = "Salı";
		gun[2] = "Çarşamba";
		gun[3] = "Perşembe";
		gun[4] = "Cuma";
		gun[5] = "Cumartesi";
		gun[6] = "Pazar";
		// ENUM
		return gun[rastgele(6)];
	}
	
	// common List
	
	// Ana Yemekler
	// ENUM
	public static List<String> anaYemekListesi() {
		List<String> listem = new ArrayList<String>();
		listem.add("Kebab");
		listem.add("Kuru Fasulye");
		listem.add("Pilav");
		listem.add("Güveç");
		listem.add("İmambayıldı");
		listem.add("Türlü");
		listem.add("Dolma");
		return listem;
	}
	
	public static String anaYemekler() {
		return anaYemekListesi().get(rastgele(anaYemekListesi().size()));
	}
	
	public static String sicakYemek() {
		List<String> anaYemekListesi = new ArrayList<String>();
		anaYemekListesi.add("Mercimek Çorbası");
		anaYemekListesi.add("Domates Çorbası");
		anaYemekListesi.add("Ezo Gelin Çorbası");
		return anaYemekListesi.get(rastgele(anaYemekListesi.size()));
	}
	
	public static void main(String[] args) {
		// String gun = gunler(), ana = anaYemekler(), sicak = sicakYemek();
		// System.out.println(gun + " " + ana + " " + sicak);
		//
		// String hepsi = gun + " " + ana + " " + sicak;
		// System.out.println(hepsi);
		//
		// String hepsi2 = gun.concat(" ").concat(ana).concat(sicak);
		// System.out.println(hepsi2);
		//
		// StringBuilder builder = new StringBuilder();
		// builder.append(gun + " ").append(ana + " ").append(sicak + " ");
		// String cevir = builder.toString();
		// System.out.println(cevir);
		
	}
}
