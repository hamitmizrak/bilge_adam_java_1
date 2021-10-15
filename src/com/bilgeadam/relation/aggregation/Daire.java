package com.bilgeadam.relation.aggregation;

public class Daire {
	public double daireAlanHesabi(int r) {
		double pi = 3.14;
		Yaricap yaricap = new Yaricap();
		int result = yaricap.daire(r); // r/r
		return result * pi;
	}
}
