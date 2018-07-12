package com.mahendra.dao;

public class PersonDAOFactory {
	
	public PersonDAO getPeopleDAOImpl() {
		return new PersonDAOMemoryImpl();
	}

}
