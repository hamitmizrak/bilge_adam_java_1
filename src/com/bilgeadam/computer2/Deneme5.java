package com.bilgeadam.computer2;

// POJO
public class Deneme5 {
	private String name;
	
	private Deneme5() {
		// TODO Auto-generated constructor stub
	}
	
	private Deneme5(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Deneme5 deneme5 = new Deneme5();
		System.out.println(deneme5);
	}
	
}
