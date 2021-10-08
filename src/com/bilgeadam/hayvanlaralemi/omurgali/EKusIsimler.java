package com.bilgeadam.hayvanlaralemi.omurgali;

public enum EKusIsimler {
	// kuş: papagan,serce,muhabbetkuşu,kartal,atmaca
	PAPAGAN(1, "papagan"), SERCE(2, "serce"), MUHABBET(3, "Muhabbet"), KARTAL(4, "kartal"), ATMACA(5, "Atmaca");
	
	private final int id;
	private final String kusAdi;
	
	private EKusIsimler(int id, String kusAdi) {
		this.id = id;
		this.kusAdi = kusAdi;
	}
	
}
