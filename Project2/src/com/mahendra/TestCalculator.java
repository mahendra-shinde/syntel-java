package com.mahendra;

public class TestCalculator {
	public static void main(String[] args) {
		InterestCalculator calc = new SimpleInterestCalculator(150000, 12.24F, 60);
		float interest = calc.calc();
		System.out.println("Interest : " + interest);
	}
}
