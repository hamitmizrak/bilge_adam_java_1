package com.a.kutuphane.lombokkutup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LombokClassTutorials {
	
	private int id;
	private String adi;
	private String soyadi;
	private String numarasi;
	private String memleket;
	private String sehir;
	private String tarih;
	
	// Avm avm=new Avm("İstanbul Avm,"asd");
	// avm
	
	// Store store=new Store("asd","sdfsdf","sdfsdf");
	
	//
	
}
