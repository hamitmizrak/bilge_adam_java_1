package com.bilgeadam.clientserver2;

public class DegismeyenClass {
	public static int counter = 0;
	
	public int sumCounter = 0;
	
	public DegismeyenClass() {
		counter++;
		sumCounter = counter;
	}
	
	@Override
	public String toString() {
		return "DegismeyenClass [sumCounter=" + sumCounter + "]";
	}
	
	public static void main(String[] args) {
		DegismeyenClass class1 = new DegismeyenClass();
		System.out.println(class1);
		
		DegismeyenClass class2 = new DegismeyenClass();
		System.out.println(class2);
		
		DegismeyenClass class3 = new DegismeyenClass();
		System.out.println(class3);
		
	}
	
}
