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
				"1-)Para Görüntüle\n2-)Para Yatır\n3-)Para Çekme\n4-)Eft Göndermek\n5-)Havale gönder\n6-)Mail gönder\n7-)Çıkış");
		String chooice = klavye.nextLine();
		return chooice;
	}
	
	public boolean isLogin() {
		boolean result = false;
		
		Scanner klavye = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		
		// static veri çağırdım Ctrl+Mouse left click
		String dbUser = UtilAtm.USER_DEFAULT;
		String dbPassword = UtilAtm.USER_PASSWORD;
		
		// hakkınız:4
		int attempt = 4;
		
		while (attempt >= -1) {
			System.out.println("\nLütfen Kullanıcı adı giriniz");
			userEmail = klavye.nextLine().trim();
			System.out.println("\nLütfen Kullanıcı şifrenizi giriniz");
			userPassword = klavye.nextLine().trim();
			
			for (int i = 0; i < userPassword.length(); i++) {
				maskString = maskString + "*";
			}
			System.out.println("Maskelenemiş şifre:" + maskString);
			
			if ((userEmail.equals(dbUser)) && (userPassword.equals(dbPassword))) {
				result = true;
				System.out.println("doğru cevap");
				allMethod();
				break;
			} else {
				System.out.println("Email veya şifre yanlış girdiniz");
				System.out.println("kalan hakkınız: " + (attempt - 1));
				
				if (attempt == 1) {
					System.out.println(
							"4 kere yanlış hakkımız kartınız bloke oldu müşteri hizmetlerini arayınız 444 555 99622");
					// System.exit(0);
					break;
				}
				attempt--;
			}
		}
		
		return result;
	}
	
	public void allMethod() {
		Scanner klavye = new Scanner(System.in);
		// composition
		// 1
		Bank bank = new Bank("1", "Halkbank", "İstanbul", "Logo4");
		// bank.setMoneyList(new ArrayList<MoneyWallet>());
		
		// N
		MoneyWallet moneyWallet = new MoneyWallet("2", "kağıt", MoneyCurrency.TR.name(), 25000.0);
		moneyWallet.setBank(bank);
		moneyWallet.getBank().getMoneyList().add(moneyWallet);
		
		while (true) {
			String key = scannerValue();
			switch (key) {
				case "1": {
					System.out.println("Toplam para");
					showMoney();
					break;
				}
				case "2": {
					System.out.println("Para ekleme");
					addMoney();
					break;
				}
				case "3": {
					System.out.println("Para çekme");
					reduceMoney();
					break;
				}
				case "4": {
					System.out.println("\nEft işlemi");
					double eft = klavye.nextDouble();
					sendEftMoney();
					break;
				}
				case "5": {
					System.out.println("\nHavale işlemi");
					double havale = klavye.nextDouble();
					sendHavaleMoney();
					break;
				}
				case "6": {
					System.out.println("\nMail adresinizi giriniz");
					String email = klavye.nextLine();
					fakeMail(email);
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
	}
	
	public double moneyAmount() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("miktarı giriniz");
		moneyAmount = klavye.nextDouble();
		return moneyAmount;
	}
	
	// interface içini dolduracağım metotlar
	@Override
	public void addMoney() {
		double money = moneyAmount();
		this.moneyAmount += money;
		System.out.println("Para Miktarı: " + getMoneyAmount());
	}
	
	@Override
	public void reduceMoney() {
		
		double money = moneyAmount();
		this.moneyAmount -= money;
		System.out.println("Para Miktarı: " + getMoneyAmount());
		
	}
	
	@Override
	public void sendHavaleMoney() {
		Bank bank = new Bank();
		for (Object temp : bank.bankHavaleSerial) {
			System.out.println(temp);
		}
		moneyAmount = moneyAmount - moneyAmount();
		System.out.println("Para Miktarı: " + getMoneyAmount());
	}
	
	@Override
	public void sendEftMoney() {
		Bank bank = new Bank();
		for (Object temp : bank.bankEftSerial) {
			System.out.println(temp);
		}
		System.out.println(moneyAmount() + "kadar Eft gönderildi");
		moneyAmount = moneyAmount - moneyAmount();
		System.out.println("Para Miktarı: " + getMoneyAmount());
		
	}
	
	@Override
	public void fakeMail(String emailAddress) {
		System.out.println("Mailiniz gönderiliyor");
		
	}
	
	@Override
	public void showMoney() {
		System.out.println("paranız toplam tutarı: " + getMoneyAmount());
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
