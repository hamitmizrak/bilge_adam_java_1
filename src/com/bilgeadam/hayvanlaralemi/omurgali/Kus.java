package com.bilgeadam.hayvanlaralemi.omurgali;

import com.bilgeadam.hayvanlaralemi.GenelOzellikler;

public class Kus extends GenelOzellikler implements IOmurgali {
	// sadece kuşlara özgü özellikler
	private String yumurta;
	
	// parametresiz constructor
	public Kus() {
		
	}
	
	// parametreli constructor
	public Kus(String adi, String ureme, String tuketim, String hareket, String yumurta) {
		super(adi, ureme, tuketim, hareket);
		this.yumurta = yumurta;
	}
	
	// toString
	@Override
	public String toString() {
		return "Kus [yumurta=" + yumurta + ", getAdi()=" + getAdi() + ", getUreme()=" + getUreme() + ", getTuketim()="
				+ getTuketim() + ", getHareket()=" + getHareket() + "]";
	}
	
	// Method
	
	@Override
	public void omurgali() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sicakKanli() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void kapaliDolasim() {
		// TODO Auto-generated method stub
		
	}
	
	// getter and setter
	public String getYumurta() {
		return yumurta;
	}
	
	public void setYumurta(String yumurta) {
		this.yumurta = yumurta;
	}
	
}
