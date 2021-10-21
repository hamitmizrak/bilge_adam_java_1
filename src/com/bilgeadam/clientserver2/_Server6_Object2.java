package com.bilgeadam.clientserver2;

import java.util.ArrayList;
import java.util.List;

// Sehir diye bir classýmýz olsun
// id
// þehirAdi

// clientta þimdki vereceklerimi eklememiz gerekiyor.
/*
 * Ýstanbul,Ankara,Ýzmir,Adana,Adýyaman,Afyonkarahisar,Aðrý,Aksaray,Amasya,
 * Antalya,Ardahan,Artvin,Aydýn,Balýkesir,Bartýn,Batman,Bayburt,Bilecik,Bingöl,
 * Bitlis,Bolu,Burdur,Bursa,Çanakkale,Çankýrý,Çorum,Denizli,Diyarbakýr,Düzce,
 * Edirne,Elazýð,Erzincan,Erzurum,Eskiþehir,Gaziantep,Giresun,Gümüþhane,Hakkari,
 * Hatay,Iðdýr,Isparta,Kahramanmaraþ,Karabük,Karaman,Kars,Kastamonu,Kayseri,
 * Kýrýkkale,Kýrklareli,Kýrþehir,Kilis,Kocaeli,Konya,Kütahya,Malatya,Manisa,
 * Mardin,Mersin,Muðla,Muþ,Nevþehir,Niðde,Ordu,Osmaniye,Rize,Sakarya,Samsun,
 * Siirt,Sinop,Sivas,Þýrnak,Tekirdað,Tokat,Trabzon,Tunceli,Þanlýurfa,Uþak,Van,
 * Yalova,Yozgat,Zonguldak
 */

// StringTokenizer ile virgülle parçalýyalým
// paraçalanmýþ verileri döngü içinde List ekliyelim
public class _Server6_Object2 {
	
	public static void main(String[] args) {
		// List<StudentObject> list = new ArrayList<StudentObject>();
		// list.add(new StudentObject(0, null));
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		list.forEach(System.out::println);
	}
	
}
