package com.bilgeadam.a012.date;

import java.text.SimpleDateFormat;
import java.util.Date;
// import java.time.;
import java.util.Locale;
import java.util.Scanner;

public class DateCalendarTutorials {
	// metot yapacağız.
	// try catch.
	// şimdiki zamanın ay'ını alsın.
	// switch case ile kontrol edelim.
	// 1 =ocak 2=şubat 3=mart 4 ... 12=Aralık.
	
	private static int howManyCounterGame = 0;
	private static int count = 9;
	private static int prediction = 1;
	
	public static void getFindMonthDate() {
		try {
			Date date = new Date();
			// Aylar: 0:ocak -11
			switch (date.getMonth() + 1) {
				case 1:
					System.out.println("ocak");
					break;
				case 2:
					System.out.println("şubat");
					break;
				case 3:
					System.out.println("mart");
					break;
				case 4:
					System.out.println("nisan");
					break;
				case 5:
					System.out.println("mayıs");
					break;
				case 6:
					System.out.println("haziran");
					break;
				case 7:
					System.out.println("temmuz");
					break;
				case 8:
					System.out.println("ağustos");
					break;
				case 9:
					System.out.println("eylül");
					break;
				case 10:
					System.out.println("ekim");
					break;
				case 11:
					System.out.println("kasım");
					break;
				case 12:
					System.out.println("aralık");
					break;
				
				default:
					System.out.println("sayı yoktur");
					break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// SimpleDateFormat kullanarak 2021/Ekim/11
	
	public static void getPatternDate() {
		// long: System.out.println(System.currentTimeMillis());
		// Locale
		
		try {
			Locale locale = new Locale("tr", "TR");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss zzzz", locale);
			Date date = new Date();
			String str = dateFormat.format(date);
			System.out.println(str);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 14.00 12
	// 15 tane hakkım var saat kaç, kaçıncı denemede sayıyı buldum ?
	// eğer biz yüksek söylersek sayınızı küçültün eğer aradaki fark:2 ise az kaldı
	// yoksa aradaki çok fark var
	// eğer yüksek söylersek sayınızı büyültün fark:2 ise az kaldı yoksa aradaki çok
	// fark var
	
	// validation: hata kontrollerinin önceden tahmin etmek ve ona önlem almak.
	// 1-23
	// pozitif
	// karakter girmemesi gerekiyor.
	
	// 1-23 arasındaki pozitif gelen sayıyı alsın şimdiki saat ile karşılaştırsın
	
	public static void getClockGame(int sayi) {
		Date date = new Date();
		try {
			// bana saati veriyor.
			// @SuppressWarnings("deprecation")
			// bu kullanabilirsin ama bunun yeni sürümü var.
			
			@SuppressWarnings("deprecation")
			// compiler: evet biliyorum depracated olduğunu lütfen benim dediğimi yap
			int hours = date.getHours();
			System.out.println(hours);
			
			Scanner klavye = new Scanner(System.in);
			// count: hak prediction:tahmin
			
			while (count > 0) {
				System.out.println("Hakkınız: " + count);
				System.out.println("Tahmin Sayınız: " + prediction);
				
				// 13-15 =-2 15-13=+2
				int different = hours - sayi;
				if (different == 0) {
					System.out.println("Tebrikler sayıyı bildiniz. " + prediction + ".tahminde buldunuz");
					// Tekrar oynamak ister misiniz ? E H kullanıcı küçük harf yada büyük harf
					System.out.println("Tekrar oynamak ister misiniz E / H");
					// klavye.nextLine();
					
					String result = klavye.nextLine();
					
					// girsin farketmez
					// eğer E= tekrar oynasın H=basarsa Çıkış yapılsın
					// Toplam kaç kere oyun oynadı
					if (result.equalsIgnoreCase("E")) {
						
						// defaultta getirtmezsem
						count = 9;
						prediction = 1;
						howManyCounterGame++;
						System.out.println("Toplam oynama sayınız. " + howManyCounterGame);
						getResult();
					} else if (result.equalsIgnoreCase("h")) {
						System.out.println("Kapatılıyor... ");
						System.exit(0);
					}
					
				} else if (different == -2) {
					System.out.println("Büyük sayı girdiniz aradaki fark çok az");
					count--;
					prediction++;
				} else if (different == 2) {
					System.out.println("Küçük sayı girdiniz aradaki fark çok az");
					count--;
					prediction++;
				} else if (different > 2) {
					System.out.println("Küçük sayı girdiniz aradaki fark çok fazla");
					count--;
					prediction++;
				} else if (different > -2) {
					System.out.println("Büyük sayı girdiniz aradaki fark çok fazla");
					count--;
					prediction++;
				} else {
					System.out.println("Yanlış girildi");
				}
				getResult();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// Kullanıcının girdiği simgeyi sayı mı karakter mi olduğunu bulan method
	public static void getResult() {
		Scanner klavye = new Scanner(System.in);
		
		try {
			while (true) {
				System.out.println("lütfen pozitif 1 ile 23 arasında sayı giriniz");
				String simge = klavye.nextLine(); // 5 -5 a
				char karakter = simge.charAt(0);
				
				// isDigit ==> sayı ise
				if (Character.isDigit(karakter)) {
					// 1<=x<=23 pozitif sayı girildiyse
					if (1 <= Integer.parseInt(simge) && Integer.parseInt(simge) <= 23) {
						getClockGame(Integer.parseInt(simge));
					} else {
						// 1<=x<=23 dışında bir sayı girdiyse
						// sonsuz döngü recursive method
						getResult();
					}
				} else if (Character.isLetter(karakter)) {
					System.out.println("Bu bir harftir");
				} else {
					System.out.println("Negatif sayı");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Sayı girmediniz " + e);
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("hiç bir şeye girmediniz. " + e);
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// getFindMonthDate();
		// getPatternDate();
		getResult();
		
	}
}
