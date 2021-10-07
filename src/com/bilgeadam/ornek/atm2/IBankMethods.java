package com.bilgeadam.ornek.atm2;

public interface IBankMethods {
	
	// public int sayi = 0;
	
	// para görüntüle
	public void showMoney();
	
	// para ekle
	public void addMoney(double money);
	
	// para çekmek
	public void reduceMoney(double money);
	
	// havale yapacağım
	public void sendHavaleMoney(double money);
	
	// eft yapacağım
	public void sendEftMoney(double money);
	
	// fake mail
	public void fakeMail(String emailAddress);
	
}
