package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiTuto {
	public static void main(String[] args) {
		
		String[] dizi = { "Adana", "Denizli", "Malatya" };
		
		List<Computer> list = new ArrayList<Computer>();
		list.add(new Computer(1, "msi"));
		list.add(new Computer(2, "msi2"));
		list.add(new Computer(3, "monster"));
		list.add(new Computer(4, "lenovo"));
		list.add(new Computer(5, "samsung"));
		
		/////////////////////////////////////// lambda function////////////
		// () -> {}
		
		/////////////////////////////////////// forEach ////////////////////
		// list.stream().forEach(System.out::println);
		// System.out.println("-------------------------------");
		// list.stream().forEach(temp -> System.out.println(temp));
		// list.stream().forEach(temp -> System.out.println(temp.toString()));
		// list.stream().forEach((temp) -> { System.out.println(temp.toString()); } );
		// System.out.println("-------------------------------");
		// list.stream().forEach(temp -> temp.computerMethod());
		// list.stream().forEach(Computer::computerMethod); // method reference
		
		/////////////////////////////////////// filter ////////////////////
		// filter: listeden filtreleme işlemi yaparak çıkarmak işlemidir.
		System.out.println("****");
		
		// count() ==> sayısını bana verir
		// long sayi = list.stream().filter(temp -> temp.getId() > 2).count();
		// System.out.println(sayi);
		
		// collect() ==> Filterelenmiş elemanları yeni bir listede göstermek istersek
		// List<Computer> hepList = list.stream().filter(temp -> temp.getId() % 2 ==
		// 0).collect(Collectors.toList());
		// hepList.stream().forEach(System.out::println);
		// list.stream().forEach(temp -> {System.out.println(temp + " ");});
		
		/////////////////////////////////////// Map ////////////////////
		// map(): var olan listeyi değişiklik yaparak yeni bir listeye göndermeye yarar.
		List<Computer> mapim = list.stream()
				.map(temp -> new Computer(temp.getId() + 5, temp.getComputerName().concat("sona eklendi")))
				.collect(Collectors.toList());
		
		mapim.stream().forEach(System.out::print);
		
		/////////////////////////////////////// Collect ////////////////////
		// collect: cast yapmaya yarar
		Map<Integer, String> mapCast = list.stream()
				.collect(Collectors.toMap(temp -> temp.getId(), temp -> temp.getComputerName()));
		
		mapCast.forEach((key, value) -> System.out.println("key: " + key + " value:" + value));
	}
}
