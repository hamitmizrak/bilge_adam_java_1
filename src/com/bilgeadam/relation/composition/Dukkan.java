package com.bilgeadam.relation.composition;

import java.io.Serializable;

// N
public class Dukkan implements Serializable {
	
	private static final long serialVersionUID = -6556645486317335787L;
	
	private String dukkanAdi;
	private String dukkanMalzemesi;
	
	// composition
	private Avm avm;
	
	public Dukkan() {
	}
	
	public Dukkan(String dukkanAdi, String dukkanMalzemesi) {
		this.dukkanAdi = dukkanAdi;
		this.dukkanMalzemesi = dukkanMalzemesi;
	}
	
	public Dukkan(String dukkanAdi, String dukkanMalzemesi, Avm avm) {
		this.dukkanAdi = dukkanAdi;
		this.dukkanMalzemesi = dukkanMalzemesi;
		this.avm = avm;
	}
	
	@Override
	public String toString() {
		return "Dukkan [dukkanAdi=" + dukkanAdi + ", dukkanMalzemesi=" + dukkanMalzemesi + ", avm=" + avm
				+ ", getAvm()=" + getAvm() + "]";
	}
	
	public String getDukkanAdi() {
		return dukkanAdi;
	}
	
	public void setDukkanAdi(String dukkanAdi) {
		this.dukkanAdi = dukkanAdi;
	}
	
	public String getDukkanMalzemesi() {
		return dukkanMalzemesi;
	}
	
	public void setDukkanMalzemesi(String dukkanMalzemesi) {
		this.dukkanMalzemesi = dukkanMalzemesi;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Avm getAvm() {
		return avm;
	}
	
	public void setAvm(Avm avm) {
		this.avm = avm;
	}
	
}
