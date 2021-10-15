package HamitMizrakBilgeAdamUtils;

import java.util.UUID;

public class RandomUUIDExamples {
	public static void main(String[] args) {
		// 32 hexadecimal:16 tabanýnda þifre
		// 16 ^32
		// 16*16*16
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		
	}
}
