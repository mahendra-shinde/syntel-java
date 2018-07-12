package com.mahendra;

public class TestDate1 {

	public static void main(String[] args) {
		Date d1 = new Date(29,2,2007);
		Date d2 = new Date(10,7,2018);
		System.out.println("Date : "+d1);
		System.out.println("Date : "+d2);
		
		System.out.println("Todays is "+Date.now);
		
		Date.seperator="-";
		System.out.println("Date : "+d1);
		System.out.println("Date : "+d2);
		
		Date.seperator=", ";
		System.out.println("Date : "+d1);
		System.out.println("Date : "+d2);
		
	}

}
