package com.bilgeadam.ornek.atm2;

// computer
public interface IBankMethods {
	
	// public int sayi = 44;
	
	// para görüntüle
	public void showMoney();
	
	// para ekle
	public void addMoney();
	
	// para çekmek
	public void reduceMoney();
	
	// havale yapacağım
	public void sendHavaleMoney();
	
	// eft yapacağım
	public void sendEftMoney();
	
	// fake mail
	public void fakeMail(String emailAddress);
	
	// Getter and setter yapamayız
	// public int sayi = 44;
	//
	// // Gövdeli metotlar
	// public default void denemeMethod() {
	// System.out.println("interface değişkeni" + sayi);
	// }
	//
	// class Deneme implements IBankMethods {
	// public static void main(String[] args) {
	// Deneme deneme = new Deneme();
	// deneme.denemeMethod();
	// }
	// }
	
}
