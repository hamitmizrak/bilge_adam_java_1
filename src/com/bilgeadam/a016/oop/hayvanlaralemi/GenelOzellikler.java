package com.bilgeadam.a016.oop.hayvanlaralemi;

public class GenelOzellikler {
	// özellikler
	protected String ureme;
	protected String tuketim;
	protected String hareket;
	protected String adi;
	
	// parametresiz constructor
	public GenelOzellikler() {
		
	}
	
	// parametreli constructor
	public GenelOzellikler(String ureme, String tuketim, String hareket, String adi) {
		this.ureme = ureme;
		this.tuketim = tuketim;
		this.hareket = hareket;
		this.adi = adi;
	}
	
	// toString
	@Override
	public String toString() {
		return "GenelOzellikler [ureme=" + ureme + ", adi=" + adi + ", tuketim=" + tuketim + ", hareket=" + hareket
				+ "]";
	}
	// getter and setter
	
	public String getUreme() {
		return ureme;
	}
	
	public void setUreme(String ureme) {
		this.ureme = ureme;
	}
	
	public String getTuketim() {
		return tuketim;
	}
	
	public void setTuketim(String tuketim) {
		this.tuketim = tuketim;
	}
	
	public String getHareket() {
		return hareket;
	}
	
	public void setHareket(String hareket) {
		this.hareket = hareket;
	}
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
}
