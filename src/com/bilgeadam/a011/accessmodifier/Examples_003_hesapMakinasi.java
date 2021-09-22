
package com.bilgeadam.a011.accessmodifier;

//2 tane değişken ve
// x=6; y=2;
// toplama: 8
// çarpma: 12
// çıkarma:x-y: 4
// bölme:3
// mod % :0
public class Examples_003_hesapMakinasi {

	public static void main(String[] args) {

		int sayi1, sayi2, toplama, cikarma, bolme, carpma, mod;
		sayi1 = 6;
		sayi2 = 2;
		toplama = sayi1 + sayi2;
		cikarma = sayi1 - sayi2;
		carpma = sayi1 * sayi2;
		bolme = sayi1 / sayi2;
		mod = sayi1 % sayi2;
		System.out.println("sayı1:" + sayi1 + " sayı2:" + sayi2 + " Toplama sonuc: " + toplama);
		System.out.println("sayı1:" + sayi1 + " sayı2:" + sayi2 + " cikarma sonuc: " + cikarma);
		System.out.println("sayı1:" + sayi1 + " sayı2:" + sayi2 + " carpma sonuc: " + carpma);
		System.out.println("sayı1:" + sayi1 + " sayı2:" + sayi2 + " bolme sonuc: " + bolme);
		System.out.println("sayı1:" + sayi1 + " sayı2:" + sayi2 + " mod sonuc: " + mod);

	}

}
