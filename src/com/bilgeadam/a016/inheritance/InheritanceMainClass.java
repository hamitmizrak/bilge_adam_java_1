package com.bilgeadam.a016.inheritance;

public class InheritanceMainClass {
	
	public static void main(String[] args) {
		MsiComputer msiComputer = new MsiComputer();
		msiComputer.setComputerName("Msi");
		msiComputer.setComputerMainCart("msi main cart");
		System.out.println(msiComputer);
		msiComputer.deneme(); // polymorphism
		
		System.out.println("///////////////////////////////////////////////");
		
		AsusComputer asusComputer = new AsusComputer();
		asusComputer.setComputerName("asus");
		asusComputer.setComputerMainCart("asus main cart");
		System.out.println(asusComputer);
		asusComputer.deneme();// polymorphism
		
		System.out.println("///////////////////////////////////////////////");
		
		MonsterComputer monsterComputer = new MonsterComputer();
		monsterComputer.setComputerName("monster");
		monsterComputer.setComputerMainCart("monster main cart");
		System.out.println(monsterComputer);
		monsterComputer.deneme();// polymorphism
		
		System.out.println("///////////////////////////////////////////////");
		
	}
	
}
