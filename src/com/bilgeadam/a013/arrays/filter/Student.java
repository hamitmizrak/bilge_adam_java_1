package com.bilgeadam.a013.arrays.filter;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1738740262544926153L;
	
	private int id;
	private String adi;
	private String soyadi;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String adi, String soyadi) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + "]";
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
	
}
