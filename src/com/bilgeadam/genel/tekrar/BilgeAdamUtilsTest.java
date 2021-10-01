package com.bilgeadam.genel.tekrar;

public class BilgeAdamUtilsTest {
	/*
	 * Kullanıcıdan il ilçe ülke kodu girsin
	 */
	
	public static void main(String[] args) {
		// gün ay yıl
		System.out.println(BAUtils.dateAsString(Long.parseLong("1632646800")));
		
		// saat
		System.out.println(BAUtils.timeAsString(Long.parseLong("1632646800")));
		
		System.out.println("Enlem / Boylam Sorgusu : " + BAUtils.getDirectData("Merkez", "Balikesir", "TR"));
		System.out.println("Gunluk Hava Raporu     : " + BAUtils.getWeatherData(39.5961, 22.0244));
		System.out.println("15 Saatlik Hava Raporu : " + BAUtils.getForecastData("Edremit", "Balikesir", "TR"));
		System.out.println("Hava Kirlilik Raporu   :" + BAUtils.getPolutionData(39.5961, 22.0244));
		
		// BAUtils.header("oldu mu?");
		// boolean proceeding = true;
		// do {
		// String str = BAUtils.readString("L�tfen bir de�er giriniz");
		// System.out.println("Okunan de�er: " + str);
		//
		// int j = BAUtils.readInt("L�tfen bir tam say� giriniz");
		// System.out.println("Okunan de�er: " + j);
		//
		// double d = BAUtils.readDouble("L�tfen bir virg�ll� say� giriniz");
		// System.out.println("Okunan de�er: " + d);
		//
		// int[] inputs = BAUtils.readInt("L�tfen ", "tam say� giriniz", 4);
		//
		// for (int i = 0; i < inputs.length; i++) {
		// System.out.println(i + ". girilen de�er: " + inputs[i]);
		// }
		//
		// proceeding = BAUtils.proceeding("Devam etmek istiyor musunuz? (Evet /
		// Hay�r)", "Hay�r");
		// } while (!proceeding);
		
		// boolean proceed = BAUtils.proceeding("Devam etmek istiyor musunuz) (Evet /
		// Hay�r)", "Evet");
		// System.out.println("Okunan de�er: " + proceed);
		// int[] ints = BAUtils.readInt("L�tfen", "adet tam say� giriniz", 10);
		// System.out.println("Okunan de�er: " + ints);
		
		// BAUtils.footer();
		
	}
	
}
