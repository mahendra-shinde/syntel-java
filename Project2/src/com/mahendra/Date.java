package com.mahendra;

public class Date {

	// Static block is called AFTER class is loaded into memory
	// And before even FIRST object is created!
	static {
		java.util.Date temp = new java.util.Date();
		System.out.println("Obtaining current system date!");
		now = new Date(temp.getDate(), temp.getMonth() + 1, temp.getYear());
	}

	public static Date now;

	private int day = 1, month = 1, year = 2018;
	private int maxDays = 31;
	public static String seperator = "/";

	public Date(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		if (this.month == 2) {
			if (isLeapYear(this.year)) {
				maxDays = 29;
			} else
				maxDays = 28;
		} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			maxDays = 30;
		}
		setDay(day);
	}

	private boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} else
			return false;
	}

	/**
	 * Set a Day, Max value 31 and min is 1
	 * 
	 * @param day
	 */
	private void setDay(int day) {
		if (day <= maxDays && day > 0)
			this.day = day;
	}

	/**
	 * Set a Month, Max value 12, min value 1
	 * 
	 * @param month
	 */
	private void setMonth(int month) {
		if (month < 13 && month > 0)
			this.month = month;
	}

	/**
	 * Set a Year. Max Value 2100 and Min value is 2001
	 * 
	 * @param year
	 */
	private void setYear(int year) {
		if (year < 2100 && year > 2000)
			this.year = year;
	}

	public String toString() {
		return day + seperator + month + seperator + year;
	}
}
