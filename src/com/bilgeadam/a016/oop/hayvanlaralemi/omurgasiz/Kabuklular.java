package com.bilgeadam.a016.oop.hayvanlaralemi.omurgasiz;

import com.bilgeadam.a016.oop.hayvanlaralemi.GenelOzellikler;

public class Kabuklular extends GenelOzellikler implements IOmurgasiz {
	
	// Genel özellikler
	private String disIskelet;
	
	// parametresiz constructor
	public Kabuklular() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public Kabuklular(String adi, String ureme, String tuketim, String hareket, String disIskelet) {
		super(adi, ureme, tuketim, hareket);
		this.disIskelet = disIskelet;
	}
	
	// Omurgasız toString
	
	// Methodlar
	@Override
	public String toString() {
		return "Kabuklular [disIskelet=" + "adi=" + getAdi() + disIskelet + ", ureme=" + ureme + ", tuketim=" + tuketim
				+ ", hareket=" + hareket + "]";
	}
	
	@Override
	public void omurgalisiz() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sogukKanli() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void acikDolasim() {
		// TODO Auto-generated method stub
		
	}
	
	// getter and setter
	public String getDisIskelet() {
		return disIskelet;
	}
	
	public void setDisIskelet(String disIskelet) {
		this.disIskelet = disIskelet;
	}
	
}
