package com.bilgeadam.a022.collections.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@NonNull
public class FilterStudent {
	
	private String adi;
	private String renk;
}
