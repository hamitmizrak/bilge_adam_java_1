
package com.bilgeadam.a009.conditions;

import java.util.Scanner;

// kullanıcının password ve repassword verileri alsın aynı veri mi değil mi
// (constant)
public class Examples_018_Password_RePassword {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		final String password;
		final String rePassword;
		
		System.out.println("Lütfen şifrenizi giriniz:");
		password = klavye.nextLine();
		
		System.out.println("Lütfen şifrenizi tekrar giriniz:");
		rePassword = klavye.nextLine();
		
		if (password.equals(rePassword)) {
			System.out.println("Şifreniz aynıdır");
		} else {
			System.out.println("Şifreler birbirine uymadı !!!!");
		}
		
		// ödev: valueOf ile parseInt arasındaki fark
		// primitive ile wrapper arasındaki fark
		// cast: boxing /unboxing
		
	}
	
}
