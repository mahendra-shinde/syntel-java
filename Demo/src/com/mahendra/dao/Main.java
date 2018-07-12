package com.mahendra.dao;

import com.mahendra.models.Person;

public class Main {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAOFactory().getPeopleDAOImpl();
		
		//Try adding few records
		
		dao.save(new Person("Sylvester","Stallon",69));
		dao.save(new Person("Tom","Hanks",74));
		dao.save(new Person("Vin","Diesel",62));
		
		//search for any one with name "diesel"
		Person p = dao.findByName("diesel");
		if(p!=null)
			System.out.println("Found diesel: "+p.getFirstName()+" "+p.getLastName());
		else
			System.out.println("Nobody with that name on our list!");
	}

}
