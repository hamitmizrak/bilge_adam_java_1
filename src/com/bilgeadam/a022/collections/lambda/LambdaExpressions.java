package com.bilgeadam.a022.collections.lambda;
// Lombok

// Lambda Expression
// lambda: kodlar yazarken hızlı kod yazmak için kullanıyoruz.
// lambda tek başına bir şey ifade etmez
// lambda interface
// ()->{ System.out.println("Deneme"); }
// list,dizilerde

// Java 8: @FunctionalInterface

public class LambdaExpressions {
	
	// ne zaman bize lambda lazım olur o zaman kendi lambda yazıyoruz.
	// sadece 1 tane gövdesiz metot yazabilirsiniz
	// returnlu,returnsuz
	@FunctionalInterface
	interface IZorunlu44 {
		public int deneme44();
	}
	
	public void deneme() {
		System.out.println("Deneme");
	}
	
	public static void main(String[] args) {
		// anonymous method
		// implement yapmadan interface çağırdım
		IZorunlu44 zorunlu44 = new IZorunlu44() {
			@Override
			public int deneme44() {
				System.out.println("Deneme 44");
				return 4;
			}
		};
		zorunlu44.deneme44();
		
		// Lambda ile gösterimi
		IZorunlu44 zorunlu55 = () -> {
			return 44;
			// System.out.println("Merhabalar ben Lambdayım");
		};
		zorunlu55.deneme44();
	}
	
}
