package com.bilgeadam.a016.oop.atm2;

import java.util.ArrayList;
import java.util.List;

// özellikler
// Parametresiz constructor
// Parametreli constructor
// toString
// Method
// Getter and setter

// 1

public class Bank extends CommonProperty {
	// özellikler
	protected String bankName;
	protected String bankCityName;
	protected String bankLogo;
	
	// banka Eft class
	protected java.util.List<Eft> bankEftSerial;
	
	// banka Havale class
	// listemde birden fazla Havale yapılacağını söylüyor.
	protected List<Havale> bankHavaleSerial;
	
	// composition
	// empati kurmamız
	protected List<MoneyWallet> moneyList;
	
	// Parametresiz constructor
	// Null Pointer Exception
	public Bank() {
		// Null Pointer Exception
		moneyList = new ArrayList<MoneyWallet>();
		
		// fake information
		bankHavaleSerial = new ArrayList<Havale>();
		bankHavaleSerial.add(new Havale("1", "havale1 seri140", "5000"));
		bankHavaleSerial.add(new Havale("2", "havale2 seri150", "6000"));
		bankHavaleSerial.add(new Havale("3", "havale3 seri160", "7000"));
		bankHavaleSerial.add(new Havale("4", "havale4 seri170", "8000"));
		
		bankEftSerial = new ArrayList<Eft>();
		bankEftSerial.add(new Eft("1", "eft1 seri141", "2000"));
		bankEftSerial.add(new Eft("2", "eft2 seri142", "3000"));
		bankEftSerial.add(new Eft("3", "eft3 seri143", "4000"));
		bankEftSerial.add(new Eft("4", "eft4 seri144", "5000"));
	}
	
	// Parametreli constructor
	public Bank(String id, String bankName, String bankCityName, String bankLogo) {
		super(id);
		this.bankName = bankName;
		this.bankCityName = bankCityName;
		this.bankLogo = bankLogo;
		
		moneyList = new ArrayList<MoneyWallet>();
		
		bankHavaleSerial = new ArrayList<Havale>();
		bankHavaleSerial.add(new Havale("1", "havale1 seri140", "5000"));
		bankHavaleSerial.add(new Havale("2", "havale2 seri150", "6000"));
		bankHavaleSerial.add(new Havale("3", "havale3 seri160", "7000"));
		bankHavaleSerial.add(new Havale("4", "havale4 seri170", "8000"));
		
		bankEftSerial = new ArrayList<Eft>();
		bankEftSerial.add(new Eft("1", "eft1 seri141", "2000"));
		bankEftSerial.add(new Eft("2", "eft2 seri142", "3000"));
		bankEftSerial.add(new Eft("3", "eft3 seri143", "4000"));
		bankEftSerial.add(new Eft("4", "eft4 seri144", "5000"));
	}
	
	// toString
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCityName=" + bankCityName + ", bankLogo=" + bankLogo + "]";
	}
	
	// Method
	// Getter and setter
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCityName() {
		return bankCityName;
	}
	
	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}
	
	public String getBankLogo() {
		return bankLogo;
	}
	
	public void setBankLogo(String bankLogo) {
		this.bankLogo = bankLogo;
	}
	
	public java.util.List<Eft> getBankEftSerial() {
		return bankEftSerial;
	}
	
	public void setBankEftSerial(java.util.List<Eft> bankEftSerial) {
		this.bankEftSerial = bankEftSerial;
	}
	
	public List<Havale> getBankHavaleSerial() {
		return bankHavaleSerial;
	}
	
	public void setBankHavaleSerial(List<Havale> bankHavaleSerial) {
		this.bankHavaleSerial = bankHavaleSerial;
	}
	
	public List<MoneyWallet> getMoneyList() {
		return moneyList;
	}
	
	public void setMoneyList(List<MoneyWallet> moneyList) {
		
		this.moneyList = moneyList;
	}
	
}
