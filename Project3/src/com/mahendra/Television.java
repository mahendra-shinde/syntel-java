package com.mahendra;

public class Television implements Electronics {

	@Override
	public void turnOn() {
		System.out.println("Switch On TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Switch Off TV");
	}

}
