
package com.bilgeadam.examples;

import java.util.Scanner;

/*
 * Kullanıcı :
 * 80<=hiz<=85 ==> hizli gidiyorsunuz lütfen yavaşlayınız cezanın: 200TL eğer
 * erken öderseniz %15 indirim alacaksınız.
 * 85<hiz<=100 ==> çok hizli gidiyorsunuz lütfen yavaşlayınız: 300 TL eğer
 * erken öderseniz %15 indirim alacaksınız.
 * 100<hiz çok hizli gidiyorsunuz !!!! 1000 TL ve ehliyetinize
 * el konulacak.
 */
public class Examples_013_Radar {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("Lütfen hız giriniz");
			int hiz = klavye.nextInt();
			double para = 0;
			
			if ((80 <= hiz) && (hiz <= 85)) {
				System.out.println("hizli gidiyorsunuz " + hiz + " lütfen yavaşlayınız");
				para = 200.0;
				para = para - (para * (15.0 / 100.0));
				System.out.println(para);
				System.out.println(
						"cezanız: 200TL eğer  erken öderseniz %15 indirim alacaksınız indirimli fiyat " + para);
			} else if ((85 < hiz) && (hiz <= 100)) {
				System.out.println("çok hizli gidiyorsunuz " + hiz + " lütfen yavaşlayınız");
				para = 300.0;
				para = para - (para * (15.0 / 100.0));
				System.out.println(
						"cezanız: 300TL eğer  erken öderseniz %15 indirim alacaksınız indirimli fiyat " + para);
			} else if (hiz > 100) {
				System.out.println("hizınız: " + hiz + "ehliyetinize  el konulacak");
				para = 1000.0;
				System.out.println("cezanız: " + para);
				
			} else {
				System.out.println("Her şey normal");
				// isTrue=false;
			}
		}
		
	}
	
}
