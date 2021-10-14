package com.a.kutuphane.lombokkutup;

import java.util.Objects;

// 109 satırlık
public class NormalClassTutorials {
	private int id;
	private String adi;
	private String soyadi;
	private String numarasi;
	private String memleket;
	private String sehir;
	private String tarih;
	
	public NormalClassTutorials() {
		// TODO Auto-generated constructor stub
	}
	
	public NormalClassTutorials(int id, String adi, String soyadi, String numarasi, String memleket, String sehir,
			String tarih) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.numarasi = numarasi;
		this.memleket = memleket;
		this.sehir = sehir;
		this.tarih = tarih;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(adi, id, memleket, numarasi, sehir, soyadi, tarih);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NormalClassTutorials other = (NormalClassTutorials) obj;
		return Objects.equals(adi, other.adi) && id == other.id && Objects.equals(memleket, other.memleket)
				&& Objects.equals(numarasi, other.numarasi) && Objects.equals(sehir, other.sehir)
				&& Objects.equals(soyadi, other.soyadi) && Objects.equals(tarih, other.tarih);
	}
	
	@Override
	public String toString() {
		return "NormalClass [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", numarasi=" + numarasi
				+ ", memleket=" + memleket + ", sehir=" + sehir + ", tarih=" + tarih + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	public String getNumarasi() {
		return numarasi;
	}
	
	public void setNumarasi(String numarasi) {
		this.numarasi = numarasi;
	}
	
	public String getMemleket() {
		return memleket;
	}
	
	public void setMemleket(String memleket) {
		this.memleket = memleket;
	}
	
	public String getSehir() {
		return sehir;
	}
	
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	
	public String getTarih() {
		return tarih;
	}
	
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
	
}
