package com.bilgeadam.clientserver.twoway;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
	
	private List<Person> personList;
	
	public PersonList() {
		personList = new ArrayList<Person>();
		personList.add(new Person(1, "Hamit", "Mýzrak"));
		personList.add(new Person(2, "Mehmet", "Mýzrak"));
	}
	
	// getter and setter
	public List<Person> getPersonList() {
		return personList;
	}
	
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	public static void main(String[] args) {
		List<PersonList> listem = new ArrayList<PersonList>();
		
		for (Person temp : listem.get(0)) {
			
		}
	}
	
}
