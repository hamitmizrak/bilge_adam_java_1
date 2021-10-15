package com.bilgeadam.relation.assosication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bank {
	
	private String bankName;
	private String bankAddress;
}
