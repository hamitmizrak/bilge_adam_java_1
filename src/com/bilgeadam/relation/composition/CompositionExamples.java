package com.bilgeadam.relation.composition;

import java.util.ArrayList;

public class CompositionExamples {
	/*
	 * 2 objede birbirine körü körüne baðlý
	 * biri olmadan diðer yaþayamýyor.
	 */
	
	// 1 avm n dükkan
	// Avm
	// Dükkan
	
	// kitap yazar
	
	public static void main(String[] args) {
		// 1
		Avm avm = new Avm("avm adi", "Nevþehir");
		avm.setDukkanList(new ArrayList<Dukkan>());
		System.out.println(avm);
		System.out.println("*************************************************************************************");
		
		// N
		Dukkan dukkan = new Dukkan("elektronik dükkan", "Beyaz eþya");
		dukkan.setAvm(avm);
		dukkan.getAvm().getDukkanList().add(dukkan);
		
		Dukkan dukkan2 = new Dukkan("restaurant dükkan", "Ýskender");
		dukkan2.setAvm(avm);
		dukkan2.getAvm().getDukkanList().add(dukkan2);
		
		for (Object temp : dukkan.getAvm().dukkanList) {
			System.out.println(temp);
		}
		
		System.out.println("***************************************************************************************");
	}
	
}
