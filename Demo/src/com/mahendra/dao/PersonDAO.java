package com.mahendra.dao;

import com.mahendra.models.Person;

public interface PersonDAO {
	void save(Person p);
	Person findByName(String name);
	Person[] getAllPeople();
}
