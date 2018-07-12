package com.mahendra;

public class SimpleInterestCalculator extends InterestCalculator {

	public SimpleInterestCalculator(float principle, float rate, float duration) {
		super(principle, rate, duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calc() {
		
		return principle*rate/100/12*duration;
	}

}
