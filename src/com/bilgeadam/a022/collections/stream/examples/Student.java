package com.bilgeadam.a022.collections.stream.examples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

// 1.5 anotation
@NonNull
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String adi;
	private String soyadi;
}
