package com.bilgeadam.relation.assosication;

public class AssosicationTutorials {
	// Classlar biribirinden baðýmsýz olmasý
	// aralarýndaki baðlantýsý zayýf
	
	// 1 Banka olmazsa insan yaþar mý
	// 1 Ýnsan olmazsa banka yaþar mý
	
	public static void main(String[] args) {
		Bank bank = new Bank("xyz bank", "Ankara");
		Employee employee = new Employee("Adým", "Soyadým");
		
		System.out.println(bank.getBankName() + " adlý bankanýn:  " + employee.getEmployeeName());
	}
	
}
