package com.mahendra.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import com.mahendra.models.Person;

public class PersonDAOFileImpl implements PersonDAO{
	private static final String FILE_PATH="/home/mahendra/Desktop/people.txt";
	
	@Override
	public void save(Person p){
		try (PrintWriter out = new PrintWriter(new FileOutputStream(FILE_PATH,true))){
			out.println(p.getFirstName()+", "+p.getLastName()+", "+p.getAge());
		}catch(IOException ex) {
			System.out.println("Could not write data to file "+ex.getMessage());
		}
	}

	@Override
	public Person findByName(String name) {
		Person people[] = getAllPeople();
		for(Person p : people) {
			if(p.getFirstName().equalsIgnoreCase(name)|| p.getLastName().equalsIgnoreCase(name)) {
				return p;
			}
		}
		return null;
	}
	
	@Override
	public Person[] getAllPeople() {
		List<Person> people = new ArrayList<>();	
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){
			String line = br.readLine();
			while(line!=null) {
				String[] fields = line.split(",");
				int age = Integer.parseInt(fields[2].trim());
				Person p = new Person(fields[0].trim(),fields[1].trim(),age);
				people.add(p);
				
				line = br.readLine();
			}
		}catch(IOException ex) {
			System.out.println("No data found! "+ex.getMessage());
		}
		return people.toArray(new Person[people.size()]);
	}

}
