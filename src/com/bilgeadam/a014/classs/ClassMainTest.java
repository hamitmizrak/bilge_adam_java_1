package com.bilgeadam.a014.classs;
// System.gc();
// ClassTutorials class1;
// class1 = new ClassTutorials();

// class adını bize gösterir
// System.out.println(class2.getClass());
public class ClassMainTest {
	
	public static void main(String[] args) {
		
		// static yapının önemi: new oluşturmadan erişim sağlamak
		ClassTutorials.telephoneTrade = "asd";
		
		// intance:örnekleme(new)
		ClassTutorials class2 = new ClassTutorials();
		class2.setTelephonePrice(14000.0);
		System.out.println(class2.getTelephonePrice());
		
	}
	
}
