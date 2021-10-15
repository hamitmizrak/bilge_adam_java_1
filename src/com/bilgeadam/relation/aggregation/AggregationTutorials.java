package com.bilgeadam.relation.aggregation;

public class AggregationTutorials {
	// Ýliþki tek yönlüyse
	// iki yapý arasýnda:
	// bir bileþen olmazsa yaþayabilir mi
	// baðýmsýz: baðýmlý
	// anne:
	// çocuk: x
	// çocuk anneye baðlý
	// baðlý: çocuk
	// baðýmsýz:anne
	
	// pi*r*r
	
	public static void main(String[] args) {
		Daire daire = new Daire();
		double sonuc = daire.daireAlanHesabi(10);
		System.out.println(sonuc);
	}
}
