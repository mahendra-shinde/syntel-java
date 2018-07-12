package com.mahendra;

import java.util.Scanner;

public class PersonUtil {
	
	public void addPerson() throws InvalidAgeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		if(age<1 || age>100) {
			throw new InvalidAgeException();
		}
		
	}
	
}
