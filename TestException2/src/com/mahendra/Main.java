package com.mahendra;

public class Main {

	public static void main(String[] args) {
		PersonUtil util = new PersonUtil();
		
		try {
			util.addPerson();
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
