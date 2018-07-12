package com.mahendra.dao;

import com.mahendra.models.Person;

public class PersonDAOMemoryImpl implements PersonDAO {

	
	private static final int MAX_SIZE=100;
	
	private Person[] people = new Person[MAX_SIZE];
	private int count=0;
	
	@Override
	public void save(Person p) {
		if(count>=MAX_SIZE) {
			System.out.println("Can't add more people!");
			return;
		}
		people[count++]=p;
	}

	@Override
	public Person findByName(String name) {
		for(int i=0;i<count;i++) {
			Person p = people[i];
			if(p.getFirstName().equalsIgnoreCase(name) || p.getLastName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Person[] getAllPeople() {
		Person[] temp = new Person[count];
		System.arraycopy(people, 0, temp, 0, count);
		return temp;
	}

}
