package HamitMizrakBilgeAdamUtils;

// 4 * 2 =16
public class Monad {
	
	public static int sayi(int temp) {
		return temp;
	}
	
	public static double uslu(int temp) {
		
		return Math.pow(temp, 2);
	}
	
	public static void main(String[] args) {
		System.out.println(4 * 4);
		
		// Metotu metot icinde kullanmaya denir
		double result = uslu(sayi(4));
		System.out.println(result);
		
	}
	
}
