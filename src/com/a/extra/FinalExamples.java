package com.a.extra;

// deðiþken final : sabitler yani buna yeni deðerler atamayýz
// metot final : @Override
// class final: extends yapamayýz

// POJO
public class FinalExamples {
	
	private String adi;
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public static void main(String[] args) {
		final int sayi = 55;
		// sayi = 66;
		System.out.println(sayi);
	}
}
