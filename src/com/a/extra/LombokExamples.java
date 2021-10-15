package com.a.extra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter setter equals hashcode
@NoArgsConstructor // parametresiz
@AllArgsConstructor
@Builder
public class LombokExamples {
	
	private String name;
	private String surname;
	
	public static void main(String[] args) {
		LombokExamples lombokExamples = new LombokExamples().builder().surname("Mýzrak").build();
		System.out.println(lombokExamples);
		// lombokExamples.setName( "Hamit");
	}
	
}
