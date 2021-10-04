package com.bilgeadam.a013.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// kullanıcı taradından girilen isimleri random 3'erli sıralayan algoritma

public class Array_Examples_6_Gruplama {
	
	public static void groupTeam() {
		Map<Integer, String> listem = new HashMap<Integer, String>();
		Set<Integer> set = new LinkedHashSet<Integer>();
		List<String> randomList = new ArrayList<String>();
		Random random = new Random();
		
		listem.put(1, "Hamit1");
		listem.put(2, "Hamit2");
		listem.put(3, "Hamit3");
		listem.put(4, "Hamit4");
		listem.put(5, "Hamit5");
		listem.put(6, "Hamit6");
		listem.put(7, "Hamit7");
		
		int[] dizi = new int[16];
		for (int i = 0; i < dizi.length; i++) {
			int temp = random.nextInt();
			set.add(temp);
			
			Iterator ite = set.iterator();
			while (ite.hasNext()) {
				dizi[i] = (int) ite.next();
				
			}
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		// for (int i = 0; i < listem.size(); i++) {
		// int temp = random.nextInt(listem.size()) + 1;
		//
		// set.add(temp);
		// }
		//
		// System.out.println("asd: " + listem.get(temp));
		
		// Iterator ite = set.iterator();
		// while (ite.hasNext()) {
		// randomList.add(listem.get(ite.next()));
		//
		// }
		
		// listem.entrySet().forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		groupTeam();
	}
}
