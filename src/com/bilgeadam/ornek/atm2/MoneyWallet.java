package com.bilgeadam.ornek.atm2;

import java.util.Scanner;

// parayla alakalı classımız
// özellikler
// Parametresiz constructor
// Parametreli constructor
// toString
// Method
// Getter and setter

// N
public class MoneyWallet extends CommonProperty implements IBankMethods {
	// özellikler
	protected String moneyType;// kağıt paramı bozu para mı
	protected String moneyCurrency;// tr en belli bir standartta göstermek istiyorum Enum
	protected double moneyAmount;
	
	// composition
	protected Bank bank;
	
	// Parametresiz constructor
	public MoneyWallet() {
		this.moneyAmount = 0.0;
	}
	
	// abstract: geneol herkes için ortak
	// interface: farklı ortak özellikler
	
	// Parametreli constructor
	
	public MoneyWallet(String id, String moneyType, String moneyCurrency, double moneyAmount) {
		super(id);
		this.moneyType = moneyType;
		this.moneyCurrency = moneyCurrency;
		this.moneyAmount = moneyAmount;
	}
	
	// toString
	@Override
	public String toString() {
		return "MoneyWallet" + ", getId()=" + getId() + ", getDate()=" + getDate() + "moneyType=" + moneyType
				+ ", moneyCurrency=" + moneyCurrency + ", moneyAmount=" + moneyAmount;
	}
	
	// Method
	public String scannerValue() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen seçim yapınız");
		System.out.println(
				"1-)Para Görüntüle\n2-)Para Yatır\n3-)Para Çekme\n4-)Eft Göndermek\n5-)Havale gönder\n6-)Mail gönder\7-)Çıkış");
		String chooice = klavye.nextLine();
		return chooice;
	}
	
	public void allMethod() {
		// composition
		// 1
		Bank bank = new Bank("1", "Halkbank", "İstanbul", "Logo4");
		
		// N
		MoneyWallet moneyWallet = new MoneyWallet("2", "kağıt", MoneyCurrency.TR.name(), 25000.0);
		moneyWallet.setBank(bank);
		moneyWallet.getBank().getMoneyList().add(moneyWallet);
		
		String key = scannerValue();
		switch (key) {
			case "1": {
				showMoney();
				break;
			}
			case "2": {
				addMoney(14000.0);
				break;
			}
			case "3": {
				reduceMoney(3000.0);
				break;
			}
			case "4": {
				sendEftMoney(1000.0);
				break;
			}
			case "5": {
				sendHavaleMoney(500.0);
				break;
			}
			case "6": {
				fakeMail("mailadresiniz@gmail.com");
				break;
			}
			
			case "7": {
				System.out.println("Çıkış yapılıyor");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Lütfen belirtilen sayıyı giriniz");
				break;
			
		}
		
	}
	
	// interface içini dolduracağım metotlar
	@Override
	public void addMoney(double money) {
		this.moneyAmount += money;
		
	}
	
	@Override
	public void reduceMoney(double money) {
		//
		if (moneyAmount > 0) {
			this.moneyAmount -= money;
		} else {
			System.out.println("Bakiyeniz 0 TL");
		}
		
	}
	
	@Override
	public void sendHavaleMoney(double money) {
		Bank bank = new Bank();
		for (Object temp : bank.bankHavaleSerial) {
			System.out.println(temp);
		}
		moneyAmount = moneyAmount - money;
	}
	
	@Override
	public void sendEftMoney(double money) {
		Bank bank = new Bank();
		for (Object temp : bank.bankEftSerial) {
			System.out.println(temp);
		}
		System.out.println(money + "kadar Eft gönderildi");
		moneyAmount = moneyAmount - money;
		
	}
	
	@Override
	public void fakeMail(String emailAddress) {
		System.out.println("Mailiniz gönderiliyor");
		
	}
	
	@Override
	public void showMoney() {
		System.out.println("paranız toplam tutarı: " + this.moneyAmount);
	}
	
	// Getter and setter
	public String getMoneyType() {
		return moneyType;
	}
	
	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}
	
	public String getMoneyCurrency() {
		return moneyCurrency;
	}
	
	public void setMoneyCurrency(String moneyCurrency) {
		this.moneyCurrency = moneyCurrency;
	}
	
	public double getMoneyAmount() {
		return moneyAmount;
	}
	
	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
