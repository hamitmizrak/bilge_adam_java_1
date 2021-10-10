package com.bilgeadam.a016.oop.hayvanlaralemi.psvm;

import com.bilgeadam.a016.oop.hayvanlaralemi.omurgali.EKusIsimler;
import com.bilgeadam.a016.oop.hayvanlaralemi.omurgali.Kus;
import com.bilgeadam.a016.oop.hayvanlaralemi.omurgasiz.Kabuklular;

public class HayvanlarAlemiMainTest {
	
	public static void main(String[] args) {
		
		// kuş: papagan,serce,muhabbetkuşu,kartal,atmaca
		
		// parametresiz
		Kus kus = new Kus();
		
		kus.setAdi(EKusIsimler.PAPAGAN.name());
		kus.setHareket("Omurgalı Kuş Hareketli xym");
		kus.setTuketim("Omurgalı Kuş tüketim");
		kus.setUreme(" Omurgalı Kuş üreme");
		kus.setYumurta("Omurgalı Mavi yuvarta");
		System.out.println(kus.getAdi() + " " + kus.getHareket() + " " + kus.getTuketim() + " " + kus.getUreme() + " "
				+ kus.getYumurta());
		
		System.out.println("-------------------------------");
		// parametreli
		
		Kabuklular kabuklular = new Kabuklular("ıstakoz", "Omurgasız kabuklu üreme", "omurgasız kabuklu tüketim",
				"omurgasız hareket", "omurgasız dış iskelet");
		System.out.println(kabuklular);
		
	}
	
}
