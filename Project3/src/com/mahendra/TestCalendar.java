package com.mahendra;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		Date dt = cal.getTime();
		System.out.println("Date now : "+dt);
		cal.set(1947, 7, 15, 0, 0, 0);
		System.out.println("Date then was :"+cal.getTime());
		
	}

}
